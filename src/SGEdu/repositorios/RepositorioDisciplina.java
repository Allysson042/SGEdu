package SGEdu.repositorios;

import java.util.ArrayList;
import SGEdu.turma.Disciplina;

public class RepositorioDisciplina {
	
	ArrayList <Disciplina> disciplinas;
	
	public RepositorioDisciplina() {
		disciplinas = new ArrayList<Disciplina>();
	}
	
	public void addDisciplina(Disciplina d) {
		disciplinas.add(d);
	}
	
	public void removerDisciplina(String nome) {
		for(int i=0; i<disciplinas.size(); i++) {
			if(disciplinas.get(i).getNome().contentEquals(nome)) {
				disciplinas.remove(i);
			}
		}
	}
	
	public Disciplina buscarDisciplina(String nome) {
		for(int i=0; i<disciplinas.size(); i++) {
			if(disciplinas.get(i).getNome().contentEquals(nome)) {
				return disciplinas.get(i);
			}
		}
		return null;
	}
	
	
	
}
