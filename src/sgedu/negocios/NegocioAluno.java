package sgedu.negocios;

import java.io.IOException;

import sgedu.dados.usuarios.IRepositorioAluno;
import sgedu.dados.usuarios.UsuarioJaCadastradoException;
import sgedu.negocios.entidade.usuarios.Aluno;

public class NegocioAluno {
	
	private IRepositorioAluno repositorio;
	
	public NegocioAluno(IRepositorioAluno repositorio) {
		this.repositorio=repositorio;	
	}
	
	public void adicionar(Aluno aluno) throws UsuarioJaCadastradoException, IOException, ClassNotFoundException {
		Aluno alunoBusca=repositorio.buscarAlunoLogin(aluno.getLogin());
		
		if(alunoBusca==null) {
			//System.out.println("contador Aluno: "+RepositorioAluno.contadorAluno);
			repositorio.addAluno(aluno);	
			//System.out.println("contador Aluno: "+RepositorioAluno.contadorAluno);
		}		
	}
	
	public Aluno buscarLogin(String login) {
		return repositorio.buscarAlunoLogin(login);
		
	}
	
	
	public void remover(String login) {
		
		
	}
	
	
	public boolean confirmaLogin(String login, String senha) {
		return repositorio.buscarAlunoLogin(login).verificaSenha(senha);		
	}
	
	
	
	
	
	
}
