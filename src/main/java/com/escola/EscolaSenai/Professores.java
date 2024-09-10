package com.poo.exercicios.trabalhospoo.EscolaSenai;

public class Professores extends Pessoas {
    private int salarioHora;

    public Professores(int id, String nome, int cpf, String dataNascimento, String endereco, String telefone, int salarioHora) {
        super(id, nome, cpf, dataNascimento, endereco, telefone);

    }

    public int getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(int salarioHora) {
        /*System.out.println("Digite quantas horas o professor"nomeProfessor"trabalhou");
        double hora = leia.nextdouble(); 
        salarioHora = hora*9.00;
        */
        this.salarioHora = salarioHora;
    }
    
    //métodos especificos -> passam atividades, passam provas, possuem um intervalo e mandam 
    //atividades pra casa
    
}
