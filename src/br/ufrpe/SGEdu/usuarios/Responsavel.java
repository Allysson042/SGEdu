package br.ufrpe.SGEdu.usuarios;
import java.util.ArrayList;

import br.ufrpe.SGEdu.diario.Boletim;
import br.ufrpe.SGEdu.repositorio.Repositorio;

/**
 * Class Responsavel
 * @author Allysson & Lucas Leonardo
 */

public class Responsavel extends Usuario {
    private ArrayList<Aluno> alunos;
    private ArrayList<String> notificacoes;
    
    //obrigatório ao menos 1 aluno para associar o responsável
    public Responsavel(String nome, String login, String senha) {
        super(nome, login, senha);
        this.alunos = new ArrayList<Aluno>();
        this.notificacoes = new ArrayList<>();
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
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