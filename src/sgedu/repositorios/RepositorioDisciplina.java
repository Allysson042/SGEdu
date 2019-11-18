package sgedu.repositorios;

import java.util.ArrayList;
import sgedu.turma.Disciplina;

public class RepositorioDisciplina {
	
	ArrayList <Disciplina> disciplinas;
	
	public RepositorioDisciplina() {
		disciplinas = new ArrayList<Disciplina>();
	}
	
	public void addDisciplina(Disciplina d) {
		disciplinas.add(d);
	}
	
	public void removerDisciplina(String nome) {
		Disciplina d = buscarDisciplina(nome);
		disciplinas.remove(d);
	}
	
	public Disciplina buscarDisciplina(String nome) {
		for(int i=0; i<disciplinas.size(); i++) {
			if(disciplinas.get(i).getNome().contentEquals(nome)) {
				return disciplinas.get(i);
			}
		}
		return null;
	}
	
	public void alterarDisciplina(Disciplina disciplina){ 
		Disciplina d = buscarDisciplina(disciplina.getNome());
		if(d == null) {
			//throw new DisciplinaNaoExisteException();
		} 
		disciplina.setNome(d.getNome());
	}
	
	
}
