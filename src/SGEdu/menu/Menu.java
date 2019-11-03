package SGEdu.menu;
import java.util.Scanner;


import SGEdu.diario.*;
import SGEdu.repositorios.*;
import SGEdu.turma.*;
import SGEdu.usuarios.*;


/**
 * Class Menu
 * @author Lucas Leonardo
 */
public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Repositorio repositorio = new Repositorio();
        Seeder seeder = new Seeder();
        Horario horario = new Horario();
        seeder.addCoordenador(repositorio);
        String opcao;

        Coordenador coord = new Coordenador("Allysson", "admin", "admin");
        Responsavel respo = new Responsavel("Lucas", "Lucas", "123");
        Turma turm = new Turma("3a");
        Aluno alun = new Aluno("Laisy", "Laisy", "123", respo, turm);

        repositorio.adicionarCoordenadores(coord);
        repositorio.adicionarAlunos(alun);
        repositorio.adicionarTurmas(turm);
        repositorio.adicionarResponsaveis(respo);

        do {
            System.out.println("" +
                    "*********************************************\n" +
                    "SEJA BEM VINDO AO SISTEMA DE GESTÃƒO EDUCACIONAL - SGEdu\n" +
                    "*********************************************\n" +
                    "DIGITE ( 1 ) - PARA LOGIN COMO ALUNO\n" +
                    "DIGITE ( 2 ) - PARA LOGIN COMO RESPONSÃ�VEL\n" +
                    "DIGITE ( 3 ) - PARA LOGIN COMO PROFESSOR\n" +
                    "DIGITE ( 4 ) - PARA LOGIN COMO COORDENADOR\n" +
                    "DIGITE ( 5 ) - PARA SAIR\n" +
                    "*********************************************\n" +
                    "DIGITE A OPÃ‡ÃƒO DESEJADA: ");
            opcao = sc.next();
            System.out.println("" +
                    "*********************************************\n");
            switch (opcao) {
                case "1":
                    String login_aluno, senha_aluno;
                    System.out.println("" +
                            "*********************************************\n" +
                            "USUÃ�RIO: ");
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
                                            "BEM VINDO(A) *"+ aluno.getNome() + "* AO SGEdu\n" +
                                            "*********************************************\n" +
                                            "DIGITE ( 1 ) - PARA VER BOLETIM\n" +
                                            "DIGITE ( 2 ) - PARA VISUALIZAR HORÃ�RIO DA TURMA\n" +
                                            "DIGITE ( 3 ) - PARA VER NOTIFICAÃ‡Ã•ES\n" +
                                            "DIGITE ( 4 ) - PARA SAIR\n" +
                                            "*********************************************\n" +
                                            "DIGITE A OPÃ‡ÃƒO DESEJADA: ");
                                    opcao_menu_aluno = sc.next();
                                    System.out.println("" +
                                            "*********************************************\n");
                                    switch (opcao_menu_aluno) {
                                        case "1":
                                            for (Boletim boletim: repositorio.getBoletins()) {
                                                if(boletim.getAluno().contentEquals(aluno.getNome())) {
                                                    boletim.printaBoletim();
                                                    break;
                                                }
                                            }
                                            continue;

                                        case "2":
                                            horario.printarHorario();
                                            continue;

                                        case "3":
                                            aluno.exibirNotificacao();
                                            continue;

                                    }
                                } while (!opcao_menu_aluno.equals("4"));
                            }
                        } else {
                            System.out.println("" +
                                    "*********************************************\n" +
                                    "          LOGIN OU SENHA INCORRETOS!\n" +
                                    "*********************************************\n");
                        }
                    }

                    continue;

                case "2":
                    String login_responsavel, senha_responsavel;
                    System.out.println("" +
                            "*********************************************\n" +
                            "USUÃ�RIO: ");
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
                                            "BEM VINDO(A) *"+ responsavel.getNome() + "* AO SGEdu\n" +
                                            "*********************************************\n" +
                                            "DIGITE ( 1 ) - PARA VER HISTÃ“RICO ESCOLAR\n" +
                                            "DIGITE ( 2 ) - PARA VER NOTIFICAÃ‡Ã•ES\n" +
                                            "DIGITE ( 3 ) - PARA VER HORÃ�RIO ESCOLAR\n" +
                                            "DIGITE ( 4 ) - PARA SAIR\n" +
                                            "*********************************************\n" +
                                            "DIGITE A OPÃ‡ÃƒO DESEJADA: ");
                                    opcao_menu_responsavel = sc.next();
                                    System.out.println("" +
                                            "*********************************************\n");
                                    switch (opcao_menu_responsavel) {
                                        case "1":
                                            responsavel.exibirBoletins(repositorio);
                                            continue;

                                        case "2":
                                            responsavel.exibirNotificacao();
                                            continue;

                                        case "3":
                                            horario.printarHorario();
                                            continue;
                                    }
                                } while (!opcao_menu_responsavel.equals("4"));
                            }
                        } else {
                            System.out.println("" +
                                    "*********************************************\n" +
                                    "          LOGIN OU SENHA INCORRETOS!\n" +
                                    "*********************************************\n");
                        }
                    }
                    break;

                case "3":
                    String login_professor, senha_professor;
                    System.out.println("" +
                            "*********************************************\n" +
                            "USUÃ�RIO: ");
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
                                            "BEM VINDO(A) *"+ professor.getNome() + "* AO SGEdu\n" +
                                            "*********************************************\n" +
                                            "DIGITE ( 1 ) - PARA INCREMENTAR BOLETIM\n" +
                                            "DIGITE ( 2 ) - PARA FAZER UMA NOTIFICAÃ‡ÃƒO\n" +
                                            "DIGITE ( 3 ) - PARA SAIR\n" +
                                            "*********************************************\n" +
                                            "DIGITE A OPÃ‡ÃƒO DESEJADA: ");
                                    opcao_menu_professor = sc.next();
                                    System.out.println("" +
                                            "*********************************************\n");
                                    switch (opcao_menu_professor) {
                                        case "1":
                                            professor.addNotas(repositorio);
                                            continue;
                                        case "2":
                                            String opcao_notif_prof;
                                            do {
                                                System.out.println("" +
                                                        "****************************************\n" +
                                                        "SEJA BEM VINDO A CENTRAL DE NOTIFICAÃ‡Ã”ES\n" +
                                                        "****************************************\n" +
                                                        "DIGITE ( 1 ) - PARA UM RESPONSÃƒVEL EM ESPECÃ�FICO\n" +
                                                        "DIGITE ( 2 ) - PARA UM ALUNO EM ESPECÃ�FICO\n" +
                                                        "DIGITE ( 3 ) - PARA VOLTAR\n" +
                                                        "****************************************\n" +
                                                        "PARA QUEM VOCÃŠ DESEJA ENVIAR A NOTIFICAÃ‡ÃƒO: ");
                                                opcao_notif_prof = sc.next();

                                                switch(opcao_notif_prof) {
                                                    case "1":
                                                        String nomeAluno;
                                                        System.out.println("" +
                                                                "****************************************\n" +
                                                                "DIGITE O NOME DO ALUNO QUE VOCÃŠ DESEJA ENVIAR A NOTIFICAÃ‡ÃƒO: ");
                                                        nomeAluno = sc.next();
                                                        System.out.println("****************************************\n");

                                                        for (Aluno nome: repositorio.getAlunos()) {
                                                            if (nome.getNome().equals(nomeAluno)){
                                                                String mensagem;
                                                                System.out.println("" +
                                                                        "****************************************\n" +
                                                                        "DIGITE A NOTIFICAÃ‡ÃƒO QUE DESEJA ENVIAR: ");
                                                                mensagem = sc.nextLine();
                                                                System.out.println("****************************************\n");

                                                                nome.addNotificacao(mensagem);
                                                            } else {
                                                                System.out.println("" +
                                                                        "ALUNO NÃƒO ENCONTRADO" +
                                                                        "****************************************\n");
                                                            }
                                                        }

                                                        continue;

                                                    case "2":
                                                        String nomeResponsavel;
                                                        System.out.println("" +
                                                                "****************************************\n" +
                                                                "DIGITE O NOME DO RESPONSÃƒVEL QUE VOCÃŠ DESEJA ENVIAR A NOTIFICAÃ‡ÃƒO: ");
                                                        nomeResponsavel = sc.nextLine();
                                                        System.out.println("****************************************\n");

                                                        for (Responsavel nome: repositorio.getResponsaveis()) {
                                                            if (nome.getNome().equals(nomeResponsavel)){
                                                                String mensagem;
                                                                System.out.println("" +
                                                                        "****************************************\n" +
                                                                        "DIGITE A NOTIFICAÃ‡ÃƒO QUE DESEJA ENVIAR: ");
                                                                mensagem = sc.next();
                                                                System.out.println("****************************************\n");

                                                                nome.addNotificacao(mensagem);
                                                            } else {
                                                                System.out.println("" +
                                                                        "RESPONSÃ�VEL NÃƒO ENCONTRADO" +
                                                                        "****************************************\n");
                                                            }
                                                        }

                                                        continue;

                                                }
                                            } while (!opcao_notif_prof.equals("3"));
                                    }
                                } while (!opcao_menu_professor.equals("3"));
                            }
                        } else {
                            System.out.println("" +
                                    "*********************************************\n" +
                                    "          LOGIN OU SENHA INCORRETOS!\n" +
                                    "*********************************************\n");
                        }
                    }

                    continue;

                case "4":
                    String login_coordenador, senha_coordenador;
                    System.out.println("" +
                            "*********************************************\n" +
                            "USUÃ�RIO: ");
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
                                            "BEM VINDO(A) *"+ coordenador.getNome() + "* AO SGEdu\n" +
                                            "*********************************************\n" +
                                            "DIGITE ( 1 ) - PARA CADASTRAR PROFESSORES\n" +
                                            "DIGITE ( 2 ) - PARA CADASTRAR ALUNOS\n" +
                                            "DIGITE ( 3 ) - PARA CADASTRAR RESPONSÃ�VEL\n" +
                                            "DIGITE ( 4 ) - PARA CADASTRAR TURMAS\n" +
                                            "DIGITE ( 5 ) - PARA FAZER UMA NOTIFICAÃƒâ€¡ÃƒÆ’O\n" +
                                            "DIGITE ( 6 ) - PARA ADICIONAR PROFESSOR EM TURMA\n" +
                                            "DIGITE ( 7 ) - PARA ADICIONAR HORÁRIO DA TURMA\n" +
                                            "DIGITE ( 8 ) - PARA SAIR\n" +
                                            "*********************************************\n" +
                                            "DIGITE A OPÃ‡ÃƒO DESEJADA: ");
                                    opcao_menu_coordenador = sc.next();
                                    System.out.println("" +
                                            "*********************************************\n");
                                    switch (opcao_menu_coordenador) {
                                        case "1":
                                            coordenador.cadastrarProfessor(repositorio);
                                            continue;
                                        case "2":
                                            coordenador.cadastrarAluno(repositorio);
                                            continue;
                                        case "3":
                                            coordenador.cadastrarResponsavel(repositorio);
                                            continue;
                                        case "4":
                                            coordenador.cadastrarTurma(repositorio);
                                            continue;
                                        case "5":
                                            String opcao_notif_coord;
                                            do {
                                                System.out.println("" +
                                                        "****************************************\n" +
                                                        "SEJA BEM VINDO A CENTRAL DE NOTIFICAÃ‡Ã•ES\n" +
                                                        "****************************************\n" +
                                                        "DIGITE ( 1 ) - PARA UM RESPONSÃƒVEL EM ESPECÃ�FICO\n" +
                                                        "DIGITE ( 2 ) - PARA UM ALUNO EM ESPECÃ�FICO\n" +
                                                        "DIGITE ( 3 ) - PARA VOLTAR\n" +
                                                        "****************************************\n" +
                                                        "PARA QUEM VOCÃŠ DESEJA ENVIAR A NOTIFIÃ‡ÃƒO: ");
                                                opcao_notif_coord = sc.next();

                                                switch(opcao_notif_coord) {
                                                    case "1":
                                                        String nomeResponsavel = null;
                                                        System.out.println("" +
                                                                "****************************************\n" +
                                                                "DIGITE O NOME DO RESPONSÃ�VEL QUE VOCÃŠ DESEJA ENVIAR A NOTIFICAÃ‡ÃƒO: ");
                                                        nomeResponsavel = sc.next();
                                                        System.out.println("****************************************\n");

                                                        for (Responsavel nome: repositorio.getResponsaveis()) {
                                                            if (nome.getNome().equals(nomeResponsavel)){
                                                                String mensagem;
                                                                System.out.println("" +
                                                                        "****************************************\n" +
                                                                        "DIGITE A NOTIFICAÃ‡ÃƒO QUE DESEJA ENVIAR: ");
                                                                mensagem = sc.nextLine();
                                                                System.out.println("" +
                                                                        "****************************************\n");

                                                                nome.addNotificacao(mensagem);
                                                            } else {
                                                                System.out.println("" +
                                                                        "RESPONSÃ�VEL NÃƒO ENCONTRADO\n" +
                                                                        "****************************************\n");
                                                            }
                                                        }

                                                        continue;

                                                    case "2":
                                                        String nomeAluno;
                                                        System.out.println("" +
                                                                "****************************************\n" +
                                                                "DIGITE O NOME DO ALUNO QUE VOCÃŠ DESEJA ENVIAR A NOTIFICAÃ‡ÃƒO: ");
                                                        nomeAluno = sc.nextLine();
                                                        System.out.println("****************************************\n");

                                                        for (Aluno nome: repositorio.getAlunos()) {
                                                            if (nome.getNome().equals(nomeAluno)){
                                                                String mensagem;
                                                                System.out.println("" +
                                                                        "****************************************\n" +
                                                                        "DIGITE A NOTIFICACAO QUE DESEJA ENVIAR: ");
                                                                mensagem = sc.nextLine();
                                                                System.out.println("****************************************\n");

                                                                nome.addNotificacao(mensagem);
                                                            } else {
                                                                System.out.println("" +
                                                                        "ALUNO NÃƒO ENCONTRADO\n" +
                                                                        "****************************************\n");
                                                            }
                                                        }

                                                        continue;
                                                }
                                            } while (!opcao_notif_coord.equals("3"));
                                            continue;

                                        case "6":
                                            coordenador.adicionarProfessoremTurma(repositorio);
                                            continue;

                                        case "7":
                                            horario.criarHorario();
                                    }
                                } while (!opcao_menu_coordenador.equals("8"));
                            }
                        }
                    }

                    continue;
            }
        } while (!opcao.equals("5"));
    }
}