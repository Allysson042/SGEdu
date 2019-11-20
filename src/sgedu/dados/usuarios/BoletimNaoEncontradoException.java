package sgedu.dados.usuarios;

public class BoletimNaoEncontradoException extends Exception{
	
	public BoletimNaoEncontradoException(String mensagem) {
		super(mensagem);
	}
	
	public BoletimNaoEncontradoException() {
		super("Boletim não encontrado! ");
	}

}
