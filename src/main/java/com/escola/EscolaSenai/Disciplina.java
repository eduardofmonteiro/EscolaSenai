package com.poo.exercicios.trabalhospoo.EscolaSenai;

public class Disciplina extends Notas {
    /*double media;
    media = (atividades+trabalhos+provas)/2;*/
    private String nome;

    public Disciplina(Professores professores, Alunos alunos, int atividades, int trabalhos, int provas, String nome) {
        super(professores, alunos, atividades, trabalhos, provas);

        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
