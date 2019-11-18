package SGEdu.repositorios;

import java.util.ArrayList;


import SGEdu.diario.Boletim;
import SGEdu.excecoes.BoletimNaoEncontradoException;
import SGEdu.excecoes.UsuarioJaCadastradoException;
import SGEdu.excecoes.UsuarioNaoEncontradoException;
import SGEdu.usuarios.Aluno;

public class RepositorioAluno{
	
	ArrayList <Aluno> alunos;
	
	public RepositorioAluno() {
		alunos = new ArrayList<Aluno>();
	}
	
	public void addAluno(Aluno a) throws UsuarioJaCadastradoException, UsuarioNaoEncontradoException{
		if(buscarAlunoLogin(a.getLogin()) != null) {
			throw new UsuarioJaCadastradoException("Aluno já cadastrado! ");
		} 
		alunos.add(a);
	}
	
	public void removerAlunoNome(String nome) throws UsuarioNaoEncontradoException{
		Aluno a = buscarAlunoNome(nome);
		if(a == null) {
			throw new UsuarioNaoEncontradoException("Aluno não encontrado! ");
		}
		alunos.remove(a);
	}
	
	public void removerAlunoLogin(String login) throws UsuarioNaoEncontradoException{
		Aluno a = buscarAlunoLogin(login);
		if(a == null) {
			throw new UsuarioNaoEncontradoException("Aluno não encontrado! ");
		}
		alunos.remove(a);
	}
	
	public Aluno buscarAlunoNome(String nome) throws UsuarioNaoEncontradoException{
		for(int i=0; i<alunos.size(); i++) {
			if(alunos.get(i).getNome().contentEquals(nome)) {
				return alunos.get(i);
			}
		}
		throw new UsuarioNaoEncontradoException("Aluno não encontrado! ");
	}
	
	public Aluno buscarAlunoLogin(String login) throws UsuarioNaoEncontradoException{
		for(int i=0; i<alunos.size(); i++) {
			if(alunos.get(i).getLogin().contentEquals(login)) {
				return alunos.get(i);
			}
		}
		return null;///////////////
		throw new UsuarioNaoEncontradoException("Aluno não encontrado! ");
	}
	
	public Boletim buscarBoletim(Aluno aluno, int ano) throws BoletimNaoEncontradoException{
		for(int i=0; i<alunos.size(); i++) {
			if(alunos.get(i).equals(aluno)) {
				Aluno a = alunos.get(i);
				for(int k=0; k<a.getBoletins().size(); k++) {
					if(a.getBoletins().get(k).getAno() == ano) {
						return a.getBoletins().get(k);
					}
				}
			}
		}
		throw new BoletimNaoEncontradoException();
	}
	
	public void removerBoletim(Aluno aluno, int ano) throws BoletimNaoEncontradoException{ 
		Boletim boletim = buscarBoletim(aluno, ano);
		if(boletim == null) {
			throw new BoletimNaoEncontradoException();
		}
		aluno.getBoletins().remove(boletim);
	}
	
	public void alterarNomeAluno(Aluno aluno) throws UsuarioNaoEncontradoException{ 
		Aluno a = buscarAlunoNome(aluno.getNome());
		if(a == null) {
			throw new UsuarioNaoEncontradoException("Aluno não encontrado! ");
		} 
		aluno.setNome(a.getNome());
	}
	
	public void alterarSenhaAluno(Aluno aluno) throws UsuarioNaoEncontradoException{ 
		Aluno a = buscarAlunoLogin(aluno.getLogin());
		if(a == null) {
			throw new UsuarioNaoEncontradoException("Aluno não encontrado! ");
		} 
		aluno.setSenha(a.getSenha());
	}
	
}