package sgedu.dados.turma;

import java.io.IOException;

import sgedu.negocios.entidade.turma.Disciplina;

public interface IRepositorioDisciplina {
	
	void salvarArquivoDisciplina() throws IOException;
	
	void buscarArquivoDisciplina() throws IOException, ClassNotFoundException;
	
	void addDisciplina(Disciplina d) throws IOException;
	
	void removerDisciplina(String nome) throws IOException;
	
	Disciplina buscarDisciplina(String nome);
	
	void alterarDisciplina(Disciplina disciplina) throws IOException;
	
}
