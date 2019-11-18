package sgedu.repositorios;

import java.util.ArrayList;
import sgedu.excecoes.UsuarioJaCadastradoException;
import sgedu.excecoes.UsuarioNaoEncontradoException;
import sgedu.usuarios.Coordenador;

public class RepositorioCoordenador {
	ArrayList <Coordenador> coordenadores;
	public static int contadorCoordenador;
	
	public RepositorioCoordenador() {
		coordenadores = new ArrayList<Coordenador>();
	}
	
	public void addCoordenador(Coordenador c) throws UsuarioJaCadastradoException {
		if(buscarCoordenadorLogin(c.getLogin()) != null) {
			throw new UsuarioJaCadastradoException("Coordenador já cadastrado! ");
		}
		coordenadores.add(c);
		contadorCoordenador ++;
	}
	
	public void removerCoordenadorNome(String nome) throws UsuarioNaoEncontradoException {
		Coordenador c = buscarCoordenadorNome(nome);
		if(c == null) {
			throw new UsuarioNaoEncontradoException("Coordenador não encontrado! ");
		}
		coordenadores.remove(c);
	}
	
	public void removerCoordenadorLogin(String login) throws UsuarioNaoEncontradoException{
		Coordenador c = buscarCoordenadorLogin(login);
		if(c == null) {
			throw new UsuarioNaoEncontradoException("Coordenador não encontrado! ");
		}
		coordenadores.remove(c);
	}
	
	public Coordenador buscarCoordenadorNome(String nome) {
		for(int i=0; i<coordenadores.size(); i++) {
			if(coordenadores.get(i).getNome().contentEquals(nome)) {
				return coordenadores.get(i);
			}
		}
		return null;
	}
	
	public Coordenador buscarCoordenadorLogin(String login) {
		for(int i=0; i<coordenadores.size(); i++) {
			if(coordenadores.get(i).getLogin().contentEquals(login)) {
				return coordenadores.get(i);
			}
		}
		return null;
	}
	
	public void alterarSenhaCoordenador(Coordenador coordenador) throws UsuarioNaoEncontradoException{ 
		Coordenador c = buscarCoordenadorLogin(coordenador.getLogin());
		if(c == null) {
			throw new UsuarioNaoEncontradoException("Coordenador não encontrado! ");
		} 
		coordenador.setSenha(c.getSenha());
	}
	
	public void alterarNomeCoordenador(Coordenador coordenador) throws UsuarioNaoEncontradoException{ 
		Coordenador c = buscarCoordenadorLogin(coordenador.getLogin());
		if(c == null) {
			throw new UsuarioNaoEncontradoException("Coordenador não encontrado! ");
		} 
		coordenador.setNome(c.getNome());
	}
	
}
