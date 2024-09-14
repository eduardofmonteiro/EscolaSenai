package com.poo.projeto.escola;

import java.util.ArrayList;
import java.util.Scanner;

public class Professor extends Pessoa {
    
    private static Scanner leia = new Scanner(System.in);
    private static ArrayList<Professor> professores = new ArrayList<>();

    public Professor(int id, String nome) {
        super(id, nome, nome);
    }

    public Professor() {}

    public static void cadProfessor() {
        System.out.print("Digite o nome do(a) professor(a) que deseja adicionar: ");
        String nome = leia.nextLine();
        Professor professor = new Professor();
        professor.setNome(nome);
        professores.add(professor);
        System.out.println("Professor(a) " + professor.getNome() + " foi cadastrado(a).");
    }

    public static void listarProfessores() {
        for (int i = 0; i < professores.size(); i++) {
            System.out.println((i + 1) + " - " + professores.get(i).getNome());
        }
    }

    public static void deleteProfessor() {
        listarProfessores();
        System.out.print("\nInforme o(a) professor(a) a ser excluído(a):\n");
        int i = leia.nextInt();
        if (i > 0 && i <= professores.size()) {
            Professor professorRemovido = professores.remove(i - 1);
            System.out.println("Professor(a) " + professorRemovido.getNome() + " foi removido(a).");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public static void preCarregarProfessores() {
        professores.add(new Professor(1, "Arthur"));
        professores.add(new Professor(2, "Roni"));
        professores.add(new Professor(3, "Tiago"));
    }

    public static void adicionarNota() {
        Aluno.listarAlunos();
        System.out.print("Selecione o número do(a) aluno(a) para adicionar a nota: ");
        int alunoIndex = leia.nextInt() - 1;
        Aluno aluno = Aluno.getAluno(alunoIndex);
        if (aluno != null) {
            System.out.print("Digite o nome da disciplina: ");
            String nomeDisciplina = leia.next();
            for (int i = 0; i < 2; i++) {
                System.out.print("Digite a nota " + (i + 1) + " a ser adicionada: ");
                double valorNota = leia.nextDouble();
                aluno.adicionarNota(nomeDisciplina, valorNota);
                System.out.println("Nota " + (i + 1) + " adicionada à disciplina " + nomeDisciplina + " do(a) aluno(a) " + aluno.getNome());
            }
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public static void verNotas() {
        Aluno.listarNotasDeTodosAlunos();
    }

    public static void listarNotasDeTodosAlunos() {
        throw new UnsupportedOperationException("Unimplemented method 'listarNotasDeTodosAlunos'");
    }
}
