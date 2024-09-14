package com.poo.exercicios.trabalhospoo.EscolaSenai;
import java.util.Scanner;

//import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;


//import com.poo.exercicios.trabalhospoo.EscolaSenai.Disciplina;
//professor lançar nota
//aluno ver nota
//login
//criar menus

@SpringBootApplication
public class Trabalho1Application{
    public static void main(String[] args){
        Aluno.preCarregarAlunos();
        menu();        
    }    
    private static void menu(){
        
        Scanner leia = new Scanner(System.in);       
        
        System.out.print("Insira seu perfil (Professor/Aluno)");
        
        String opcao = leia.nextLine().toLowerCase();
        
        switch (opcao) {
            case "aluno":
                Aluno.menuAluno();
                break;                
            case "professor":
                Professor.menuProfessor();         
                break;
            default:
                break;
    
        }
    }        
}