package br.ufrpe.SGEdu.usuarios;

import br.ufrpe.SGEdu.gestao.Notificacao;

import java.util.ArrayList;

public class Responsavel extends Usuario {
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    private ArrayList<String> notificacoes = new ArrayList<>();

    public Responsavel(String nome, String login, String senha) {
        super(nome, login, senha);
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