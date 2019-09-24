package br.ufrpe.SGEdu.turma;

import br.ufrpe.SGEdu.aluno.*;
import br.ufrpe.SGEdu.gestao.Professor;
import java.util.ArrayList;
import java.util.Arrays;

public class Turma {
    private String nome;
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    private ArrayList<Professor> professores = new ArrayList<Professor>();

    private String[][] horário = new String[5][5];

    public Turma(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void addProfessor(Professor professor) {
        professores.add(professor);
    }

    public void printaAlunos() {
        int i;
        for (i = 0; i < alunos.size(); i++) {
            System.out.printf("Aluno %d: %s \n", i, alunos.get(i).getNome());
        }

    }
}
