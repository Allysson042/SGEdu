package br.ufrpe.SGEdu.boletim;
import br.ufrpe.SGEdu.usuarios.*;

public class Bimestre{

    private Professor professor;
    private String nomeBimestre;
    private double nota;
    private int frequencia;

    public Bimestre(String nomeBimestre, Professor professor){
        this.nomeBimestre = nomeBimestre;
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getNomeBimestre() {
        return nomeBimestre;
    }

    public void setNomeBimestre(String nomeBimestre) {
        this.nomeBimestre = nomeBimestre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia() {
        this.frequencia = frequencia+1;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Bimestre{" +
                "professor=" + professor +
                ", nomeBimestre='" + nomeBimestre + '\'' +
                ", nota=" + nota +
                ", frequencia=" + frequencia +
                '}';
    }

}
