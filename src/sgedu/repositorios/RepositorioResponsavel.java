package sgedu.repositorios;

import java.util.ArrayList;

import sgedu.excecoes.UsuarioJaCadastradoException;
import sgedu.excecoes.UsuarioNaoEncontradoException;
import sgedu.usuarios.Responsavel;

public class RepositorioResponsavel {
	
	public static int contadorResponsavel;
	ArrayList <Responsavel> responsaveis;
	
	public RepositorioResponsavel() {
		responsaveis = new ArrayList<Responsavel>();
	}
	
	public void addResponsavel(Responsavel r) throws UsuarioJaCadastradoException {
		if(buscarResponsavelLogin(r.getLogin()) != null) {
			throw new UsuarioJaCadastradoException("Responsavel já cadastrado! ");
		}
		responsaveis.add(r);
		contadorResponsavel++;
	}
	
	public void removerResponsavelNome(String nome) throws UsuarioNaoEncontradoException {
		Responsavel r = buscarResponsavelNome(nome);
		if(r == null) {
			throw new UsuarioNaoEncontradoException("Responsavel não encontrado! ");
		}
		responsaveis.remove(r);
	}
	
	public void removerResponsavelLogin(String login) throws UsuarioNaoEncontradoException {
		Responsavel r = buscarResponsavelLogin(login);
		if(r == null) {
			throw new UsuarioNaoEncontradoException("Responsavel não encontrado! ");
		}
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
	
	public void alterarSenhaResponsavel(Responsavel responsavel) throws UsuarioNaoEncontradoException{ 
		Responsavel r = buscarResponsavelLogin(responsavel.getLogin());
		if(r == null) {
			throw new UsuarioNaoEncontradoException("Responsavel não encontrado! ");
		} 
		responsavel.setSenha(r.getSenha());
	}
	
	public void alterarNomeResponsavel(Responsavel responsavel) throws UsuarioNaoEncontradoException{ 
		Responsavel r = buscarResponsavelLogin(responsavel.getLogin());
		if(r == null) {
			throw new UsuarioNaoEncontradoException("Responsavel não encontrado! ");
		} 
		responsavel.setNome(r.getNome());
	}
}
