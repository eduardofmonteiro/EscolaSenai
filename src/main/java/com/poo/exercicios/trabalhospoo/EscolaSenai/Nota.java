package com.poo.exercicios.trabalhospoo.EscolaSenai;

import java.util.ArrayList;
import java.util.Scanner;

public class Nota {
    private Professor professor;
    private Aluno aluno;
    private double notaDisciplina;
    private static ArrayList<Nota> notas = new ArrayList<>();

    public Nota(){}


    public Nota(Professor professor, Aluno aluno,  double notaDisciplina){
        this.professor = professor;
        this.aluno = aluno;
        this.notaDisciplina = notaDisciplina;
    }

    public Professor getProfessor() {
        return professor;
    }
    
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAlunos(Aluno aluno) {
        this.aluno = aluno;
    }
    
    public double getDisciplina(){
        return notaDisciplina;
    }
    
    public void setDisciplina(double notaDisciplina) {
        this.notaDisciplina = notaDisciplina;        
    }
    
    public static void lancarNotas(){
        
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a nota do(a) aluno(a) que deseja lançar: ");
        double nota1 = leia.nextDouble();
        Nota nota = new Nota();
        nota.setDisciplina(nota1);
        notas.add(nota);
        System.out.println("A nota foi cadastrada.");
    }

    public static void listarNotas(){
        for (int i = 0; i < notas.size(); i++) {
            System.out.println((i+1) +" - " + notas.get(i).getDisciplina());
        }        
    }
}
