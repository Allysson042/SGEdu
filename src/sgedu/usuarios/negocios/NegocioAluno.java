package sgedu.usuarios.negocios;

import sgedu.excecoes.UsuarioJaCadastradoException;
import sgedu.repositorios.RepositorioAluno;
import sgedu.usuarios.Aluno;

public class NegocioAluno {
	
	private RepositorioAluno repositorio;
	
	public NegocioAluno(RepositorioAluno repositorio) {
		this.repositorio=repositorio;	
	}
	
	public void adicionar(Aluno aluno) throws UsuarioJaCadastradoException {
		Aluno alunoBusca=repositorio.buscarAlunoLogin(aluno.getLogin());
		
		if(alunoBusca!=null) {
			throw new UsuarioJaCadastradoException();
			
		}else {
			repositorio.addAluno(aluno);
		}
		
	}
	
	
	public void remover(String login) {
		
		
	}
	
	
	
}
