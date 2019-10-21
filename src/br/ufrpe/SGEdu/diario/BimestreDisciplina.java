package br.ufrpe.SGEdu.diario;

import br.ufrpe.SGEdu.turma.Disciplina;

public class BimestreDisciplina{
	
	private double nota;
	private int frequencia;
	private Disciplina disciplina; 
	
	public BimestreDisciplina(Disciplina disciplina){
		this.disciplina = disciplina;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public int getFrequencia() {
		return frequencia;
	}
	
	public void incrementarFrequencia() {
		this.frequencia ++;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	
}
