package excecoes;

public class AlunoNaoExisteException extends Exception{
		
		public AlunoNaoExisteException(String mensagem) {
			super(mensagem);
		}
		
		public AlunoNaoExisteException() {
			super("Aluno não existe! ");
		}

}
