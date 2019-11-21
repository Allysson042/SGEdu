package sgedu.negocios.entidade.usuarios;

import java.io.Serializable;

import sgedu.dados.usuarios.RepositorioAluno;

/**
 * Class Aluno
 * @author Allysson & Lucas Leonardo
 */
public class Aluno extends Usuario implements Serializable{
	
	private Responsavel responsavel;
	private String login;
	
    public Aluno(String nome, String senha){
        super(nome, senha);
        this.gerarLogin();
    }
	
	public Responsavel getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}

	@Override
	public String gerarLogin() {
		login = "ALUNO" + RepositorioAluno.contadorAluno; 
		return login;
	}

}