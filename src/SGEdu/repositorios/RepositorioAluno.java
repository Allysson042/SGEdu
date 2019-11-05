package SGEdu.repositorios;

import java.util.ArrayList;

import SGEdu.diario.Boletim;
import SGEdu.usuarios.Aluno;

public class RepositorioAluno{
	
	ArrayList <Aluno> alunos;
	
	public RepositorioAluno() {
		alunos = new ArrayList<Aluno>();
	}
	
	public void addAluno(Aluno a) {
		alunos.add(a);
	}
	
	public void removerAlunoNome(String nome) {
		Aluno a = buscarAlunoNome(nome);
		alunos.remove(a);
	}
	
	public void removerAlunoLogin(String login) {
		Aluno a = buscarAlunoLogin(login);
		alunos.remove(a);
	}
	
	public Aluno buscarAlunoNome(String nome) {
		for(int i=0; i<alunos.size(); i++) {
			if(alunos.get(i).getNome().contentEquals(nome)) {
				return alunos.get(i);
			}
		}
		return null;
	}
	
	public Aluno buscarAlunoLogin(String login) {
		for(int i=0; i<alunos.size(); i++) {
			if(alunos.get(i).getLogin().contentEquals(login)) {
				return alunos.get(i);
			}
		}
		return null;
	}
	
	public Boletim buscarBoletim(Aluno aluno, int ano) {
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
	
	public void removerBoletim(Aluno aluno, int ano) {
		Boletim boletim = buscarBoletim(aluno, ano);
		aluno.getBoletins().remove(boletim);
	}
}