package sgedu.usuarios;

import java.io.Serializable;
import java.util.ArrayList;
import sgedu.diario.Boletim;
import sgedu.repositorios.RepositorioAluno;

/**
 * Class Aluno
 * @author Allysson & Lucas Leonardo
 */
public class Aluno extends Usuario implements Serializable{
	
	private ArrayList<Boletim> boletins;
	private Responsavel responsavel;
	private String login;
	
    public Aluno(String nome, String senha){
        super(nome, senha);
        this.gerarLogin();
    }

	public ArrayList<Boletim> getBoletins() {
		return boletins;
	}

	public void addBoletins(Boletim boletim) {
		boletins.add(boletim);
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