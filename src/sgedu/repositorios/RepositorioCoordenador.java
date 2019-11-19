package sgedu.repositorios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import sgedu.excecoes.UsuarioJaCadastradoException;
import sgedu.excecoes.UsuarioNaoEncontradoException;
import sgedu.usuarios.Coordenador;

public class RepositorioCoordenador {
	ArrayList <Coordenador> coordenadores;
	public static int contadorCoordenador;
	
	public RepositorioCoordenador() {
		coordenadores = new ArrayList<Coordenador>();
	}
	
	public void salvarArquivoCoordenador() throws IOException {
		FileOutputStream file = new FileOutputStream("Coordenadores.dat");
		ObjectOutputStream os = new ObjectOutputStream(file);
		os.writeObject(coordenadores);
		os.close();
	}
	
	public void buscarArquivoCoordenador() throws IOException, ClassNotFoundException {
		FileInputStream file = new FileInputStream("Coordenadores.dat");
		ObjectInputStream is = new ObjectInputStream(file);
		coordenadores = (ArrayList<Coordenador>) is.readObject();
		is.close();
	}
	
	public void addCoordenador(Coordenador c) throws UsuarioJaCadastradoException, IOException {
		if(buscarCoordenadorLogin(c.getLogin()) != null) {
			throw new UsuarioJaCadastradoException("Coordenador já cadastrado! ");
		}
		coordenadores.add(c);
		contadorCoordenador ++;
		salvarArquivoCoordenador();
	}
	
	public void removerCoordenadorNome(String nome) throws UsuarioNaoEncontradoException, IOException {
		Coordenador c = buscarCoordenadorNome(nome);
		if(c == null) {
			throw new UsuarioNaoEncontradoException("Coordenador não encontrado! ");
		}
		coordenadores.remove(c);
		salvarArquivoCoordenador();
	}
	
	public void removerCoordenadorLogin(String login) throws UsuarioNaoEncontradoException, IOException{
		Coordenador c = buscarCoordenadorLogin(login);
		if(c == null) {
			throw new UsuarioNaoEncontradoException("Coordenador não encontrado! ");
		}
		coordenadores.remove(c);
		salvarArquivoCoordenador();
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
	
	public void alterarSenhaCoordenador(Coordenador coordenador) throws UsuarioNaoEncontradoException, IOException{ 
		Coordenador c = buscarCoordenadorLogin(coordenador.getLogin());
		if(c == null) {
			throw new UsuarioNaoEncontradoException("Coordenador não encontrado! ");
		} 
		coordenador.setSenha(c.getSenha());
		salvarArquivoCoordenador();
	}
	
	public void alterarNomeCoordenador(Coordenador coordenador) throws UsuarioNaoEncontradoException, IOException{ 
		Coordenador c = buscarCoordenadorLogin(coordenador.getLogin());
		if(c == null) {
			throw new UsuarioNaoEncontradoException("Coordenador não encontrado! ");
		} 
		coordenador.setNome(c.getNome());
		salvarArquivoCoordenador();
	}
	
}
