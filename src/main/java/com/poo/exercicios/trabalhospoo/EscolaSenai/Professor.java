package com.poo.exercicios.trabalhospoo.EscolaSenai;
import java.util.ArrayList;
import java.util.Scanner;

public class Professor extends Pessoa {

    Scanner leia = new Scanner(System.in);
    private static ArrayList<Professor> professores = new ArrayList<>();

    public Professor(int id, String nome, String cpf) {
        super(id, nome, cpf);
    }

    public Professor(){}

    public static void cadProfessor() {

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o nome do(a) professor(a) que deseja adicionar: ");
        String nome = leia.nextLine();
        Professor professor = new Professor();
        professor.setNome(nome);
        professores.add(professor);
        System.out.print("O professor" + professor.getNome()+" foi cadastrado.");

    }

    public static void listarProfessores(){

        for (int i = 0; i < professores.size(); i++) {
        System.out.print((i+1) + " - " + professores.get(i).getNome());
        }
    }

    public static void deleteProfessor() {
        Scanner leia = new Scanner(System.in);

        listarProfessores();
        System.out.print("\nInforme o(a) professor(a) a ser excluído(a):\n");
        int i = leia.nextInt();
        professores.remove(i-1);
        System.out.print("Professor " + i + " foi removido.");

    }
    /*public static void lancarNota(){

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o id do aluno para lançar nota: ");
        int i = leia.nextInt();

        Aluno aluno = alunos.get(i-1);

        System.out.print("Digite a nota do aluno" + aluno.getNome());
        double nota = leia.nextDouble();
        
        Nota.nota.add(nota);

        System.out.print("Nota " + nota + " lançada para " + aluno.getNome());

    }*/

    public static void preCarregarProfessores() {
        professores.add(new Professor(1, "Arthur", "126877123-34"));
        professores.add(new Professor(2, "Roni", "12334512-22"));
        professores.add(new Professor(3, "Tiago", "345213987-00"));
    }
    public static void menuProfessor(){
        int opcao;
        do{
            System.out.print("--------------------------------");
            System.out.print("\n- SEJA BEM VINDO(A) AO MENU DO PROFESSOR -");
            System.out.print("\n--------------------------------\n");
            System.out.print("\nO que deseja fazer?");
            System.out.print("\n1- Lançar notas: ");
            System.out.println("\n0- Sair ");
            System.out.print("\nDigite uma opção: ");

            Scanner leia = new Scanner(System.in);            
            opcao = leia.nextInt();
            System.out.println("\n");

            switch (opcao) {
                case 1:
                    Nota.lancarNotas();
                    break;
            
                case 0:
                    System.out.println("Saindo...");              
                    break;
                
                default:
                    System.out.println("Opção inválida");
                    break;    
            }
        }while(opcao != 0);
    }
}