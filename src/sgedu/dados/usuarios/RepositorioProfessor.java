package sgedu.dados.usuarios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import sgedu.negocios.entidade.usuarios.Professor;

public class RepositorioProfessor{
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
	}
	
	public void buscarArquivoProfessor() throws IOException, ClassNotFoundException {
		FileInputStream file = new FileInputStream("Professores.dat");
		ObjectInputStream is = new ObjectInputStream(file);
		professores = (ArrayList<Professor>) is.readObject();
		is.close();
	}

	public void addProfessor(Professor p) throws UsuarioJaCadastradoException, IOException{
		if(buscarProfessorLogin(p.getLogin()) != null){
			throw new UsuarioJaCadastradoException("Professor Já cadastrado! ");
		}
		professores.add(p);
		contadorProfessor ++;
		salvarArquivoProfessor();
	}
	
	public void removerProfessorNome(String nome) throws UsuarioNaoEncontradoException, IOException {
		Professor p = buscarProfessorNome(nome);
		if(p == null) {
			throw new UsuarioNaoEncontradoException("Professor não encontrado! ");
		}
		professores.remove(p);
		salvarArquivoProfessor();
	}
	
	public void removerProfessorLogin(String login) throws UsuarioNaoEncontradoException, IOException {
		Professor p = buscarProfessorLogin(login);
		if(p == null) {
			throw new UsuarioNaoEncontradoException("Professor não encontrado! ");
		}
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
	
	public void alterarSenhaProfessor(Professor professor) throws UsuarioNaoEncontradoException, IOException{ 
		Professor p = buscarProfessorLogin(professor.getLogin());
		if(p == null) {
			throw new UsuarioNaoEncontradoException("Professor não encontrado! ");
		} 
		professor.setSenha(p.getSenha());
		salvarArquivoProfessor();
	}
	
	public void alterarNomeProfessor(Professor professor) throws UsuarioNaoEncontradoException, IOException{ 
		Professor p = buscarProfessorLogin(professor.getLogin());
		if(p == null) {
			throw new UsuarioNaoEncontradoException("Professor não encontrado! ");
		} 
		professor.setNome(p.getNome());
		salvarArquivoProfessor();
	}
	
}