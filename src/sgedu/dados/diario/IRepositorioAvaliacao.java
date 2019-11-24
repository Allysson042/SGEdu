package sgedu.dados.diario;

import java.io.IOException;
import sgedu.negocios.entidade.diario.Avaliacao;
import sgedu.negocios.entidade.usuarios.Aluno;

public interface IRepositorioAvaliacao {
	
	void salvarArquivoAvaliacao() throws IOException;
	
	void buscarArquivoAvaliacao() throws IOException, ClassNotFoundException;
	
	void addAvaliacao(Avaliacao a) throws IOException;
	
	Avaliacao buscaAvaliacaoAluno(Aluno aluno);
	
	void removerAvaliacao(Aluno aluno) throws IOException;
	
	void alterarNota(Avaliacao ava) throws IOException;

}
