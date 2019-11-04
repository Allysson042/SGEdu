package SGEdu.repositorios;

import java.util.ArrayList;
import SGEdu.usuarios.Coordenador;

public class RepositorioCoordenador {
	ArrayList <Coordenador> coordenadores;
	
	public RepositorioCoordenador() {
		coordenadores = new ArrayList<Coordenador>();
	}
	
	public void addCoordenador(Coordenador c) {
		coordenadores.add(c);
	}
	
	public void removerCoordenadorNome(String nome) {
		for(int i=0; i<coordenadores.size(); i++) {
			if(coordenadores.get(i).getNome().contentEquals(nome)) {
				coordenadores.remove(i);
			}
		}
	}
	
	public void removerCoordenadorLogin(String login) {
		for(int i=0; i<coordenadores.size(); i++) {
			if(coordenadores.get(i).getLogin().contentEquals(login)) {
				coordenadores.remove(i);
			}
		}
	}
	
	public Coordenador buscarCoordenadorNome(String nome) {
		for(int i=0; i<coordenadores.size(); i++) {
			if(coordenadores.get(i).getNome().contentEquals(nome)) {
				return coordenadores.get(i);
			}
		}
		return null;
	}
	
	public Coordenador buscarCoordenadorLogin(String login) {
		for(int i=0; i<coordenadores.size(); i++) {
			if(coordenadores.get(i).getLogin().contentEquals(login)) {
				return coordenadores.get(i);
			}
		}
		return null;
	}
}