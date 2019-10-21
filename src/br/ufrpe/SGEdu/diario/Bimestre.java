package br.ufrpe.SGEdu.diario;

import java.util.ArrayList;

/**
 * Class Bimestre
 * @author Laisy
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

	public void addBimestreDisciplinas(BimestreDisciplina bimestreDisciplina) {
		bimestreDisciplinas.add(bimestreDisciplina);
	}
    
	
    

}