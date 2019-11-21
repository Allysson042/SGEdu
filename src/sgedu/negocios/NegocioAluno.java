package sgedu.negocios;

import java.io.IOException;

import sgedu.dados.usuarios.RepositorioAluno;
import sgedu.dados.usuarios.UsuarioJaCadastradoException;
import sgedu.negocios.entidade.usuarios.Aluno;

public class NegocioAluno {
	
	private RepositorioAluno repositorio;
	
	public NegocioAluno(RepositorioAluno repositorio) {
		this.repositorio=repositorio;	
	}
	
	public void adicionar(Aluno aluno) throws UsuarioJaCadastradoException, IOException {
		Aluno alunoBusca=repositorio.buscarAlunoLogin(aluno.getLogin());
		
		if(alunoBusca==null) {
			//System.out.println("contador Aluno: "+RepositorioAluno.contadorAluno);
			repositorio.addAluno(aluno);	
			//System.out.println("contador Aluno: "+RepositorioAluno.contadorAluno);
		}
		
	}
	
	
	public void remover(String login) {
		
		
	}
	
	
	public boolean confirmaLogin(String login, String senha) {
		return repositorio.buscarAlunoLogin(login).verificaSenha(senha);		
	}
	
	
	
	
	
}
