package sgedu.negocios.entidade.diario;

import java.util.ArrayList;

import sgedu.negocios.entidade.usuarios.Aluno;

/**
 * Class Boletim
 * 
 */

public class Boletim {

    private Aluno aluno;
    private int ano;
    
    ArrayList<Frequencia> frequencias;
    ArrayList<Avaliacao> avaliacoes;
    
    public Boletim(Aluno aluno) {
    	this.aluno = aluno;
    	//ano
    	this.frequencias = new ArrayList<Frequencia>();
    	this.avaliacoes = new ArrayList<Avaliacao>();
   }
    
    
   
}