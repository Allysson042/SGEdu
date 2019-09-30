package br.ufrpe.SGEdu.usuarios;
import br.ufrpe.SGEdu.turma.*;
import java.util.ArrayList;
import br.ufrpe.SGEdu.boletim.*;
import br.ufrpe.SGEdu.gestao.Notificacao;
import br.ufrpe.SGEdu.gestao.*;

/**
 * Classe Aluno
 * @author Allysson
 */
public class Aluno extends Usuario {
    private Responsavel responsavel;
    private Turma turma;
    private ArrayList<String> notificacoes = new ArrayList<>();

    /**
     * Construtor Aluno
     * @param nome
     * @param login
     * @param senha
     * @param responsavel
     * @param turma
     */
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

    public void addNotificacao(String notificacao) {
        this.notificacoes.add(notificacao);
    }
    public void exibirNotificacao() {
        if (notificacoes.isEmpty()){
            System.out.println("" +
                    "*********************************************\n" +
                    "    NÃO TEM NENHUMA NOTIFICAÇÃO PARA VOCÊ\n" +
                    "*********************************************\n");
        } else {
            for (String mensagem: notificacoes) {
                System.out.println(mensagem+"\n");
            }
        }
    }
}