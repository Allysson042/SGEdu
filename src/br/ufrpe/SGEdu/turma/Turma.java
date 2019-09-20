package br.ufrpe.SGEdu.turma;

import br.ufrpe.SGEdu.aluno.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Turma {
    private String nome;
    //private Aluno alunos[];
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();


    public Turma(String nome) {
        this.nome = nome;
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public String getNome() {
        return nome;
    }

    public void printaAlunos() {
        int i;
        for (i = 0; i < alunos.size(); i++) {
            System.out.printf("Aluno %d: %s \n", i, alunos.get(i).getNome());
        }

    }
}
