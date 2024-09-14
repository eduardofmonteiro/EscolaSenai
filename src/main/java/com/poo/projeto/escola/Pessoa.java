package com.poo.projeto.escola;

//import java.util.Scanner;

public abstract class Pessoa {
    //atributos -> são privados
    private int id;
    private String nome;
    private String cpf;
    private static int contadorId=1;

   //construtor -> recebe novas informações no Application
   public Pessoa(int id, String nome, String cpf){
    this.id = contadorId;
    contadorId++;
    this.nome = nome;
    this.cpf = cpf;
   }
   public Pessoa(){}

   public String getNome() {
    return nome;
    }

    public void setNome(String nome) {
    this.nome = nome;
    }

    public String getCpf() {
    return cpf;
    }

    public void setCpf(String cpf) {
    this.cpf = cpf;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}