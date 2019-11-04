package SGEdu.repositorios;

import java.util.ArrayList;
import SGEdu.usuarios.Professor;

public class RepositorioProfessor{
	
	ArrayList <Professor> professores;
	
	public RepositorioProfessor() {
		professores = new ArrayList<Professor>();
	}
	
	public void addProfessor(Professor p) {
		professores.add(p);
	}
	
	public void removerProfessorNome(String nome) {
		for(int i=0; i<professores.size(); i++) {
			if(professores.get(i).getNome().contentEquals(nome)) {
				professores.remove(i);
			}
		}
	}
	
	public void removerProfessorLogin(String login) {
		for(int i=0; i<professores.size(); i++) {
			if(professores.get(i).getLogin().contentEquals(login)) {
				professores.remove(i);
			}
		}
	}
	
	public Professor buscarProfessorNome(String nome) {
		for(int i=0; i<professores.size(); i++) {
			if(professores.get(i).getNome().contentEquals(nome)) {
				return professores.get(i);
			}
		}
		return null;
	}
	
	public Professor buscarProfessorLogin(String login) {
		for(int i=0; i<professores.size(); i++) {
			if(professores.get(i).getLogin().contentEquals(login)) {
				return professores.get(i);
			}
		}
		return null;
	}
	
	
	
}