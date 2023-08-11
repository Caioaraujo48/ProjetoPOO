package br.com.aulatresprojetopoo.teste;

import javax.swing.JOptionPane;

import br.com.aulatresprojetopoo.model.Aluno;
import br.com.aulatresprojetopoo.model.Funcionario;
import br.com.aulatresprojetopoo.model.Professor;

public class TesteDois {

	public static void main(String[] args) {
		
Aluno aluno = new Aluno();
		
		aluno.setNome(JOptionPane.showInputDialog("Digite o nome do Aluno"));
		aluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do Aluno")));
		aluno.setRm(Integer.parseInt(JOptionPane.showInputDialog("Digite o RM do Aluno")));
		
		System.out.println("Nome do Aluno: " + aluno.getNome() + 
				"\nIdade do Aluno: " + aluno.getIdade() + 
				"\nRM: " + aluno.getRm() + "\n"
				);
		
		Professor professor = new Professor();
		
		professor.setNome(JOptionPane.showInputDialog("Digite o nome do Professor"));
		professor.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do Professor")));
		professor.setMateria(JOptionPane.showInputDialog("Digite o nome da Matéria do Professor"));
		professor.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o Salário do Professor")));
		
		System.out.println("Nome do Professor: " + professor.getNome() + 
				"\nIdade do Professor: " + professor.getIdade() + 
				"\nMateria: " + professor.getMateria() +
				"\nSalario: " + professor.getSalario() + "\n"
				);
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome(JOptionPane.showInputDialog("Digite o nome do Funcionário"));
		funcionario.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do Funcionário")));
		funcionario.setSetor(JOptionPane.showInputDialog("Digite o setor do Funcionário"));
		funcionario.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o Salário do Funcionário")));
		
		System.out.println("Nome do Professor: " + funcionario.getNome() + 
				"\nIdade do Professor: " + funcionario.getIdade() + 
				"\nMateria: " + funcionario.getSetor() +
				"\nSalario: " + funcionario.getSalario() + "\n"
				);
		
	}

}
