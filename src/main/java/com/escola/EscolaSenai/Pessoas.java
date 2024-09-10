package com.poo.exercicios.trabalhospoo.EscolaSenai;

import java.util.Scanner;

public abstract class Pessoas {
    //atributos -> são privados
    private int id;
    private String nome;
    private int cpf;
    private String dataNascimento;
    private String endereco;
    private String telefone;

   //construtor -> recebe novas informações no Application
   public Pessoas(int id, String nome, int cpf, String dataNascimento, String endereco, String telefone){
    this.id = id;
    this.nome = nome;
    this.cpf = cpf;
    this.dataNascimento = dataNascimento;
    this.endereco = endereco;
    this.telefone = telefone;

   }
    
   //métodos especificos -> comparecer à escola, ter intervalo e ir embora
   
    /*public void comparecerAEscola(int horarioEntrada){
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o horário que você chegou à escola: ");
        horarioEntrada = leia.nextInt();

        if(horarioEntrada > 7){
            System.out.print("Seu horário foi marcado com atraso.");
    
         }else if(horarioEntrada < 6){
            System.out.print("Não é tolerado hora extra maior que 1h do seu horário.");
        }
            else{
            System.out.print("Horário marcado com sucesso.");

        }

    }

    public void intervalo(int horarioIntervalo){
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o horário que você foi pro intervalo: ");
        horarioIntervalo = leia.nextInt();

        if(horarioIntervalo > 12){
            System.out.print("Seu horário foi marcado com atraso.");
    
         }else if(horarioIntervalo < 11){
            System.out.print("Não é tolerado sair pro intervalo com 1h a mais do seu horário.");
        }
            else{
            System.out.print("Intervalo marcado com sucesso.");

        }

    }

    public void saida(int horarioSaida){
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o horário que você vai embora: ");
        horarioSaida = leia.nextInt();

        if(horarioSaida > 17){
            System.out.print("Seu horário foi marcado com atraso.");
    
         }else if(horarioSaida < 17){
            System.out.print("Não é tolerado ir embora 1h a menos do seu horário.");
        }
            else{
            System.out.print("Saída marcada com sucesso.");

        }

    }*/
    
   //getters e setters

   public String getNome() {
    return nome;
    }

    public void setNome(String nome) {
    this.nome = nome;
    }

    public int getCpf() {
    return cpf;
    }

    public void setCpf(int cpf) {
    this.cpf = cpf;
    }

    public String getDataNascimento() {
    return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
