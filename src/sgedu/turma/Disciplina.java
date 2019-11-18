package SGEdu.turma;

import SGEdu.usuarios.Professor;

/**
 * Class Disciplina
 * @author laisy
 * A classe Disciplina 
 *
 */

public class Disciplina {
	
	private String nome;
	private Professor professor; 
	private int quantAulas;
	
	public Disciplina(String nome, int quantAulas){
		this.nome = nome;
		this.quantAulas = quantAulas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int quantAulas() {
		return quantAulas;
	}
	
	public void getQuantAulas(int quantAulas) {
		this.quantAulas = quantAulas;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

}