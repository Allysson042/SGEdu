package sgedu.dados.turma;

import java.io.IOException;

import sgedu.negocios.entidade.turma.Turma;

public interface IRepositorioTurma {
	
	void salvarArquivoTurma() throws IOException;
	
	void buscarArquivoTurma() throws IOException, ClassNotFoundException ;
	
	void addTurma(Turma t) throws IOException;
	
	void removerTurma(String nome, int ano) throws IOException;
	
	Turma buscarTurma(String nome, int ano);
	
	void alterarTurma(Turma turma) throws IOException;
}
