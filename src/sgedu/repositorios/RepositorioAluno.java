package sgedu.repositorios;

import java.util.ArrayList;

import sgedu.diario.Boletim;
import sgedu.excecoes.BoletimNaoEncontradoException;
import sgedu.excecoes.UsuarioJaCadastradoException;
import sgedu.excecoes.UsuarioNaoEncontradoException;
import sgedu.usuarios.Aluno;

public class RepositorioAluno{
	
	ArrayList <Aluno> alunos;
	public static int contadorAluno;
	
	public RepositorioAluno() {
		alunos = new ArrayList<Aluno>();
	}
	
	public void addAluno(Aluno a) throws UsuarioJaCadastradoException{
		if(buscarAlunoLogin(a.getLogin()) != null) {
			throw new UsuarioJaCadastradoException("Aluno já cadastrado! ");
		} 
		alunos.add(a);
		contadorAluno ++;
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
	
	public Aluno buscarAlunoNome(String nome){
		for(int i=0; i<alunos.size(); i++) {
			if(alunos.get(i).getNome().contentEquals(nome)) {
				return alunos.get(i);
			}
		}
		return null;
	}
	
	public Aluno buscarAlunoLogin(String login){
		for(int i=0; i<alunos.size(); i++) {
			if(alunos.get(i).getLogin().contentEquals(login)) {
				return alunos.get(i);
			}
		}
		return null;
	}
	
	public Boletim buscarBoletim(Aluno aluno, int ano){
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
		return null;
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