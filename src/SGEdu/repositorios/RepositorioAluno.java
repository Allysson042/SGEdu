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
		for(int i=0; i<alunos.size(); i++) {
			if(alunos.get(i).getNome().contentEquals(nome)) {
				alunos.remove(i);
			}
		}
	}
	
	public void removerAlunoLogin(String login) {
		for(int i=0; i<alunos.size(); i++) {
			if(alunos.get(i).getLogin().contentEquals(login)) {
				alunos.remove(i);
			}
		}
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
	
	public Boletim removerBoletim(Aluno aluno, int ano) {
		for(int i=0; i<alunos.size(); i++) {
			if(alunos.get(i).equals(aluno)) {
				Aluno a = alunos.get(i);
				for(int k=0; k<a.getBoletins().size(); k++) {
					if(a.getBoletins().get(k).getAno() == ano) {
						a.getBoletins().remove(k);
					}
				}
			}
		}
		return null;
	}
}