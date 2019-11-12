package excecoes;

public class AlunoJaCadastradoException extends Exception{
	
	public AlunoJaCadastradoException(String mensagem) {
		super(mensagem);
	}
	
	public AlunoJaCadastradoException() {
		super("Aluno já cadastrado! ");
	}
}
