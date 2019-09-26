package br.ufrpe.SGEdu.turma;

import br.ufrpe.SGEdu.usuarios.*;

import java.util.ArrayList;

public class Turma {
    private String nome;
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    private ArrayList<Professor> professores = new ArrayList<Professor>();


    public Turma(String nome) {
        this.nome = nome;
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void addProfessores(Professor professor) {
        professores.add(professor);
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

    public void printaProfessores() {
        int i;
        for (i = 0; i < professores.size(); i++) {
            System.out.printf("Professor %d: %s \n", i,professores.get(i).getNome());
        }


    }
}
