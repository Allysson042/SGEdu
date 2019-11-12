package SGEdu.repositorios;

import java.util.ArrayList;
import SGEdu.turma.Turma;
import SGEdu.usuarios.Responsavel;

public class RepositorioTurma {
	
	ArrayList <Turma> turmas;
	
	public RepositorioTurma() {
		turmas = new ArrayList<Turma>();
	}
	
	public void addTurma(Turma t) {
		turmas.add(t);
	}
	
	public void removerTurma(String nome, int ano) {
		Turma t = buscarTurma(nome, ano);
		turmas.remove(t);
	}
	
	public Turma buscarTurma(String nome, int ano) {
		for(int i=0; i<turmas.size(); i++) {
			if(turmas.get(i).getNome().contentEquals(nome) && turmas.get(i).getAno() == ano) {
				return turmas.get(i);
			}
		}
		return null;
	}
	
	public void alterarTurma(Turma turma){ 
		Turma t = buscarTurma(turma.getNome(), turma.getAno());
		if(t == null) {
			//throw new TurmaNaoExisteException();
		} 
		turma.setNome(t.getNome());
		turma.setAno(t.getAno());
	}
}
