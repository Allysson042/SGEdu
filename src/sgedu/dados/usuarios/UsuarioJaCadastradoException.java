package sgedu.dados.usuarios;

public class UsuarioJaCadastradoException extends Exception{
	
	public UsuarioJaCadastradoException(String mensagem) {
		super(mensagem);
	}
	
	public UsuarioJaCadastradoException() {
		super("Usuario já cadastrado! ");
	}
}
