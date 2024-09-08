package com.escola.escola_senai;

public class Alunos extends Pessoa{
    private String curso;
    private Notas notas;
    private String matricula;
    
    
    
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public Notas getNotas() {
        return notas;
    }
    public void setNotas(Notas notas){
        this.notas = notas;
    }

    public String matricula() {
        return matricula;
    }
    public void setMatricula(String Matricula){
        this.matricula = Matricula;
    }    
    
    
    public Alunos(String curso, Notas notas, String Matricula, int id, String nome, String cpf, String dataNascimento, Endereco endereco, String email, String telefone){
        super(id, nome, cpf, dataNascimento, endereco, email, telefone);
        
        this.curso = curso;
        this.notas = notas;
        this.matricula = Matricula;    
    }




    






}
