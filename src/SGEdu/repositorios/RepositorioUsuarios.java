package SGEdu.repositorios;

import java.util.ArrayList;

import SGEdu.usuarios.*;

public class RepositorioUsuarios{
	
	ArrayList <Usuario> usuarios;
	
	public RepositorioUsuarios() {
		usuarios = new ArrayList<Usuario>();
	}
	
	public void addUsuario(Usuario u) {
		usuarios.add(u);
	}
	
	public void removerUsuarioNome(String nome) {
		for(int i=0; i<usuarios.size(); i++) {
			if(usuarios.get(i).getNome().contentEquals(nome)) {
				usuarios.remove(i);
			}
		}
	}
	
	public void removerUsuarioLogin(String login) {
		for(int i=0; i<usuarios.size(); i++) {
			if(usuarios.get(i).getLogin().contentEquals(login)) {
				usuarios.remove(i);
			}
		}
	}
	
	public Usuario buscarUsuarioNome(String nome) {
		for(int i=0; i<usuarios.size(); i++) {
			if(usuarios.get(i).getNome().contentEquals(nome)) {
				return usuarios.get(i);
			}
		}
		return null;
	}
	
	public Usuario buscarUsuarioLogin(String login) {
		for(int i=0; i<usuarios.size(); i++) {
			if(usuarios.get(i).getLogin().contentEquals(login)) {
				return usuarios.get(i);
			}
		}
		return null;
	}
	
	
	
}