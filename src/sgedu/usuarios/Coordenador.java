package sgedu.usuarios;

import java.io.Serializable;

import sgedu.repositorios.RepositorioCoordenador;

/**
 * Class Coordenador
 * @author Allysson & Lucas Leonardo
 */

public class Coordenador extends Usuario implements Serializable{
	
	private String login;
	
    public Coordenador(String nome, String senha) {
        super(nome, senha);
    }
    
    @Override
	public String gerarLogin() {
		login = "COORD" + RepositorioCoordenador.contadorCoordenador;
		return login;
	}
}
