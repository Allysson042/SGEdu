package br.ufrpe.SGEdu.menu;
import java.util.Scanner;

import br.ufrpe.SGEdu.turma.Turma;
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
        Coordenador coord = new Coordenador("admin", "admin", "admin");
        Responsavel respo = new Responsavel("juse", "juse", "juse");
        Turma turm = new Turma("3a");
        Aluno alun = new Aluno("aluno", "aluno", "aluno", respo, turm);
        repositorio.adicionarCoordenadores(coord);
        repositorio.adicionarAlunos(alun);
        repositorio.adicionarTurmas(turm);
        repositorio.adicionarResponsaveis(respo);

        do {
            System.out.println("" +
                    "*********************************************\n" +
                    "( 1 ) - PARA LOGIN COMO ALUNO\n" +
                    "( 2 ) - PARA LOGIN COMO RESPONSAVEL\n" +
                    "( 3 ) - PARA LOGIN COMO PROFESSOR\n" +
                    "( 4 ) - PARA LOGIN COMO COORDENADOR\n" +
                    "( 5 ) - PARA SAIR\n" +
                    "*********************************************\n" +
                    "DIGITE A OPÇÃO DESEJADA: ");
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
                                            "( 1 ) - PARA VER HISTÓRICO ESCOLAR\n" +
                                            "( 2 ) - PARA VER FREQUÊNCIA\n" +
                                            "( 3 ) - PARA VER NOTIFICAÇÔES\n" +
                                            "( 4 ) - PARA SAIR\n" +
                                            "*********************************************\n" +
                                            "DIGITE A OPÇÃO DESEJADA: ");
                                    opcao_menu_aluno = sc.next();
                                    System.out.println("" +
                                            "*********************************************\n");
                                    switch (opcao_menu_aluno) {
                                        case "1":
                                            //EXIBIR HISTÓRICO ESCOLAR
                                        case "2":
                                            //EXIBIR FREQUÊNCIA
                                        case "3":
                                            aluno.exibirNotificacao();
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
                                            "( 1 ) - PARA VER HISTÓRICO ESCOLAR\n" +
                                            "( 2 ) - PARA VER FREQUÊNCIA\n" +
                                            "( 3 ) - PARA VER NOTIFICAÇÔES\n" +
                                            "( 4 ) - PARA SAIR\n" +
                                            "*********************************************\n" +
                                            "DIGITE A OPÇÃO DESEJADA: ");
                                    opcao_menu_responsavel = sc.next();
                                    System.out.println("" +
                                            "*********************************************\n");
                                    switch (opcao_menu_responsavel) {
                                        case "1":
                                            //EXIBIR HISTÓRICO ESCOLAR
                                        case "2":
                                            //EXIBIR FREQUÊNCIA
                                        case "3":
                                            responsavel.exibirNotificacao();
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
                                            "( 2 ) - PARA ADICIONAR FREQUÊNCIA\n" +
                                            "( 3 ) - PARA FAZER UMA NOTIFICAÇÃO\n" +
                                            "( 4 ) - PARA SAIR\n" +
                                            "*********************************************\n" +
                                            "DIGITE A OPÇÃO DESEJADA: ");
                                    opcao_menu_professor = sc.next();
                                    System.out.println("" +
                                            "*********************************************\n");
                                    switch (opcao_menu_professor) {
                                        case "1":
                                            //EXIBIR HISTÓRICO ESCOLAR
                                        case "2":
                                            //EXIBIR FREQUÊNCIA
                                        case "3":
                                            String opcao_notif_prof;
                                            do {
                                                System.out.println("" +
                                                        "****************************************\n" +
                                                        "SEJA BEM VINDO A CENTRAL DE NOTIFICAÇÕES\n" +
                                                        "****************************************\n" +
                                                        "DIGITE ( 1 ) - PARA UMA TURMA TODA\n" +
                                                        "DIGITE ( 2 ) - PARA UM RESPONSÁVEL EM ESPECÍFICO\n" +
                                                        "DIGITE ( 3 ) - PARA UM ALUNO EM ESPECÍFICO\n" +
                                                        "DIGITE ( 4 ) - PARA VOLTAR\n" +
                                                        "****************************************\n" +
                                                        "PARA QUEM VOCÊ DESEJA ENVIAR A NOTIFICAÇÃO: ");
                                                opcao_notif_prof = sc.next();

                                                switch(opcao_notif_prof) {
                                                    case "2":
                                                        String nomeResponsavel;
                                                        System.out.println("" +
                                                                "****************************************\n" +
                                                                "DIGITE O NOME DO RESPONSÁVEL QUE VOCÊ DESEJA ENVIAR A NOTIFICAÇÃO: ");
                                                        nomeResponsavel = sc.nextLine();
                                                        System.out.println("****************************************\n");

                                                        for (Responsavel nome: repositorio.getResponsaveis()) {
                                                            if (nome.getNome().equals(nomeResponsavel)){
                                                                String mensagem;
                                                                System.out.println("" +
                                                                        "****************************************\n" +
                                                                        "DIGITE A NOTIFICACAO QUE DESEJA ENVIAR: ");
                                                                mensagem = sc.next();
                                                                System.out.println("****************************************\n");

                                                                nome.addNotificacao(mensagem);
                                                            } else {
                                                                System.out.println("" +
                                                                        "RESPONSÁVEL NÃO ENCONTRADO" +
                                                                        "****************************************\n");
                                                            }
                                                        }

                                                        continue;

                                                    case "3":
                                                        String nomeAluno;
                                                        System.out.println("" +
                                                                "****************************************\n" +
                                                                "DIGITE O NOME DO ALUNO QUE VOCÊ DESEJA ENVIAR A NOTIFICAÇÃO: ");
                                                        nomeAluno = sc.nextLine();
                                                        System.out.println("****************************************\n");

                                                        for (Aluno nome: repositorio.getAlunos()) {
                                                            if (nome.getNome().equals(nomeAluno)){
                                                                String mensagem;
                                                                System.out.println("" +
                                                                        "****************************************\n" +
                                                                        "DIGITE A NOTIFICACAO QUE DESEJA ENVIAR: ");
                                                                mensagem = sc.next();
                                                                System.out.println("****************************************\n");

                                                                nome.addNotificacao(mensagem);
                                                            } else {
                                                                System.out.println("" +
                                                                        "ALUNO NÃO ENCONTRADO" +
                                                                        "****************************************\n");
                                                            }
                                                        }

                                                        continue;
                                                }
                                            } while (!opcao_notif_prof.equals("4"));
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
                                            "( 4 ) - PARA FAZER UMA NOTIFICAÇÃO\n" +
                                            "( 5 ) - ADICIONAR PROFESSOR EM TURMA\n" +
                                            "( 6 ) - PARA SAIR\n" +
                                            "*********************************************\n" +
                                            "DIGITE A OPÇÃO DESEJADA: ");
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
                                            String opcao_notif_coord;
                                            do {
                                                System.out.println("" +
                                                        "****************************************\n" +
                                                        "SEJA BEM VINDO A CENTRAL DE NOTIFICAÇÕES\n" +
                                                        "****************************************\n" +
                                                        "DIGITE ( 1 ) - PARA UMA TURMA TODA\n" +
                                                        "DIGITE ( 2 ) - PARA UM RESPONSÁVEL EM ESPECÍFICO\n" +
                                                        "DIGITE ( 3 ) - PARA UM ALUNO EM ESPECÍFICO\n" +
                                                        "DIGITE ( 4 ) - PARA VOLTAR\n" +
                                                        "****************************************\n" +
                                                        "PARA QUEM VOCÊ DESEJA ENVIAR A NOTIFICAÇÃO: ");
                                                opcao_notif_coord = sc.next();

                                                switch(opcao_notif_coord) {
                                                    case "1":
                                                        break;
                                                    case "2":
                                                        String nomeResponsavel = null;
                                                        System.out.println("" +
                                                                "****************************************\n" +
                                                                "DIGITE O NOME DO RESPONSÁVEL QUE VOCÊ DESEJA ENVIAR A NOTIFICAÇÃO: ");
                                                        nomeResponsavel = sc.nextLine();
                                                        System.out.println("****************************************\n");

                                                        for (Responsavel nome: repositorio.getResponsaveis()) {
                                                            if (nome.getNome().equals(nomeResponsavel)){
                                                                String mensagem;
                                                                System.out.println("" +
                                                                        "****************************************\n" +
                                                                        "DIGITE A NOTIFICACAO QUE DESEJA ENVIAR: ");
                                                                mensagem = sc.nextLine();
                                                                System.out.println("" +
                                                                        "****************************************\n");

                                                                nome.addNotificacao(mensagem);
                                                            } else {
                                                                System.out.println("" +
                                                                        "RESPONSÁVEL NÃO ENCONTRADO\n" +
                                                                        "****************************************\n");
                                                            }
                                                        }

                                                        break;

                                                    case "3":
                                                        String nomeAluno;
                                                        System.out.println("" +
                                                                "****************************************\n" +
                                                                "DIGITE O NOME DO ALUNO QUE VOCÊ DESEJA ENVIAR A NOTIFICAÇÃO: ");
                                                        nomeAluno = sc.nextLine();
                                                        System.out.println("****************************************\n");

                                                        for (Aluno nome: repositorio.getAlunos()) {
                                                            if (nome.getNome().equals(nomeAluno)){
                                                                String mensagem;
                                                                System.out.println("" +
                                                                        "****************************************\n" +
                                                                        "DIGITE A NOTIFICACAO QUE DESEJA ENVIAR: ");
                                                                mensagem = sc.next();
                                                                System.out.println("****************************************\n");

                                                                nome.addNotificacao(mensagem);
                                                            } else {
                                                                System.out.println("" +
                                                                        "ALUNO NÃO ENCONTRADO" +
                                                                        "****************************************\n");
                                                            }
                                                        }

                                                        break;
                                                }
                                            } while (!opcao_notif_coord.equals("4"));
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