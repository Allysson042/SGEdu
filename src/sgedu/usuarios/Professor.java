package sgedu.usuarios;

import java.io.Serializable;
import java.util.ArrayList;

import sgedu.repositorios.RepositorioProfessor;
import sgedu.turma.Disciplina;
import sgedu.turma.Turma;

/**
 * Class Professor
 * @author 
 */

public class Professor extends Usuario implements Serializable {
    private Disciplina disciplina;
    private ArrayList <Turma> turmas;
    private String login;
    
    public Professor(String nome, String senha, Disciplina disciplina) {
        super(nome, senha);
        this.disciplina = disciplina;
        this.turmas = new ArrayList<Turma>();
    }

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public ArrayList<Turma> getTurmas() {
		return turmas;
	}

	public void addTurma(Turma turma){
		turmas.add(turma);
	}
	
	@Override
	public String gerarLogin() {
		login = "PROF" + RepositorioProfessor.contadorProfessor;
		return login;
	}
	
}