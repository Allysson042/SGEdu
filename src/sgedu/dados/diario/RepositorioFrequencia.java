package sgedu.dados.diario;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import sgedu.negocios.entidade.diario.Frequencia;
import sgedu.negocios.entidade.turma.Disciplina;
import sgedu.negocios.entidade.usuarios.Aluno;

/**
 * Repositorio Frequencia tem como objetivo guardar todos os objetos frequencia, fazer buscas dentro do repositório
 * e remover, caso precise. Os objetos frequencia são armazenados em um ArrayList e um arquivo binário.
 * @author laisy
 */
public class RepositorioFrequencia implements IRepositorioFrequencia{
	
	ArrayList<Frequencia> frequencias;
	
	public RepositorioFrequencia() {
		this.frequencias = new ArrayList<Frequencia>();
	}

	public void salvarArquivoFrequencia() throws IOException {
		FileOutputStream file = new FileOutputStream("Frequencia.dat");
		ObjectOutputStream os = new ObjectOutputStream(file);
		os.writeObject(frequencias);
		os.close();
	}
	
	public void buscarArquivoFrequencia() throws IOException{
		try {
			FileInputStream file = new FileInputStream("Frequencia.dat");
			ObjectInputStream is = new ObjectInputStream(file);
			frequencias = (ArrayList<Frequencia>) is.readObject();
			is.close();
		} catch(IOException | ClassNotFoundException e) {
			salvarArquivoFrequencia();
		}
	
	}
	
	public void addFrequencia(Frequencia f) throws IOException {
		frequencias.add(f);
		salvarArquivoFrequencia();
	}
	
	public Frequencia buscaFrequenciaAluno(Aluno aluno, String bimestre, Disciplina disciplina) {
		for(int i=0; i<frequencias.size(); i++) {
			if(frequencias.get(i).getAluno() == aluno && frequencias.get(i).getBimestre().contentEquals(bimestre) && frequencias.get(i).getDisciplina() == disciplina) {
				return frequencias.get(i);
			}
		}
		return null;
	}
	
	public void removerFrequencia(Aluno aluno, String bimestre, Disciplina disciplina) throws IOException {
		Frequencia f = buscaFrequenciaAluno(aluno, bimestre, disciplina);
		frequencias.remove(f);
		salvarArquivoFrequencia();
	}
	
	public void alterarFrequencia(Frequencia freq) {
		Frequencia f = buscaFrequenciaAluno(freq.getAluno(), freq.getBimestre(), freq.getDisciplina());
		f.setQuantidadeFaltas();
		
	}
	
}
