package com.escola.escola_senai;

public class Disciplinas {

    private Notas nota;
    private Professores professor;
    private String nome;
    
    
    
    public Notas getNota() {
        return nota;
    }
    public void setNota(Notas nota) {
        this.nota = nota;
    }
    public Professores getProfessor() {
        return professor;
    }
    public void setProfessor(Professores professor) {
        this.professor = professor;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }



    public Disciplinas(Notas nota, Professores professor, String nome) {
        this.nota = nota;
        this.professor = professor;
        this.nome = nome;
    } 
}
