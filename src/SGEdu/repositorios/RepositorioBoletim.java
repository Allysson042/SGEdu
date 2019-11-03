package SGEdu.repositorios;

import java.util.ArrayList;
import SGEdu.diario.Boletim;

public class RepositorioBoletim {
	
	ArrayList <Boletim> boletins;
	
	public RepositorioBoletim() {
		boletins = new ArrayList<Boletim>();
	}
	
	public void addBoletim(Boletim b) {
		boletins.add(b);
	}
	
	public void removerBoletim(String aluno, int ano) {
		for(int i=0; i<boletins.size(); i++) {
			if(boletins.get(i).getAluno().contentEquals(aluno) && boletins.get(i).getAno() == ano) {
				boletins.remove(i);
			}
		}
	}
	
	public Boletim buscarBoletim(String aluno, int ano) {
		for(int i=0; i<boletins.size(); i++) {
			if(boletins.get(i).getAluno().contentEquals(aluno) && boletins.get(i).getAno() == ano) {
				return boletins.get(i);
			}
		}
		return null;
	}
	
}
