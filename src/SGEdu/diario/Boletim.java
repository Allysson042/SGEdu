package br.ufrpe.SGEdu.diario;
import java.util.ArrayList;

import br.ufrpe.SGEdu.turma.Turma;

/**
 * Class Boletim
 * @author Laisy
 */

public class Boletim {

    private ArrayList<Bimestre> bimestres;
    private Turma turma;
    private String aluno;
    
    //Pegar em Aluno: nome do aluno, nome da turma
    //Pegar em Turma: nome, ano, disciplinas
    

    public Boletim(int ano, String aluno) {
        this.bimestres = new ArrayList<Bimestre>();
        this.aluno = aluno;
    }

    public String getAluno() {
        return aluno;
    }

    public void adicionarBimestre(Bimestre bimestre){
        this.bimestres.add(bimestre);
    }

}