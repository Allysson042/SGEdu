package sgedu.dados.usuarios;

public class UsuarioNaoEncontradoException extends Exception{
	
	public UsuarioNaoEncontradoException(String mensagem) {
		super(mensagem);
	}
	
	public UsuarioNaoEncontradoException() {
		super("Usuario não encontrado! ");
	}

}
