package br.ufrpe.SGEdu.gestao;
import br.ufrpe.SGEdu.repositorio.Repositorio;
import br.ufrpe.SGEdu.usuarios.Aluno;
import br.ufrpe.SGEdu.usuarios.Responsavel;
import br.ufrpe.SGEdu.turma.Turma;

import java.util.ArrayList;
import java.util.Scanner;

public class Notificacao {
    ArrayList<String> notificacao = new ArrayList<>();


    public void enviarNotificacao(){
        Scanner sc = new Scanner(System.in);
        Repositorio repositorio = new Repositorio();
        Responsavel responsavel = new Responsavel();
        int opcaoNotif;
        System.out.println("" +
                "****************************************\n" +
                "SEJA BEM VINDO A CENTRAL DE NOTIFICAÇÕES\n" +
                "****************************************\n" +
                "PARA QUEM VOCÊ DESEJA ENVIAR A NOTIFICAÇÃO: " +
                "DIGITE ( 1 ) - PARA UMA TURMA TODA\n" +
                "DIGITE ( 2 ) - PARA UM RESPONSÁVEL EM ESPECÍFICO\n" +
                "DIGITE ( 3 ) - PARA UM ALUNO EM ESPECÍFICO\n" +
                "DIGITE ( 4 ) - PARA VOLTAR\n" +
                "****************************************\n");
        opcaoNotif = sc.nextInt();

        switch(opcaoNotif){
            case 1:
                String nomeTurma;
                System.out.println("DIGITE O NOME DA TURMA QUE DESEJA ENCAMINHAR A NOTIFICAÇÃO");
                nomeTurma = sc.nextLine();
                for (Turma nome: repositorio.getTurmas()) {
                    if (nome.getNome().equals(nomeTurma)){
                        //AAAAAAAAAAAAA
                    }
                }

            case 2:
                String nomeResponsavel;
                System.out.println("DIGITE O NOME DO RESPONSAVEL QUE DESEJA ENCAMINHAR A NOTIFICAÇÃO");
                nomeResponsavel = sc.nextLine();
                for (Responsavel nome: repositorio.getResponsaveis()) {
                    if (nome.getNome().equals(nomeResponsavel)) {
                        //AAAAAAAAAAAAAAAAAA
                    }
                }

            case 3:
                String nomeAluno;
                System.out.println("DIGITE O NOME DO RESPONSAVEL QUE DESEJA ENCAMINHAR A NOTIFICAÇÃO");
                nomeAluno = sc.nextLine();
                for (Aluno nome: repositorio.getAlunos()) {
                    if (nome.getNome().equals(nomeAluno)) {
                        //AAAAAAAAAAAAAAAAAA
                    }
                }

            case 4:
                //VOLTAAAAAAAAAAAAR
        }

    }

    public void exibirNotificacao(Aluno aluno) {

    }

    public void exibirNotificacao(Responsavel responsavel) {

    }
}
