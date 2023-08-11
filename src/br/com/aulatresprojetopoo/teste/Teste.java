package br.com.aulatresprojetopoo.teste;

import br.com.aulatresprojetopoo.model.Aluno;
import br.com.aulatresprojetopoo.model.Funcionario;
import br.com.aulatresprojetopoo.model.Professor;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setNome("Peddro");
		aluno.setIdade(24);
		aluno.setRm(211047);
		
		System.out.println("Nome do Aluno: " + aluno.getNome() + 
				"\nIdade do Aluno: " + aluno.getIdade() + 
				"\nRM: " + aluno.getRm() + "\n"
				);
		
		Professor professor = new Professor();
		
		professor.setNome("Valtinho");
		professor.setIdade(44);
		professor.setMateria("Banco de Dados");
		professor.setSalario(5000);
		
		System.out.println("Nome do Professor: " + professor.getNome() + 
				"\nIdade do Professor: " + professor.getIdade() + 
				"\nMateria: " + professor.getMateria() +
				"\nSalario: " + professor.getSalario() + "\n"
				);
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Roberto");
		funcionario.setIdade(23);
		funcionario.setSetor("Secretario");
		funcionario.setSalario(2500);
		
		System.out.println("Nome do Professor: " + funcionario.getNome() + 
				"\nIdade do Professor: " + funcionario.getIdade() + 
				"\nMateria: " + funcionario.getSetor() +
				"\nSalario: " + funcionario.getSalario() + "\n"
				);
		

	}

}
