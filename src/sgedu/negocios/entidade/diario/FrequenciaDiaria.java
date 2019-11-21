package sgedu.negocios.entidade.diario;

import sgedu.negocios.entidade.turma.Disciplina;
import sgedu.negocios.entidade.usuarios.Aluno;

public class FrequenciaDiaria{

	private Aluno aluno;
	private Disciplina disciplina;
	private String bimestre;
	//data;
	private int quantidadeFaltas;
	private int frequencia;
    
    public FrequenciaDiaria(Aluno aluno, Disciplina disciplina, String bimestre){
    	this.aluno = aluno;
    	this.disciplina = disciplina;
    	this.bimestre = bimestre; 
    	this.frequencia = disciplina.getQuantAulasBimestre() - getQuantidadeFaltas();
 
    }
    
    public void setQuantidadeFaltas() {
    	this.quantidadeFaltas ++;
    }
    
    public int getQuantidadeFaltas() {
    	return quantidadeFaltas;
    }
    
    public void setFrequencia(){
    	this.frequencia = disciplina.getQuantAulasBimestre() - getQuantidadeFaltas();
    }
    
    public int getFrequencia() {
    	return frequencia;
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