package SGEdu.turma;

import SGEdu.usuarios.Professor;

/**
 * Class Disciplina
 * @author laisy
 *
 */

public class Disciplina {
	
	private String disciplina;
	private Professor professor;
	
	public Disciplina(String disciplina){
		this.disciplina = disciplina;
		
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

}