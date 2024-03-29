package sgedu.dados.usuarios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import sgedu.negocios.entidade.usuarios.Aluno;

public class RepositorioAluno implements IRepositorioAluno{
	
	ArrayList <Aluno> alunos;
	public static int contadorAluno;
	
	public RepositorioAluno() {
		alunos = new ArrayList<Aluno>();
		contadorAluno=0;
	}
	
	public void salvarArquivoAluno() throws IOException {
		FileOutputStream file = new FileOutputStream("Alunos.dat");
		ObjectOutputStream os = new ObjectOutputStream(file);
		os.writeObject(alunos);
		os.close();
		salvarContadorAluno();
	}
	
	public void buscarArquivoAluno() throws IOException {
		try {
			FileInputStream file = new FileInputStream("Alunos.dat");
			ObjectInputStream is = new ObjectInputStream(file);
			alunos = (ArrayList<Aluno>) is.readObject();
			is.close();
			salvarArquivoAluno();
			salvarContadorAluno();
		} catch (IOException | ClassNotFoundException e) {
			salvarArquivoAluno();
		}
		
	}
	
	public void addAluno(Aluno a) throws IOException{
		alunos.add(a);
		System.out.println("CONTADOR: "+contadorAluno);
		contadorAluno ++;
		System.out.println("CONTADOR: "+contadorAluno);
		salvarArquivoAluno();
		
	}
	
	public void removerAlunoNome(String nome) throws IOException{
		Aluno a = buscarAlunoNome(nome);
		
		alunos.remove(a);
		salvarArquivoAluno();
	}
	
	public void removerAlunoLogin(String login) throws IOException{
		Aluno a = buscarAlunoLogin(login);
		
		alunos.remove(a);
		salvarArquivoAluno();
	}
	
	public Aluno buscarAlunoNome(String nome){
		for(int i=0; i<alunos.size(); i++) {
			if(alunos.get(i).getNome().contentEquals(nome)) {
				return alunos.get(i);
			}
		}
		return null;
	}
	
	public Aluno buscarAlunoLogin(String login){
		for(int i=0; i<alunos.size(); i++) {
			if(alunos.get(i).getLogin().contentEquals(login)) {
				return alunos.get(i);
			}
		}
		return null;
	}
	
	public void alterarNomeAluno(Aluno aluno) throws IOException{ 
		Aluno a = buscarAlunoNome(aluno.getNome());
		
		aluno.setNome(a.getNome());
		salvarArquivoAluno();
	}
	
	public void alterarSenhaAluno(Aluno aluno) throws IOException{ 
		Aluno a = buscarAlunoLogin(aluno.getLogin());
		
		aluno.setSenha(a.getSenha());
		salvarArquivoAluno();
	}
	
	public void salvarContadorAluno() throws IOException {
		FileOutputStream file = new FileOutputStream("ContadorAluno.dat");
		ObjectOutputStream os = new ObjectOutputStream(file);
		os.writeInt(contadorAluno);
		os.close();
	}
	
	
	public void buscarContadorAluno() throws IOException {
		try {
			FileInputStream file = new FileInputStream("ContadorAluno.dat");
			ObjectInputStream is = new ObjectInputStream(file);
			contadorAluno = (int) is.readObject();
			is.close();
			salvarContadorAluno();
		} catch (IOException | ClassNotFoundException e) {
			salvarContadorAluno();
		}
	}
}