package sgedu.repositorios;

import java.util.ArrayList;

import sgedu.excecoes.UsuarioJaCadastradoException;
import sgedu.excecoes.UsuarioNaoEncontradoException;
import sgedu.usuarios.Professor;

public class RepositorioProfessor{
	public static int contadorProfessor;
	ArrayList <Professor> professores;
	
	
	public RepositorioProfessor() {
		professores = new ArrayList<Professor>();
	}

	public void addProfessor(Professor p) throws UsuarioJaCadastradoException{
		if(buscarProfessorLogin(p.getLogin()) != null){
			throw new UsuarioJaCadastradoException("Professor Já cadastrado! ");
		}
		professores.add(p);
		contadorProfessor ++;
	}
	
	public void removerProfessorNome(String nome) throws UsuarioNaoEncontradoException {
		Professor p = buscarProfessorNome(nome);
		if(p == null) {
			throw new UsuarioNaoEncontradoException("Professor não encontrado! ");
		}
		professores.remove(p);
	}
	
	public void removerProfessorLogin(String login) throws UsuarioNaoEncontradoException {
		Professor p = buscarProfessorLogin(login);
		if(p == null) {
			throw new UsuarioNaoEncontradoException("Professor não encontrado! ");
		}
		professores.remove(p);

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
	
	public void alterarSenhaProfessor(Professor professor) throws UsuarioNaoEncontradoException{ 
		Professor p = buscarProfessorLogin(professor.getLogin());
		if(p == null) {
			throw new UsuarioNaoEncontradoException("Professor não encontrado! ");
		} 
		professor.setSenha(p.getSenha());
	}
	
	public void alterarNomeProfessor(Professor professor) throws UsuarioNaoEncontradoException{ 
		Professor p = buscarProfessorLogin(professor.getLogin());
		if(p == null) {
			throw new UsuarioNaoEncontradoException("Professor não encontrado! ");
		} 
		professor.setNome(p.getNome());
	}
	
}