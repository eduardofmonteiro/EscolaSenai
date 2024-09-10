package com.poo.exercicios.trabalhospoo.EscolaSenai;

/*Nós vamos começar a estruturar um projeto que é o EscolaSenai.
Nós precisamos montar um sistema para gerenciar as atividades
pedagógicas para alunos e professores. 
*Primeira Entrega;
*Critérios;
*Estruturar o projeto com suas classes, relacionamentos, heranças e tudo que o sistema 
necessite baseado no que voces aprenderam;
*Classes (Alunos, Professores, Disciplinas e Notas) Se precisar de outras 
para estruturar melhor, fiquem a vontade;
*Utilizar Herança (Ex: Pessoa);
*Montar construtores contendo as regras do negócio;
*Montar todos os relacionamentos entre classes.*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Trabalho1Application {

	public static void main(String[] args) {
		SpringApplication.run(Trabalho1Application.class, args);

		//dados e atributos aqui

		Professores professor1 = new Professores(1, "Arthur", 1, "01/01/1995", "rua123", "242212345678", 0);
		Diretores diretor1 = new Diretores(1, "Luiza", 1, "01/01/1995", "rua321", "242212345689");
		Alunos aluno1 = new Alunos(1, "Isabella", 1, "01/01/2017", "rua537", "242212345658", 2, "Lucia", "Marcelo");
		Alunos aluno2 = new Alunos(2, "João", 2, "02/02/2017", "rua752", "24224561387", 3, "Cristina", "Aurélio");
		Disciplina disciplina1 = new Disciplina(professor1, aluno1, 10, 10, 9, "Matemática");
	
		System.out.println("Aluno: "+aluno1.getNome()+". Disciplina: "+ disciplina1.getNome());

	}

}
