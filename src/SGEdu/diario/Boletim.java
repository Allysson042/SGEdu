package SGEdu.diario;

import java.util.ArrayList;import SGEdu.turma.Turma;

/**
 * Class Boletim
 * @author Laisy
 */

public class Boletim {

    private ArrayList<Bimestre> bimestres;
    private Turma turma;
    private String aluno;
    private int ano;
    
    //Pegar em Aluno: nome do aluno, nome da turma
    //Pegar em Turma: nome, ano, disciplinas
    

    public Boletim(int ano, String aluno) {
        this.bimestres = new ArrayList<Bimestre>();
        this.aluno = aluno;
        this.ano = ano;
    }

    public String getAluno() {
        return aluno;
    }
    
    public int getAno() {
    	return ano;
    }
    
    public void setAluno(String aluno) {
    	this.aluno = aluno;
    }
    
    public void setAno(int ano) {
    	this.ano = ano;
    }
    
    public void adicionarBimestre(Bimestre bimestre){
        this.bimestres.add(bimestre);
    }

}