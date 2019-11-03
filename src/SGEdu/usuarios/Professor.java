package SGEdu.usuarios;
import java.util.ArrayList;

import SGEdu.turma.Disciplina;
import SGEdu.turma.Turma;

/**
 * Class Professor
 * @author Allysson & Lucas Leonardo
 */

public class Professor extends Usuario{
    private Disciplina disciplina;
    private ArrayList <Turma> turmas;
    
    public Professor(String nome, String login, String senha, Disciplina disciplina) {
        super(nome, login, senha);
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
	
	

}