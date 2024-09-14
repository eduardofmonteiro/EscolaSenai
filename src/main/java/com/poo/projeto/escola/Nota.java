package com.poo.projeto.escola;

public class Nota {
    private double valor;
    private String disciplina;

    public Nota(double valor, String disciplina) {
        this.valor = valor;
        this.disciplina = disciplina;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Disciplina: " + disciplina + ", Nota: " + valor;
    }
}
