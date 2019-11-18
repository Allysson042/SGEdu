package sgedu.gui;

import SGEdu.usuarios.Usuario;

public class UsuarioLogado {
	
	 static Usuario user;
	
	public static Usuario getUserLogada() {
		return user;
	}
	
	public static void setUserLogado(Usuario usuario) {
		user=usuario;
	}
	

}
