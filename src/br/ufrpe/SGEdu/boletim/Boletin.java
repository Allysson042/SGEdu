package br.ufrpe.SGEdu.boletim;
import br.ufrpe.SGEdu.boletim.*;
import br.ufrpe.SGEdu.usuarios.*;
import br.ufrpe.SGEdu.turma.*;
import java.util.ArrayList;

/**Essa classe cria objetos do tipo Boletim onde é uma junção de Bimestres referentes a cada aluno;
 * @author Laisy
 */

public class Boletin {

    private Bimestre bimestre;
    private ArrayList<Bimestre> bimestres = new ArrayList<Bimestre>();
    private int ano;
    private double media;
    private int frequenciaTotal;
    private Aluno aluno;
    private Turma turma;

    /**
     * Construtor Boletin
     * @param ano ano que o boletim referencia;
     * @param aluno aluno ao qual o boletim pertence;
     */

    public Boletin(int ano, Aluno aluno) {
        this.ano = ano;
        this.aluno = aluno;
        this.bimestres = bimestres;
        this.media = media/4;
        this.frequenciaTotal = frequenciaTotal;
    }

    public void calcularMedia(){
        this.media += bimestre.getNota();
    }

    public void frequenciaTotal(){
        this.frequenciaTotal += bimestre.getFrequencia();
    }

    public void adicionarBimestre(Bimestre bimestre){
        this.bimestres.add(bimestre);
    }

    @Override
    public String toString() {
        return "Boletin{" +
                ", aluno='" + aluno +
                ", ano=" + ano +
                ", turma=" + turma +
                ", bimestres=" + bimestres +
                ", media=" + media +
                ", frequenciaTotal=" + frequenciaTotal +
                '\'' + '}';
    }

    public Bimestre getBimestre() {
        return bimestre;
    }

    public void setBimestre(Bimestre bimestre) {
        this.bimestre = bimestre;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public int getFrequenciaTotal() {
        return frequenciaTotal;
    }

    public void setFrequenciaTotal(int frequenciaTotal) {
        this.frequenciaTotal = frequenciaTotal;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public ArrayList<Bimestre> getBimestres() {
        return bimestres;
    }

    public void setBimestres(ArrayList<Bimestre> bimestres) {
        this.bimestres = bimestres;
    }
}
