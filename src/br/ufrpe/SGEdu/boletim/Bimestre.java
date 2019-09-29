package br.ufrpe.SGEdu.boletim;
import br.ufrpe.SGEdu.usuarios.*;

/**Essa classe cria objetos do tipo Bimestre, serve criação do Boletim, que é um conjunto de objetos Bimestre;
 * @author Laisy
 */

public class Bimestre{

    private Professor professor;
    private String nomeBimestre;
    private double nota;
    private int frequencia;
    private String disciplina;

    /**
     * Construtor Bimestre
     * @param nomeBimestre nome do Bimestre, ex: 1ºBimestre;
     * @param professor
     */

    public Bimestre(String nomeBimestre, Professor professor){
        this.nomeBimestre = nomeBimestre;
        this.professor = professor;
        this.disciplina = professor.getDiciplina();
        this.nota = nota;
        this.frequencia = frequencia;
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
        this.frequencia = frequencia;
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
