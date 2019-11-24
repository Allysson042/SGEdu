package sgedu.negocios.entidade.diario;

import java.util.Date;
import java.text.SimpleDateFormat;
import sgedu.negocios.entidade.turma.Disciplina;
import sgedu.negocios.entidade.usuarios.Aluno;

public class Frequencia{

	private Aluno aluno;
	private Disciplina disciplina;
	private String bimestre;
	private int quantidadeFaltas;
	private int frequenciaTotal;
	private String data;

    public Frequencia(Aluno aluno, Disciplina disciplina, String bimestre){
    	this.aluno = aluno;
    	this.disciplina = disciplina;
    	this.bimestre = bimestre; 
    	this.frequenciaTotal = disciplina.getQuantAulasBimestre() - getQuantidadeFaltas();
    	this.data = formatarData();
    }
    
    public String formatarData() {
    	SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
        Date agora = new Date(); 
        String formatado = df.format(agora);
        return formatado;
    	
    }
    
    public String getData() {
    	return data;	
    }
    
    public void setQuantidadeFaltas() {
    	this.quantidadeFaltas ++;
    }
    
    public int getQuantidadeFaltas() {
    	return quantidadeFaltas;
    }
    
    public void setFrequencia(){
    	this.frequenciaTotal = disciplina.getQuantAulasBimestre() - getQuantidadeFaltas();
    }
    
    public int getFrequencia() {
    	return frequenciaTotal;
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