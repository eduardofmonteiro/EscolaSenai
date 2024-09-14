package com.poo.projeto.escola;

import java.util.Scanner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Trabalho1Application {
    public static void main(String[] args) {

        Aluno.preCarregarAlunos();
        Professor.preCarregarProfessores();

        Scanner leia = new Scanner(System.in);
        int opcao;

        do {
            System.out.print("--------------------------------\n");
            System.out.print(" - SEJA BEM VINDO(A) AO MENU -\n");
            System.out.print("--------------------------------\n");
            System.out.println("\nQuem está acessando?");
            System.out.println("1- Aluno");
            System.out.println("2- Professor");
            System.out.println("0- Sair\n");
            System.out.print("Digite uma opção: ");

            opcao = leia.nextInt();

            switch(opcao) {
                case 1:
                menuAluno(leia);
                break;
                
                case 2:
                menuProfessor(leia);
                break;
                
                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while(opcao != 0);
    }

    public static void menuProfessor(Scanner leia) {
        int opcao;
        do {
            System.out.print("-----------------------\n");
            System.out.print(" - MENU DO PROFESSOR -\n");
            System.out.print("-----------------------\n");
            System.out.println("\nO que deseja fazer?");
            System.out.println("1- Cadastrar novo aluno");
            System.out.println("2- Deletar aluno");
            System.out.println("3- Listar alunos");
            System.out.println("4- Adicionar nota a aluno");
            System.out.println("5- Ver notas dos alunos");
            System.out.println("0- Voltar\n");
            System.out.print("Digite uma opção: ");

            opcao = leia.nextInt();

            switch(opcao) {
                case 1:
                    Aluno.cadAluno();
                    break;

                case 2:
                    Aluno.deleteAluno();
                    break;

                case 3:
                    Aluno.listarAlunos();
                    break;

                case 4:
                    Professor.adicionarNota();
                    break;

                case 5:
                    Aluno.listarNotasDeTodosAlunos();
                    break;

                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while(opcao != 0);
    }

    public static void menuAluno(Scanner leia) {
        int opcao;
        do {
            System.out.print("-------------------\n");
            System.out.print(" - MENU DO ALUNO -\n");
            System.out.print("-------------------\n");
            System.out.println("\nO que deseja fazer?");
            System.out.println("1- Ver notas");
            System.out.println("0- Voltar\n");
            System.out.print("Digite uma opção: ");

            opcao = leia.nextInt();

            switch(opcao) {
                case 1:
                    Aluno.listarNotasDeTodosAlunos();
                    break;

                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while(opcao != 0);
    }
}
