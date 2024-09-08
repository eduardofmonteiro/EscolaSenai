package com.escola.escola_senai;

public class Professores extends Pessoa{
    
    private Disciplinas disciplina;
    private String areaGraduacao;
    private double remuneracao; 


    public Disciplinas getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(Disciplinas disciplina) {
        this.disciplina = disciplina;
    }
    public String getAreaGraduacao() {
        return areaGraduacao;
    }
    public void setAreaGraduacao(String areaGraduacao) {
        this.areaGraduacao = areaGraduacao;
    }
    public double getRemuneracao() {
        return remuneracao;
    }
    public void setRemuneracao(double remuneracao) {
        this.remuneracao = remuneracao;
    }
    public Professores(int id, String nome, String cpf, String dataNascimento, Endereco endereco, String email,
        String telefone, Disciplinas disciplina, String areaGraduacao, double remuneracao) {
        super(id, nome, cpf, dataNascimento, endereco, email, telefone);
        this.disciplina = disciplina;
        this.areaGraduacao = areaGraduacao;
        this.remuneracao = remuneracao;
    }
}
