package br.ufrpe.SGEdu.usuarios;

import java.util.ArrayList;

public class Responsavel extends Usuario {
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    

    public Responsavel(String nome, String login, String senha) {
        super(nome, login, senha);
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

}