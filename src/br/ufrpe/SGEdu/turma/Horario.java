package br.ufrpe.SGEdu.turma;

import java.util.ArrayList;
import java.util.Arrays;
import br.ufrpe.SGEdu.turma.Turma;

public class Horario {
    private Turma turma;
    private String [][] horario;
    private String[] diasSem = new String[]{"SEGUNDA", "TERÇA", "QUARTA", "QUINTA", "SEXTA"};

    public Horario(){
        this.horario = new String[5][5];
    }

    public void criarHorario(){
        int k = 0;
        for(int i=0; i<horario.length; i++){
            for(int j=0; j<horario[i].length; j++){
                if(turma.getTamanhoArrayDisciplina() > k){
                    k++;
                } else{
                    k=0;
                } horario[i][j] = turma.getDisciplinaTurma(k);

            }
        }
    }

    public void printarHorario(){
        for(int i=0; i<horario.length; i++){
            System.out.println(diasSem[i] + ": ");
            for(int j=0; j<horario[i].length; j++){
                System.out.println(horario[j][i]);
            }
        }
    }

}