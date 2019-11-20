package sgedu.gui;

import sgedu.negocios.entidade.usuarios.Usuario;

public class UsuarioLogado {
	
	 public static Usuario user;
	
	public static Usuario getUserLogada() {
		return user;
	}
	
	public static void setUserLogado(Usuario usuario) {
		user=usuario;
	}
	

}
