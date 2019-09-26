package br.ufrpe.SGEdu.aluno;
import br.ufrpe.SGEdu.turma.*;

public class Aluno {
    private String nome;
    //private Responsavel responsavel;
    private Turma turma;
    private int id;
    private String login;
    private String senha;

    public Aluno(String nome, Turma turma){
        this.nome=nome;
        this.turma=turma;

        //turma.addAluno();
    }

    public void setNome(String nome) {
        this.nome=nome;
    }
    public String getNome() {
        return nome;
    }

	/*public void setResponsavel(Responsavel responsavel) {
		this.responsavel=responsavel;
	}
	public String getResponsavel() {
		return responsavel;
	} */

    public void setTurma(Turma turma) {
        this.turma=turma;
    }
    public Turma getTurma() {
        return turma;
    }
}
