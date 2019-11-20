package sgedu.negocios.entidade.usuarios;

import java.io.Serializable;
import java.util.ArrayList;

import sgedu.dados.usuarios.RepositorioResponsavel;;

/**
 * Class Responsavel
 * @author Allysson & Lucas Leonardo
 */

public class Responsavel extends Usuario implements Serializable{
	private String login;
    private ArrayList<Aluno> alunos;

    //obrigatório ao menos 1 aluno para associar o responsável
    public Responsavel(String nome, String senha) {
        super(nome, senha);
        this.alunos = new ArrayList<Aluno>();
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

	@Override
	public String gerarLogin() {
		login = "RESP" + RepositorioResponsavel.contadorResponsavel;
		return login;
	}

}
