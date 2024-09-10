package com.poo.exercicios.trabalhospoo.EscolaSenai;

public class Notas {
    private Professores professores;
    private Alunos alunos;
    private int atividades;
    private int trabalhos;
    private int provas;

    public Notas(Professores professores, Alunos alunos, int atividades, int trabalhos, int provas){
        this.professores = professores;
        this.alunos = alunos;
        this.atividades = atividades;
        this.trabalhos = trabalhos;
        this.provas = provas;

       }

    public Professores getProfessores() {
        return professores;
    }

    public void setProfessores(Professores professores) {
        this.professores = professores;
    }

    public Alunos getAlunos() {
        return alunos;
    }

    public void setAlunos(Alunos alunos) {
        this.alunos = alunos;
    }

    public int getAtividades() {
        return atividades;
    }

    public void setAtividades(int atividades) {
        this.atividades = atividades;
    }

    public int getTrabalhos() {
        return trabalhos;
    }

    public void setTrabalhos(int trabalhos) {
        this.trabalhos = trabalhos;
    }

    public int getProvas() {
        return provas;
    }

    public void setProvas(int provas) {
        this.provas = provas;
    }

}
