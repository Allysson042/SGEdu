package SGEdu.repositorios;

import java.util.ArrayList;

import SGEdu.diario.Boletim;
import SGEdu.usuarios.Aluno;
import excecoes.AlunoJaCadastradoException;
import excecoes.AlunoNaoEncontradoException;
import excecoes.AlunoNaoExisteException;
import excecoes.BoletimNaoEncontradoException;

public class RepositorioAluno{
	
	ArrayList <Aluno> alunos;
	
	public RepositorioAluno() {
		alunos = new ArrayList<Aluno>();
	}
	
	public void addAluno(Aluno a) throws AlunoJaCadastradoException, AlunoNaoEncontradoException{
		if(buscarAlunoLogin(a.getLogin()) != null) {
			throw new AlunoJaCadastradoException();
		} 
		alunos.add(a);
	}
	
	public void removerAlunoNome(String nome) throws AlunoNaoExisteException, AlunoNaoEncontradoException{
		Aluno a = buscarAlunoNome(nome);
		if(a == null) {
			throw new AlunoNaoExisteException();
		}
		alunos.remove(a);
	}
	
	public void removerAlunoLogin(String login) throws AlunoNaoExisteException, AlunoNaoEncontradoException{
		Aluno a = buscarAlunoLogin(login);
		if(a == null) {
			throw new AlunoNaoExisteException();
		}
		alunos.remove(a);
	}
	
	public Aluno buscarAlunoNome(String nome) throws AlunoNaoEncontradoException{
		for(int i=0; i<alunos.size(); i++) {
			if(alunos.get(i).getNome().contentEquals(nome)) {
				return alunos.get(i);
			}
		}
		throw new AlunoNaoEncontradoException();
	}
	
	public Aluno buscarAlunoLogin(String login) throws AlunoNaoEncontradoException{
		for(int i=0; i<alunos.size(); i++) {
			if(alunos.get(i).getLogin().contentEquals(login)) {
				return alunos.get(i);
			}
		}
		throw new AlunoNaoEncontradoException();
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
	
	public void alterarNomeAluno(Aluno aluno) throws AlunoNaoExisteException, AlunoNaoEncontradoException{ 
		Aluno a = buscarAlunoNome(aluno.getNome());
		if(a == null) {
			throw new AlunoNaoExisteException();
		} 
		aluno.setNome(a.getNome());
	}
	
	public void alterarSenhaAluno(Aluno aluno) throws AlunoNaoExisteException, AlunoNaoEncontradoException{ 
		Aluno a = buscarAlunoLogin(aluno.getLogin());
		if(a == null) {
			throw new AlunoNaoExisteException();
		} 
		aluno.setSenha(a.getSenha());
	}
	
}