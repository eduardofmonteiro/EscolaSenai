package com.escola.escola_senai;

public class Notas {

    private int nota;
    private Alunos aluno;
    private Disciplinas disciplina;
    
    
    public int getNota() {
        return nota;
    }
    public void setNota(int Notas) {
        Notas = nota;
    }
    public Alunos getAluno() {
        return aluno;
    }
    public void setAluno(Alunos aluno) {
        this.aluno = aluno;
    }
    public Disciplinas getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(Disciplinas disciplina) {
        this.disciplina = disciplina;
    }
    public Notas(int Notas, Alunos aluno, Disciplinas disciplina) {
        Notas = nota;
        this.aluno = aluno;
        this.disciplina = disciplina;
    }
}
