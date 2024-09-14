package com.poo.projeto.escola;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aluno extends Pessoa {

    private static Scanner leia = new Scanner(System.in);
    private static ArrayList<Aluno> alunos = new ArrayList<>();
    private List<Disciplina> disciplinas = new ArrayList<>();

    public Aluno(int id, String nome, String cpf) {
        super(id, nome, cpf);
    }

    public Aluno() {}

    public void adicionarNota(String nomeDisciplina, double valorNota) {
        Disciplina disciplina = null;
        for (Disciplina d : disciplinas) {
            if (d.getNome().equalsIgnoreCase(nomeDisciplina)) {
                disciplina = d;
                break;
            }
        }
        if (disciplina == null) {
            disciplina = new Disciplina(nomeDisciplina);
            disciplinas.add(disciplina);
        }
        disciplina.adicionarNota(valorNota);
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public static void cadAluno() {
        System.out.println("Digite o nome do(a) aluno(a) que deseja matricular: ");
        String nome = leia.nextLine();
        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        alunos.add(aluno);
        System.out.println("O aluno(a) " + aluno.getNome() + " foi cadastrado(a).");
    }

    public static void listarAlunos() {
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println((i + 1) + " - " + alunos.get(i).getNome());
        }
    }

    public static void deleteAluno() {
        listarAlunos();
        System.out.printf("\nInforme o(a) aluno(a) a ser excluído(a):\n");
        int i = leia.nextInt();
        if (i > 0 && i <= alunos.size()) {
            Aluno alunoRemovido = alunos.remove(i - 1);
            System.out.printf("Aluno(a) " + alunoRemovido.getNome() + " foi removido(a).");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public static void preCarregarAlunos() {
        alunos.add(new Aluno(1, "João", "123.456.789-00"));
        alunos.add(new Aluno(2, "Maria", "987.654.321-00"));
        alunos.add(new Aluno(3, "Pedro", "456.789.123-00"));
        alunos.add(new Aluno(4, "Paulo", "733.845.277-28"));
    }

    public static Aluno getAluno(int index) {
        if (index >= 0 && index < alunos.size()) {
            return alunos.get(index);
        }
        return null;
    }

    public static void listarNotasDeTodosAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println("Notas de " + aluno.getNome() + ":");
            for (Disciplina disciplina : aluno.getDisciplinas()) {
                System.out.println(disciplina);
            }
        }
    }
}
