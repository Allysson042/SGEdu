package SGEdu.repositorios;

import java.util.ArrayList;
import SGEdu.usuarios.Responsavel;

public class RepositorioResponsavel {
	
	ArrayList <Responsavel> responsaveis;
	
	public RepositorioResponsavel() {
		responsaveis = new ArrayList<Responsavel>();
	}
	
	public void addResponsavel(Responsavel r) {
		responsaveis.add(r);
	}
	
	public void removerResponsavelNome(String nome) {
		for(int i=0; i<responsaveis.size(); i++) {
			if(responsaveis.get(i).getNome().contentEquals(nome)) {
				responsaveis.remove(i);
			}
		}
	}
	
	public void removerResponsavelLogin(String login) {
		for(int i=0; i<responsaveis.size(); i++) {
			if(responsaveis.get(i).getLogin().contentEquals(login)) {
				responsaveis.remove(i);
			}
		}
	}
	
	public Responsavel buscarResponsavelNome(String nome) {
		for(int i=0; i<responsaveis.size(); i++) {
			if(responsaveis.get(i).getNome().contentEquals(nome)) {
				return responsaveis.get(i);
			}
		}
		return null;
	}
	
	public Responsavel buscarResponsavelLogin(String login) {
		for(int i=0; i<responsaveis.size(); i++) {
			if(responsaveis.get(i).getLogin().contentEquals(login)) {
				return responsaveis.get(i);
			}
		}
		return null;
	}

}
