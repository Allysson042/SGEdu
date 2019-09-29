package br.ufrpe.SGEdu.usuarios;
import java.util.Scanner;

import br.ufrpe.SGEdu.repositorio.Repositorio;
import br.ufrpe.SGEdu.turma.Turma;

/**
 * Classe Coordenador, cria objetos coordenador, SubClasse de Usuario;
 * @author
 */
public class Coordenador extends Usuario {
    Scanner sc = new Scanner(System.in);

    /**
     * Construtor Coordenador
     * @param nome
     * @param login
     * @param senha
     */
    public Coordenador(String nome, String login, String senha) {
        super(nome, login, senha);
    }

    //cad=cadastrar
    public void cadProfessor(Repositorio repositorio) {
        String nome, login, senha, disciplina;

        System.out.println("" +
                "**********************************************\n" +
                "            CADASTRAR PROFESSORES\n" +
                "**********************************************\n" +
                "NOME DO PROFESSOR: ");
        nome= sc.next();
        System.out.println("" +
                "DISCIPLINA: ");
        disciplina= sc.next();
        
        
        
        System.out.println("" +
                "LOGIN DO PROFESSOR: ");
        login= sc.next();
        System.out.println("" +
                "SENHA DO PROFESSOR: ");
        senha= sc.next();

        Professor professor = new Professor(nome, login, senha, disciplina);

        repositorio.adicionarProfessores(professor);

        System.out.println("" +
                "PROFESSOR CADASTRADO COM SUCESSO"+
                "*********************************************\n");
    }

    public void cadTurma(Repositorio repositorio) {
        String nome;
        System.out.println("" +
                "*********************************************\n" +
                "              CADASTRAR TURMAS\n" +
                "*********************************************\n" +
                "NOME DA TURMA: ");
        nome= sc.next();

        Turma turma = new Turma(nome);
        repositorio.adicionarTurmas(turma);
        System.out.println("" +
                "TURMA CADASTRADA COM SUCESSO: "+
                "*********************************************\n");
    }

    public void cadAluno(Repositorio repositorio) {
        String nome,login,senha, nome_responsavel="",nome_turma="";
        Responsavel responsavel_aluno=null;
        Turma turma_aluno = null;
        System.out.println("" +
                "*********************************************\n" +
                "              CADASTRAR ALUNOS" +
                "*********************************************\n" +
                "NOME DO ALUNO: : ");
        nome= sc.next();

        while (!nome_responsavel.toUpperCase().equals("SAIR")){
            System.out.println("" +
                    "NOME DO RESPONSÃ�VEL: ");
            nome_responsavel= sc.next();

            for(Responsavel responsavel: repositorio.getResponsaveis()) {
                if(responsavel.getNome().equals(nome_responsavel)) {
                    responsavel_aluno=responsavel;
                }
            }
            System.out.println("" +
                    "*********************************************\n" +
                    "        RESPONSAVEL NAO ENCONTRADO" +
                    "*********************************************\n" +
                    "INSIRA OUTRO NOME DO RESPONSÃ�VEL\n"+
                    "OU DIGITE SAIR PARA SAIR: ");
            nome_responsavel = sc.next();
            if (nome_responsavel.toUpperCase().equals("SAIR")) {
                break;
            }
        }

        while (!nome_turma.toUpperCase().equals("SAIR")){
            System.out.println("" +
                    "TURMA: ");
            nome_turma= sc.next();

            for(Turma turma: repositorio.getTurmas()) {
                if(turma.getNome().equals(nome_turma)) {
                    turma_aluno=turma;
                }
            }
            System.out.println("" +
                    "*********************************************\n" +
                    "           TURMA NAO ENCONTRADA\n" +
                    "*********************************************\n" +
                    "INSIRA OUTRO NOME DA TURMA \n"+
                    "OU DIGITE SAIR PARA SAIR");
            nome_turma= sc.next();
            if (nome_turma.toUpperCase().equals("SAIR")) {
                break;
            }
        }

        System.out.println("" +
                "LOGIN DO ALUNO: ");
        login= sc.next();

        System.out.println("" +
                "SENHA DO ALUNO: ");
        senha= sc.next();

        Aluno aluno=new Aluno(nome, login, senha, responsavel_aluno, turma_aluno);

        repositorio.adicionarAlunos(aluno);
    }


}
