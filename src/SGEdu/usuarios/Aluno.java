package SGEdu.usuarios;
import java.io.Serializable;
import java.util.ArrayList;


import SGEdu.diario.Boletim;


/**
 * Class Aluno
 * @author Allysson & Lucas Leonardo
 */
public class Aluno extends Usuario implements Serializable{
	
	private ArrayList<Boletim> boletins;
	private Responsavel responsavel;
	
    public Aluno(String nome, String login, String senha){
        super(nome, login, senha);
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

}