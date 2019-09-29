package br.ufrpe.SGEdu.usuarios;

import java.util.ArrayList;

/**
 * Classe Responsavel, cria objetos Responsavel ao qual é associado a Aluno, SubClasse de Usuario;
 * @author
 */
public class Responsavel extends Usuario {
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    /**
     * Construtor Responsavel
     * @param nome
     * @param login
     * @param senha
     */
    public Responsavel(String nome, String login, String senha) {
        super(nome, login, senha);
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

}