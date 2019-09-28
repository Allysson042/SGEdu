package br.ufrpe.SGEdu.menu;
import java.util.Scanner;
import br.ufrpe.SGEdu.usuarios.Aluno;
import br.ufrpe.SGEdu.repositorio.Repositorio;
import br.ufrpe.SGEdu.usuarios.Coordenador;
import br.ufrpe.SGEdu.usuarios.Professor;
import br.ufrpe.SGEdu.usuarios.Responsavel;
import br.ufrpe.SGEdu.script.*;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Repositorio repositorio = new Repositorio();
        Script script = new Script();
        script.addCoordenador(repositorio);
        String opcao;

        do {
            System.out.println("" +
                    "*********************************************\n" +
                    "( 1 ) - PARA LOGIN COMO ALUNO\n" +
                    "( 2 ) - PARA LOGIN COMO RESPONSAVEL\n" +
                    "( 3 ) - PARA LOGIN COMO PROFESSOR\n" +
                    "( 4 ) - PARA LOGIN COMO COORDENADOR\n" +
                    "( 5 ) - PARA SAIR\n" +
                    "*********************************************\n" +
                    "DIGITE A OP??O DESEJADA: ");
            opcao = sc.next();
            System.out.println("" +
                    "*********************************************\n");
            switch (opcao) {
                case "1":
                    String login_aluno, senha_aluno;
                    System.out.println("" +
                            "*********************************************\n" +
                            "USUARIO: ");
                    login_aluno = sc.next();
                    System.out.println("" +
                            "SENHA: ");
                    senha_aluno = sc.next();
                    System.out.println("" +
                            "*********************************************\n");
                    for (Aluno aluno : repositorio.getAlunos()) {
                        if (aluno.getLogin().equals(login_aluno)) {
                            if (aluno.verificaSenha(senha_aluno)) {
                                String opcao_menu_aluno;
                                do {
                                    System.out.println("" +
                                            "*********************************************\n" +
                                            "( 1 ) - PARA VER HIST?RICO ESCOLAR\n" +
                                            "( 2 ) - PARA VER FREQU?NCIA\n" +
                                            "( 3 ) - PARA VER NOTIFICA??ES\n" +
                                            "( 4 ) - PARA SAIR\n" +
                                            "*********************************************\n" +
                                            "DIGITE A OP??O DESEJADA: ");
                                    opcao_menu_aluno = sc.next();
                                    System.out.println("" +
                                            "*********************************************\n");
                                    switch (opcao_menu_aluno) {
                                        case "1":
                                            //EXIBIR HIST?RICO ESCOLAR
                                        case "2":
                                            //EXIBIR FREQU?NCIA
                                        case "3":
                                            //PARA VER NOTIFICA??ES
                                    }
                                } while (!opcao_menu_aluno.equals("4"));
                            }
                        } else {
                            System.out.println("" +
                                    "*********************************************\n" +
                                    "LOGIN OU SENHA INCORRETOS!\n" +
                                    "*********************************************\n");
                        }
                    }
                break;

                case "2":
                    String login_responsavel, senha_responsavel;
                    System.out.println("" +
                            "*********************************************\n" +
                            "USUARIO: ");
                    login_responsavel = sc.next();
                    System.out.println("" +
                            "SENHA: ");
                    senha_responsavel = sc.next();
                    System.out.println("" +
                            "*********************************************\n");

                    for (Responsavel responsavel : repositorio.getResponsaveis()) {
                        if (responsavel.getLogin().equals(login_responsavel)) {
                            if (responsavel.verificaSenha(senha_responsavel)) {
                                String opcao_menu_responsavel;
                                do {
                                    System.out.println("" +
                                            "*********************************************\n" +
                                            "( 1 ) - PARA VER HIST?RICO ESCOLAR\n" +
                                            "( 2 ) - PARA VER FREQU?NCIA\n" +
                                            "( 3 ) - PARA VER NOTIFICA??ES\n" +
                                            "( 4 ) - PARA SAIR\n" +
                                            "*********************************************\n" +
                                            "DIGITE A OP??O DESEJADA: ");
                                    opcao_menu_responsavel = sc.next();
                                    System.out.println("" +
                                            "*********************************************\n");
                                    switch (opcao_menu_responsavel) {
                                        case "1":
                                            //EXIBIR HIST?RICO ESCOLAR
                                        case "2":
                                            //EXIBIR FREQU?NCIA
                                        case "3":
                                            //PARA VER NOTIFICA??ES
                                    }
                                } while (!opcao_menu_responsavel.equals("4"));
                            }
                        }
                    }
                break;

                case "3":
                    String login_professor, senha_professor;
                    System.out.println("" +
                            "*********************************************\n" +
                            "USUARIO: ");
                    login_professor = sc.next();
                    System.out.println("" +
                            "SENHA: ");
                    senha_professor = sc.next();
                    System.out.println("" +
                            "*********************************************\n");
                    for (Professor professor : repositorio.getProfessores()) {
                        if (professor.getLogin().equals(login_professor)) {
                            if (professor.verificaSenha(senha_professor)) {
                                String opcao_menu_professor;
                                do {
                                    System.out.println("" +
                                            "*********************************************\n" +
                                            "( 1 ) - PARA ADICIONAR NOTAS\n" +
                                            "( 2 ) - PARA ADICIONAR FREQU?NCIA\n" +
                                            "( 3 ) - PARA FAZER UMA NOTIFICA??O\n" +
                                            "( 4 ) - PARA SAIR\n" +
                                            "*********************************************\n" +
                                            "DIGITE A OP??O DESEJADA: ");
                                    opcao_menu_professor = sc.next();
                                    System.out.println("" +
                                            "*********************************************\n");
                                    switch (opcao_menu_professor) {
                                        case "1":
                                            //EXIBIR HIST?RICO ESCOLAR
                                        case "2":
                                            //EXIBIR FREQU?NCIA
                                        case "3":
                                            //PARA VER NOTIFICA??ES
                                    }
                                } while (!opcao_menu_professor.equals("4"));
                            }
                        }
                    }
                break;

                case "4":
                    String login_coordenador, senha_coordenador;
                    System.out.println("" +
                            "*********************************************\n" +
                            "USUARIO: ");
                    login_coordenador = sc.next();
                    System.out.println("" +
                            "SENHA: ");
                    senha_coordenador = sc.next();
                    System.out.println("" +
                            "*********************************************\n");
                    for (Coordenador coordenador : repositorio.getCoordenadores()) {
                        if (coordenador.getLogin().equals(login_coordenador)) {
                            if (coordenador.verificaSenha(senha_coordenador)) {
                                String opcao_menu_coordenador;
                                do {
                                    System.out.println("" +
                                            "*********************************************\n" +
                                            "( 1 ) - PARA CADASTRAR PROFESSORES\n" +
                                            "( 2 ) - PARA CADASTRAR ALUNOS\n" +
                                            "( 3 ) - PARA CADASTRAR TURMAS\n" +
                                            "( 4 ) - PARA FAZER UMA NOTIFICA??O\n" +
                                            "( 5 ) - ADICIONAR PROFESSOR EM TURMA\n" +
                                            "( 6 ) - PARA SAIR\n" +
                                            "*********************************************\n" +
                                            "DIGITE A OP??O DESEJADA: ");
                                    opcao_menu_coordenador = sc.next();
                                    System.out.println("" +
                                            "*********************************************\n");
                                    switch (opcao_menu_coordenador) {
                                        case "1":
                                            coordenador.cadProfessor(repositorio);
                                            continue;
                                        case "2":
                                            coordenador.cadAluno(repositorio);
                                            continue;
                                        case "3":
                                            coordenador.cadTurma(repositorio);
                                            continue;
                                        case "4":
                                            //FAZER NOTIFICA??O
                                        case "5":
                                            //ADICIONAR PROFESSOR EM TURMA
                                    }
                                } while (!opcao_menu_coordenador.equals("6"));
                            }
                        }
                    }
                break;
            }
        } while (!opcao.equals("5"));
    }
}