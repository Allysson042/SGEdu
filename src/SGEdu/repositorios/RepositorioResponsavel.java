package SGEdu.repositorios;

import java.util.ArrayList;

import SGEdu.usuarios.Professor;
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
		Responsavel r = buscarResponsavelNome(nome);
		responsaveis.remove(r);
	}
	
	public void removerResponsavelLogin(String login) {
		Responsavel r = buscarResponsavelLogin(login);
		responsaveis.remove(r);
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
	
	public void alterarSenhaResponsavel(Responsavel responsavel){ 
		Responsavel r = buscarResponsavelLogin(responsavel.getLogin());
		if(r == null) {
			//throw new ResponsavelNaoExisteException();
		} 
		responsavel.setSenha(r.getSenha());
	}
	
	public void alterarNomeResponsavel(Responsavel responsavel){ 
		Responsavel r = buscarResponsavelLogin(responsavel.getLogin());
		if(r == null) {
			//throw new ResponsavelNaoExisteException();
		} 
		responsavel.setNome(r.getNome());
	}
}
