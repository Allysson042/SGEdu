package sgedu.negocios.entidade.diario;

import sgedu.negocios.entidade.turma.Disciplina;

/**
 * Classe BimestreDisciplina
 * A Classe BimestreDisciplina possui uma disciplina, a nota e frequencia deferente a essa disciplina,
 * para cada bimestre.
 * E uma composição com a Classe Bimestre, um BimestreDisciplina não existe se uma Bimestre não existir;
 */


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
