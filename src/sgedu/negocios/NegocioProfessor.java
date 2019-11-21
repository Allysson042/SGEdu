package sgedu.negocios;

import java.io.IOException;

import sgedu.dados.usuarios.RepositorioProfessor;
import sgedu.dados.usuarios.UsuarioJaCadastradoException;
import sgedu.negocios.entidade.usuarios.Professor;

public class NegocioProfessor {
	
	private RepositorioProfessor repositorio;
	
	public NegocioProfessor(RepositorioProfessor repositorio) {
		this.repositorio=repositorio;
	}
	
	public void adicionar(Professor professor) throws UsuarioJaCadastradoException, IOException{
		Professor professorBusca=repositorio.buscarProfessorLogin(professor.getLogin());
		
		if(professorBusca==null) {
			repositorio.addProfessor(professor);	
		}
		
	}
	
	
	public boolean confirmaLogin(String login, String senha) {
		return repositorio.buscarProfessorLogin(login).verificaSenha(senha);		
	}
	
	
	

}
