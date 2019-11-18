package SGEdu.repositorios;

import java.util.ArrayList;

import SGEdu.excecoes.UsuarioJaCadastradoException;
import SGEdu.excecoes.UsuarioNaoEncontradoException;
import SGEdu.usuarios.Coordenador;

public class RepositorioCoordenador {
	ArrayList <Coordenador> coordenadores;
	
	public RepositorioCoordenador() {
		coordenadores = new ArrayList<Coordenador>();
	}
	
	public void addCoordenador(Coordenador c) throws UsuarioJaCadastradoException {
		if(buscarCoordenadorLogin(c.getLogin()) != null) {
			throw new UsuarioJaCadastradoException("Coordenador já cadastrado! ");
		}
		coordenadores.add(c);
	}
	
	public void removerCoordenadorNome(String nome) {
		Coordenador coord = buscarCoordenadorNome(nome);
		coordenadores.remove(coord);
		
	}
	
	public void removerCoordenadorLogin(String login) {
		Coordenador coord = buscarCoordenadorLogin(login);
		coordenadores.remove(coord);
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
	
	public void alterarNomeCoordenador(Coordenador coordenador){ 
		Coordenador c = buscarCoordenadorLogin(coordenador.getLogin());
		if(c == null) {
			//throw new CoordenadorNaoExisteException();
		} 
		coordenador.setNome(c.getNome());
	}
	
}
