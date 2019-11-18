package SGEdu.diario;

import java.util.ArrayList;
import SGEdu.usuarios.Aluno;

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
    

    public Boletim(int ano, Aluno aluno) {
        this.bimestres = new ArrayList<Bimestre>();
        this.aluno = aluno;
        this.ano = ano;
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
    
    public void adicionarBimestre(String nome){
    	Bimestre bimestre = new Bimestre(nome);
        this.bimestres.add(bimestre);
    }
    

}