package br.ufrpe.SGEdu.main;
import br.ufrpe.SGEdu.aluno.*;
import br.ufrpe.SGEdu.turma.*;
import br.ufrpe.SGEdu.gestao.*;

public class Teste {
    public static void main(String[] args){
        Turma turma1=new Turma("6軒no");

        Aluno aluno1=new Aluno("Jooj da silva", turma1);

        System.out.printf("nome do aluno\n");
        aluno1.getNome();
        System.out.printf("turma do aluno\n");
        aluno1.getTurma();

        turma1.addAluno(aluno);
        System.out.printf("printa alunos\n");
        turma1.printaAlunos();
    }
}

