package sgedu.dados.usuarios;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import sgedu.negocios.entidade.usuarios.Coordenador;

public class RepositorioCoordenador implements IRepositorioCoordenador {
	ArrayList <Coordenador> coordenadores;
	public static int contadorCoordenador;
	
	public RepositorioCoordenador() {
		coordenadores = new ArrayList<Coordenador>();
		contadorCoordenador=0;
	}
	
	public void salvarArquivoCoordenador() throws IOException {
		FileOutputStream file = new FileOutputStream("Coordenadores.dat");
		ObjectOutputStream os = new ObjectOutputStream(file);
		os.writeObject(coordenadores);
		os.close();
		salvarContadorCoordenador();
	}
	
	public void buscarArquivoCoordenador() throws IOException{
		try{
			FileInputStream file = new FileInputStream("Coordenadores.dat");
			ObjectInputStream is = new ObjectInputStream(file);
			coordenadores = (ArrayList<Coordenador>) is.readObject();
			is.close();
			salvarContadorCoordenador();
		} catch(IOException | ClassNotFoundException e) {
			salvarArquivoCoordenador();
		}
		
	}
	
	public void addCoordenador(Coordenador c) throws IOException {
		coordenadores.add(c);
		System.out.println("CONTADOR: "+contadorCoordenador);
		contadorCoordenador ++;
		System.out.println("CONTADOR: "+contadorCoordenador);
		salvarArquivoCoordenador();
	}
	
	public void removerCoordenadorNome(String nome) throws IOException {
		Coordenador c = buscarCoordenadorNome(nome);
		
		coordenadores.remove(c);
		salvarArquivoCoordenador();
	}
	
	public void removerCoordenadorLogin(String login) throws IOException{
		Coordenador c = buscarCoordenadorLogin(login);
		
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
	
	public void alterarSenhaCoordenador(Coordenador coordenador) throws IOException{ 
		Coordenador c = buscarCoordenadorLogin(coordenador.getLogin());
		
		coordenador.setSenha(c.getSenha());
		salvarArquivoCoordenador();
	}
	
	public void alterarNomeCoordenador(Coordenador coordenador) throws IOException{ 
		Coordenador c = buscarCoordenadorLogin(coordenador.getLogin());
		 
		coordenador.setNome(c.getNome());
		salvarArquivoCoordenador();
	}
	
	public void salvarContadorCoordenador() throws IOException {
		FileOutputStream file = new FileOutputStream("ContadorCoordenador.dat");
		ObjectOutputStream os = new ObjectOutputStream(file);
		os.writeInt(contadorCoordenador);
		os.close();
	}
	
	
	public void buscarContadorCoordenador() throws IOException {
		try {
			FileInputStream file = new FileInputStream("ContadorCoordenador.dat");
			ObjectInputStream is = new ObjectInputStream(file);
			contadorCoordenador = (int) is.readObject();
			is.close();
			salvarContadorCoordenador();
		} catch (IOException | ClassNotFoundException e) {
			salvarContadorCoordenador();
		}
	}
	
}
