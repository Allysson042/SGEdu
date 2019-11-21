package sgedu.negocios;

import java.io.IOException;

import sgedu.dados.usuarios.RepositorioCoordenador;
import sgedu.dados.usuarios.UsuarioJaCadastradoException;
import sgedu.negocios.entidade.usuarios.Coordenador;

public class NegocioCoordenador {
	
	private RepositorioCoordenador repositorio;
	
	
	public NegocioCoordenador(RepositorioCoordenador repositorio) {
		this.repositorio=repositorio;		
	}
	
	
	public void adicionar(Coordenador coordenador) throws UsuarioJaCadastradoException, IOException {
		Coordenador coordenadorBusca = repositorio.buscarCoordenadorLogin(coordenador.getLogin());
		
		if(coordenadorBusca==null) {
			repositorio.addCoordenador(coordenador);
		}
	}
	
	
	
	public boolean confirmaLogin(String login, String senha) {
		return repositorio.buscarCoordenadorLogin(login).verificaSenha(senha);
	}
	
	
	
	
	
	
	
	

}
