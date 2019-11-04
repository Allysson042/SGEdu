package SGEdu.repositorios;

import java.util.ArrayList;
import SGEdu.diario.Boletim;
import SGEdu.usuarios.Aluno;

public class RepositorioBoletim {
	
	ArrayList <Boletim> boletins;
	
	public RepositorioBoletim() {
		boletins = new ArrayList<Boletim>();
	}
	
	public void addBoletim(Boletim b) {
		boletins.add(b);
	}
	
	public void removerBoletim(Aluno aluno, int ano) {
		for(int i=0; i<boletins.size(); i++) {
			if(boletins.get(i).getAluno().equals(aluno) && boletins.get(i).getAno() == ano) {
				boletins.remove(i);
			}
		}
	}
	
	public Boletim buscarBoletim(Aluno aluno, int ano) {
		for(int i=0; i<boletins.size(); i++) {
			if(boletins.get(i).getAluno().equals(aluno) && boletins.get(i).getAno() == ano) {
				return boletins.get(i);
			}
		}
		return null;
	}
	
}
