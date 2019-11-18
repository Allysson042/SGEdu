package excecoes;

public class AlunoNaoEncontradoException extends Exception{
	
	public AlunoNaoEncontradoException(String mensagem) {
		super(mensagem);
	}
	
	public AlunoNaoEncontradoException() {
		super("Aluno não encontrado! ");
	}

}
