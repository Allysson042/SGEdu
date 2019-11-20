package sgedu.dados.turma;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import sgedu.negocios.entidade.turma.Disciplina;

public class RepositorioDisciplina {
	
	ArrayList <Disciplina> disciplinas;
	
	public RepositorioDisciplina() {
		disciplinas = new ArrayList<Disciplina>();
	}
	
	public void salvarArquivoDisciplina() throws IOException {
		FileOutputStream file = new FileOutputStream("Disciplinas.dat");
		ObjectOutputStream os = new ObjectOutputStream(file);
		os.writeObject(disciplinas);
		os.close();
	}
	
	public void buscarArquivoDisciplina() throws IOException, ClassNotFoundException {
		FileInputStream file = new FileInputStream("Disciplinas.dat");
		ObjectInputStream is = new ObjectInputStream(file);
		disciplinas = (ArrayList<Disciplina>) is.readObject();
		is.close();
	}
	
	public void addDisciplina(Disciplina d) throws DisciplinaJaCadastradaException, IOException {
		if(buscarDisciplina(d.getNome()) != null){
			throw new DisciplinaJaCadastradaException();
		}
		disciplinas.add(d);
		salvarArquivoDisciplina();
	}
	
	
	public void removerDisciplina(String nome) throws DisciplinaNaoEncontradaException, IOException{
		Disciplina d = buscarDisciplina(nome);
		if(d == null) {
			throw new DisciplinaNaoEncontradaException();
		}
		disciplinas.remove(d);
		salvarArquivoDisciplina();
	}
	
	public Disciplina buscarDisciplina(String nome) {
		for(int i=0; i<disciplinas.size(); i++) {
			if(disciplinas.get(i).getNome().contentEquals(nome)) {
				return disciplinas.get(i);
			}
		}
		return null;
	}
	
	public void alterarDisciplina(Disciplina disciplina) throws DisciplinaNaoEncontradaException, IOException{ 
		Disciplina d = buscarDisciplina(disciplina.getNome());
		if(d == null) {
			throw new DisciplinaNaoEncontradaException();
		} 
		disciplina.setNome(d.getNome());
		salvarArquivoDisciplina();
	}
	
	
}
