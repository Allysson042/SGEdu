package SGEdu.diario;

import java.util.ArrayList;

import SGEdu.turma.Disciplina;
import SGEdu.turma.Turma;
import SGEdu.usuarios.Aluno;

/**
 * Class Bimestre
 * A Classe Bimestre possui o nome do bismetre, ex "1° Bimestre" e uma conjunto de bimestres disciplina,
 * que são a nota e frequência de uma referida disciplina.
 * É uma composição com a Classe Boletim, um Bimestre não existe se uma Boletim não existir.
 */

public class Bimestre{

    private String nomeBimestre; 
    private ArrayList <BimestreDisciplina> bimestreDisciplinas;
    
    public Bimestre(String nomeBimestre, Turma turma){
    	this.bimestreDisciplinas=new ArrayList <BimestreDisciplina>();
        this.nomeBimestre = nomeBimestre;
        this.gerarBimestreDisciplina(turma); 
    }

	public String getNomeBimestre() {
		return nomeBimestre;
	}

	public void setNomeBimestre(String nomeBimestre) {
		this.nomeBimestre = nomeBimestre;
	}

	public ArrayList<BimestreDisciplina> getBimestreDisciplinas() {
		return bimestreDisciplinas;
	}

	public void addBimestreDisciplinas(Disciplina disciplina) {
		BimestreDisciplina bimestreDisciplina = new BimestreDisciplina(disciplina);
		bimestreDisciplinas.add(bimestreDisciplina);
	}   
	
	private void gerarBimestreDisciplina(Turma turma) {
		ArrayList<Disciplina> disciplinas = turma.getDisciplinas();
		
			for (int i=0; i<disciplinas.size();i++) {
				BimestreDisciplina bimestreDisciplina =new BimestreDisciplina(disciplinas.get(i));
				bimestreDisciplinas.add(bimestreDisciplina);
				
			} 
		}
	
	
	
	

}