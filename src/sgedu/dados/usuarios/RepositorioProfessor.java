package sgedu.dados.usuarios;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import sgedu.negocios.entidade.usuarios.Professor;

public class RepositorioProfessor implements IRepositorioProfessor{
	public static int contadorProfessor;
	ArrayList <Professor> professores;
	
	
	public RepositorioProfessor() {
		professores = new ArrayList<Professor>();
	}
	
	public void salvarArquivoProfessor() throws IOException {
		FileOutputStream file = new FileOutputStream("Professores.dat");
		ObjectOutputStream os = new ObjectOutputStream(file);
		os.writeObject(professores);
		os.close();
		salvarContadorProfessor();
	}
	
	public void buscarArquivoProfessor() throws IOException{
		try{
			FileInputStream file = new FileInputStream("Professores.dat");
			ObjectInputStream is = new ObjectInputStream(file);
			professores = (ArrayList<Professor>) is.readObject();
			is.close();
			salvarContadorProfessor();
		} catch(IOException | ClassNotFoundException e) {
			salvarArquivoProfessor();
		}
		
	}

	public void addProfessor(Professor p) throws IOException{
		professores.add(p);
		contadorProfessor ++;
		salvarArquivoProfessor();
	}
	
	public void removerProfessorNome(String nome) throws IOException {
		Professor p = buscarProfessorNome(nome);
		
		professores.remove(p);
		salvarArquivoProfessor();
	}
	
	public void removerProfessorLogin(String login) throws IOException {
		Professor p = buscarProfessorLogin(login);
		
		professores.remove(p);
		salvarArquivoProfessor();

	}
	
	public Professor buscarProfessorNome(String nome) {
		for(int i=0; i<professores.size(); i++) {
			if(professores.get(i).getNome().contentEquals(nome)) {
				return professores.get(i);
			}
		}
		return null;
	}
	
	public Professor buscarProfessorLogin(String login) {
		for(int i=0; i<professores.size(); i++) {
			if(professores.get(i).getLogin().contentEquals(login)) {
				return professores.get(i);
			}
		}
		return null;
	}
	
	public void alterarSenhaProfessor(Professor professor) throws IOException{ 
		Professor p = buscarProfessorLogin(professor.getLogin());
		
		professor.setSenha(p.getSenha());
		salvarArquivoProfessor();
	}
	
	public void alterarNomeProfessor(Professor professor) throws IOException{ 
		Professor p = buscarProfessorLogin(professor.getLogin());
		
		professor.setNome(p.getNome());
		salvarArquivoProfessor();
	}
	
	public void salvarContadorProfessor() throws IOException {
		try {
			FileInputStream file = new FileInputStream("contadorProfessor.dat");
			DataInputStream is = new DataInputStream(file);
			contadorProfessor = (int) is.readInt();
			is.close();
		} catch(IOException e) {
			FileOutputStream file = new FileOutputStream("contadorProfessor.dat");
			ObjectOutputStream os = new ObjectOutputStream(file);
			os.writeInt(contadorProfessor);
			os.close();
		}
	}

	
}