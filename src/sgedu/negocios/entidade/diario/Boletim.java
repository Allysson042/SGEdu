package sgedu.negocios.entidade.diario;

import java.util.ArrayList;

import sgedu.negocios.entidade.turma.Turma;
import sgedu.negocios.entidade.usuarios.Aluno;

/**
 * Class Boletim
 * A Classe Boletim, serve para criar objetos Boletim. Um boletim é um conjunto de bimestres, 
 * no qual possuem nota e frequência pra cada disciplina referente a cada bimestre,
 * ele pertence a uma aluno e possui o ano ao qual ele está refido.
 */

public class Boletim {

    private ArrayList<Bimestre> bimestres;
    private Aluno aluno;
    private int ano;
    
    //Pegar em Aluno: nome do aluno, nome da turma
    //Pegar em Turma: nome, ano, disciplinas
    

    public Boletim(int ano, Aluno aluno,Turma turma) {
        this.bimestres = new ArrayList<Bimestre>();
        this.aluno = aluno;
        this.ano = ano;
        
        Bimestre b1 = new Bimestre("1 Bimestre",turma);
        Bimestre b2 = new Bimestre("2 Bimestre",turma);
        Bimestre b3 = new Bimestre("3 Bimestre",turma);
        Bimestre b4 = new Bimestre("4 Bimestre",turma);
        
        this.bimestres.add(b1);
        this.bimestres.add(b2);
        this.bimestres.add(b3);
        this.bimestres.add(b4);
    }

    public Aluno getAluno() {
        return aluno;
    }
    
    public int getAno() {
    	return ano;
    }
    
    public void setAluno(Aluno aluno) {
    	this.aluno = aluno;
    }
    
    public void setAno(int ano) {
    	this.ano = ano;
    }
    
    public ArrayList<Bimestre> getBimestres(){
    	return bimestres;
    }
    
    /*
    public void adicionarBimestre(String nome){
    	Bimestre bimestre = new Bimestre(nome);
        this.bimestres.add(bimestre);
    }*/
    
  
    

}