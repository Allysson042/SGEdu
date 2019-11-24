package sgedu.dados.diario;

import java.io.IOException;

import sgedu.negocios.entidade.diario.Frequencia;
import sgedu.negocios.entidade.turma.Disciplina;
import sgedu.negocios.entidade.usuarios.Aluno;

public interface IRepositorioFrequencia {
	
	void salvarArquivoFrequencia() throws IOException;
	
	void buscarArquivoFrequencia() throws IOException, ClassNotFoundException;
	
	public void addFrequencia(Frequencia f) throws IOException;
	
	Frequencia buscaFrequenciaAluno(Aluno aluno, String bimestre, Disciplina disciplina);
	
	public void removerFrequencia(Aluno aluno, String bimestre, Disciplina disciplina) throws IOException;

}
