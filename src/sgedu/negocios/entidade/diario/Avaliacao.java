package sgedu.negocios.entidade.diario;

import sgedu.negocios.entidade.turma.Disciplina;
import sgedu.negocios.entidade.usuarios.Aluno;

public class Avaliacao{
	
	private double nota;
	private Aluno aluno;
	private Disciplina disciplina;
	private String bimestre;
	
	public Avaliacao(double nota, Aluno aluno, Disciplina disciplina, String bimestre){
		this.nota = nota;
		this.aluno = aluno;
		this.disciplina = disciplina;
		this.bimestre = bimestre;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public String getBimestre() {
		return bimestre;
	}

	public void setBimestre(String bimestre) {
		this.bimestre = bimestre;
	}

	
	
}
