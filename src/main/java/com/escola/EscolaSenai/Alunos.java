package com.poo.exercicios.trabalhospoo.EscolaSenai;

public class Alunos extends Pessoas {

    private int matricula;
    private String nomeMae;
    private String nomePai;

    public Alunos(int id, String nome, int cpf, String dataNascimento, String endereco, String telefone, int matricula, String nomeMae, String nomePai) {
        super(id, nome, cpf, dataNascimento, endereco, telefone);

        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    //métodos especificos -> fazem atividades, fazem provas, possuem um intervalo e levam 
    //atividades pra casa

}
