package sgedu.negocios;

import java.io.IOException;

import sgedu.dados.usuarios.IRepositorioAluno;
import sgedu.negocios.entidade.usuarios.Aluno;
import sgedu.negocios.excecoes.UsuarioJaCadastradoException;

public class NegocioAluno {
	
	private IRepositorioAluno repositorio;
	
	public NegocioAluno(IRepositorioAluno repositorio) {
		this.repositorio=repositorio;	
	}
	
	public void adicionar(Aluno aluno) throws UsuarioJaCadastradoException, IOException{
		try {
			repositorio.buscarArquivoAluno();
		} catch(IOException e) {
			
			Aluno alunoBusca=repositorio.buscarAlunoLogin(aluno.getLogin());
				
			if(alunoBusca==null) {
				
				repositorio.addAluno(aluno);	
			}else {	
				throw new UsuarioJaCadastradoException();
			}
				
			
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
