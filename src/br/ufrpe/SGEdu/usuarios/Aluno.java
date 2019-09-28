package br.ufrpe.SGEdu.usuarios;
import br.ufrpe.SGEdu.turma.*;
import java.util.ArrayList;
import br.ufrpe.SGEdu.boletim.*;

import br.ufrpe.SGEdu.gestao.*;

public class Aluno extends Usuario {
    private Responsavel responsavel;
    private Turma turma;
    private Notificacao[] notificacao;

    public Aluno(String nome, String login, String senha,Responsavel responsavel, Turma turma){
        super(nome, login, senha);
        this.responsavel=responsavel;
        this.turma=turma;

        // turma.addAluno();
    }


    public void setResponsavel(Responsavel responsavel) {
        this.responsavel=responsavel;
    }
    public String getResponsavel() {
        return responsavel.getNome();
    }

    public void setTurma(Turma turma) {
        this.turma=turma;
    }
    public Turma getTurma(Aluno aluno) {
        return aluno.turma;
    }
    
    
}