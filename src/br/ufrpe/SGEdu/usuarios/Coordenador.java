package br.ufrpe.SGEdu.usuarios;
import java.util.Scanner;

import br.ufrpe.SGEdu.repositorio.Repositorio;
import br.ufrpe.SGEdu.turma.Turma;

/**
 * Class Coordenador
 * @author Allysson & Lucas Leonardo
 */
public class Coordenador extends Usuario {
    Scanner sc = new Scanner(System.in);

    public Coordenador(String nome, String login, String senha) {
        super(nome, login, senha);
    }

    public void cadastrarProfessor(Repositorio repositorio) {
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
                "*********************************************\n" +
                "       PROFESSOR CADASTRADO COM SUCESSO\n" +
                "*********************************************\n");
    }

    public void cadastrarTurma(Repositorio repositorio) {
        String nome;
        System.out.println("" +
                "*********************************************\n" +
                "              CADASTRAR TURMAS\n" +
                "*********************************************\n" +
                "NOME DA TURMA: ");
        nome= sc.next();

        Turma turma = new Turma(nome);
        repositorio.adicionarTurmas(turma);
        System.out.println(""
                + "*********************************************\n" +
                "TURMA CADASTRADA COM SUCESSO: "+
                "*********************************************\n");
    }

    public void cadastrarAluno(Repositorio repositorio) {
        String nome,login,senha, nome_responsavel="",nome_turma="";
        Responsavel responsavel_aluno=null;
        Turma turma_aluno = null;
        System.out.println("" +
                "*********************************************\n" +
                "              CADASTRAR ALUNOS\n" +
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

                    break;
                }
            }
            if (nome_responsavel==""||nome_responsavel=="sair") {
                System.out.println("" +
                        "*********************************************\n" +
                        "        RESPONSAVEL NAO ENCONTRADO\n" +
                        "*********************************************\n" +
                        "INSIRA OUTRO NOME DO RESPONSÃ�VEL\n"+
                        "OU DIGITE SAIR PARA SAIR: ");
                nome_responsavel = sc.next();

            }
            if (nome_responsavel.toUpperCase().equals("SAIR")||nome_responsavel!="") {
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
            if (nome_responsavel==""||nome_responsavel=="sair") {
                System.out.println("" +
                        "*********************************************\n" +
                        "           TURMA NAO ENCONTRADA\n" +
                        "*********************************************\n" +
                        "INSIRA OUTRO NOME DA TURMA OU DIGITE SAIR PARA SAIR: ");
                nome_turma= sc.next();

            }
            if (nome_responsavel.toUpperCase().equals("SAIR")||nome_responsavel!="") {
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
        responsavel_aluno.addAluno(aluno);
    }

    public void cadastrarResponsavel(Repositorio repositorio) {
        String nome,login,senha;

        System.out.println("" +
                "*********************************************\n" +
                "              CADASTRAR RESPONSAVEL\n" +
                "*********************************************\n" +
                "NOME DO RESPONSAVEL: ");
        nome= sc.next();

        System.out.println("" +
                "LOGIN DO RESPONSAVEL: ");
        login= sc.next();

        System.out.println("" +
                "SENHA DO RESPONSAVEL: ");
        senha= sc.next();

        Responsavel responsavel =new Responsavel(nome,login,senha);

        repositorio.adicionarResponsaveis(responsavel);
    }


    public void adicionarProfessoremTurma(Repositorio repositorio) {
        String nome_professor="", nome_turma="";
        Professor prof = null;
        Turma tur=null;
        System.out.println("" +
                "*********************************************\n" +
                "              Adicionar professor em turma\n" +
                "*********************************************\n" +
                "");

        while (!nome_professor.toUpperCase().equals("SAIR")){
            System.out.println("" +
                    "NOME DO professor: ");
            nome_professor= sc.next();

            for(Professor professor: repositorio.getProfessores()) {
                if(professor.getNome().equals(nome_professor)) {
                    prof=professor;
                    System.out.println("professor encontrado");

                }
            }
            if (nome_professor==""||nome_professor=="sair") {
                System.out.println("" +
                        "*********************************************\n" +
                        "           professor NAO ENCONTRADA\n" +
                        "*********************************************\n" +
                        "INSIRA OUTRO NOME De professor \n"+
                        "OU DIGITE SAIR PARA SAIR");
                nome_professor= sc.next();

            }
            if (nome_professor.toUpperCase().equals("SAIR")||nome_professor!="") {
                break;
            }
        }




        while (!nome_turma.toUpperCase().equals("SAIR")){
            System.out.println("" +
                    "NOME Da Turma: ");
            nome_turma= sc.next();

            for(Turma turma: repositorio.getTurmas()) {
                if(turma.getNome().equals(nome_turma)) {
                    tur=turma;
                    System.out.println("Turma encontrada");
                }
            }
            if (nome_turma==""||nome_turma=="sair") {
                System.out.println("" +
                        "*********************************************\n" +
                        "           TURMA NAO ENCONTRADA\n" +
                        "*********************************************\n" +
                        "INSIRA OUTRO NOME DA TURMA \n"+
                        "OU DIGITE SAIR PARA SAIR");
                nome_turma= sc.next();

            }
            if (nome_turma.toUpperCase().equals("SAIR")||nome_turma!="") {
                break;
            }
        }

        tur.addProfessor(prof);

    }
}