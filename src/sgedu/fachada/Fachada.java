package sgedu.fachada;

import java.io.IOException;

import sgedu.dados.usuarios.RepositorioAluno;
import sgedu.dados.usuarios.RepositorioCoordenador;
import sgedu.dados.usuarios.RepositorioProfessor;
import sgedu.dados.usuarios.UsuarioJaCadastradoException;
import sgedu.negocios.NegocioAluno;
import sgedu.negocios.NegocioCoordenador;
import sgedu.negocios.NegocioProfessor;
import sgedu.negocios.entidade.usuarios.Aluno;
import sgedu.negocios.entidade.usuarios.Coordenador;
import sgedu.negocios.entidade.usuarios.Professor;


public class Fachada {
	private static Fachada objeto;
	
	private NegocioAluno negocioAluno;
	private NegocioCoordenador negocioCoordenador;
	private NegocioProfessor negocioProfessor;
	

	private Fachada() {
		RepositorioAluno repositorioAluno=new RepositorioAluno();
		this.negocioAluno=new NegocioAluno(repositorioAluno);
		RepositorioCoordenador repositorioCoordenador=new RepositorioCoordenador();
		this.negocioCoordenador=new NegocioCoordenador(repositorioCoordenador);
		RepositorioProfessor repositorioProfessor=new RepositorioProfessor();
		this.negocioProfessor=new NegocioProfessor(repositorioProfessor);
	
	}
	

	public static Fachada criaObjeto() {
		if(objeto==null) {
			objeto=new Fachada();
		}
		return objeto;
	}
	
	
	///////////////////Aluno
	public void adicionarAluno(Aluno aluno) throws UsuarioJaCadastradoException, IOException {
		negocioAluno.adicionar(aluno);
	}
	
	
	public boolean confirmaLoginAluno(String login, String senha) {
		return negocioAluno.confirmaLogin(login, senha);
	}
	
	
	
	
	////////////////Coordenador
	
	public void adicionarCoordenador(Coordenador coordenador) throws UsuarioJaCadastradoException, IOException{
			negocioCoordenador.adicionar(coordenador);
	}
	
	public boolean confirmaLoginCoordenador(String login, String senha) {
		return negocioCoordenador.confirmaLogin(login, senha);
	}
	
	
	/////////professor
	
	public void adicionarProfessor(Professor professor) throws UsuarioJaCadastradoException, IOException {
		negocioProfessor.adicionar(professor);
	}
	
	public boolean confirmaLoginProfessor(String login, String senha) {
		return negocioProfessor.confirmaLogin(login, senha);
	}
	
	
	
	
}
