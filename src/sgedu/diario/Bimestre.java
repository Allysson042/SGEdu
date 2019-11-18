package SGEdu.diario;

import java.util.ArrayList;

import SGEdu.turma.Disciplina;

/**
 * Class Bimestre
 * A Classe Bimestre possui o nome do bismetre, ex "1° Bimestre" e uma conjunto de bimestres disciplina,
 * que são a nota e frequência de uma referida disciplina.
 * É uma composição com a Classe Boletim, um Bimestre não existe se uma Boletim não existir.
 */

public class Bimestre{

    private String nomeBimestre; 
    private ArrayList <BimestreDisciplina> bimestreDisciplinas;
    
    public Bimestre(String nomeBimestre){
        this.nomeBimestre = nomeBimestre;
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

}