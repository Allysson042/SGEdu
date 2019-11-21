package sgedu.negocios;

import java.io.IOException;

import sgedu.dados.usuarios.IRepositorioProfessor;
import sgedu.dados.usuarios.UsuarioJaCadastradoException;
import sgedu.negocios.entidade.usuarios.Coordenador;
import sgedu.negocios.entidade.usuarios.Professor;
import sgedu.negocios.entidade.usuarios.Usuario;

public class NegocioProfessor {
	
	private IRepositorioProfessor repositorio;
	
	public NegocioProfessor(IRepositorioProfessor repositorio) {
		this.repositorio=repositorio;
	}
	
	public void adicionar(Professor professor) throws UsuarioJaCadastradoException, IOException{
		Professor professorBusca=repositorio.buscarProfessorLogin(professor.getLogin());
		
		if(professorBusca==null) {
			repositorio.addProfessor(professor);	
		}
		
	}
	
	public Professor buscarLogin(String login) {
		return repositorio.buscarProfessorLogin(login);
	}
	
	
	public boolean confirmaLogin(String login, String senha) {
		return repositorio.buscarProfessorLogin(login).verificaSenha(senha);		
	}
	
	
	

}
