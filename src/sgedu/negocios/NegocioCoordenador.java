package sgedu.negocios;

import java.io.IOException;

import sgedu.dados.usuarios.IRepositorioCoordenador;
import sgedu.negocios.entidade.usuarios.Aluno;
import sgedu.negocios.entidade.usuarios.Coordenador;
import sgedu.negocios.excecoes.UsuarioJaCadastradoException;

public class NegocioCoordenador {
	
	private IRepositorioCoordenador repositorio;
	
	
	public NegocioCoordenador(IRepositorioCoordenador repositorio) {
		this.repositorio=repositorio;		
	}
	
	public void adicionar(Coordenador coordenador) throws UsuarioJaCadastradoException, IOException {
		try {
			repositorio.buscarArquivoCoordenador();
		} catch(IOException e) {
			Coordenador coordenadorBusca = repositorio.buscarCoordenadorLogin(coordenador.getLogin());
			
			if(coordenadorBusca==null) {
				repositorio.addCoordenador(coordenador);
			} else {
				throw new UsuarioJaCadastradoException();
			}
		}
	}
	
	public Coordenador buscarLogin(String login) {
		return repositorio.buscarCoordenadorLogin(login);
	}
	
	
	
	public boolean confirmaLogin(String login, String senha) {
		return repositorio.buscarCoordenadorLogin(login).verificaSenha(senha);
	}
	
	
	public Aluno cadatrarAluno(String nome, String senha) {
		Aluno aluno=new Aluno(nome, senha);
		return aluno;
	}
	
	
	
	
	
	
	
	
	

}
