package br.ufrpe.SGEdu.boletim;
import br.ufrpe.SGEdu.boletim.*;
import br.ufrpe.SGEdu.usuarios.*;
import br.ufrpe.SGEdu.turma.*;
import java.util.ArrayList;

/**Essa classe cria objetos do tipo Boletim onde é uma junção de Bimestres referentes a cada aluno;
 * @author
 */

public class Boletin {

    private Bimestre bimestre;
    private ArrayList<Bimestre> bimestres = new ArrayList<Bimestre>();
    private int ano;
    private double media;
    private int frequenciaTotal;
    private Turma turma;
    private String aluno;

    /**
     * Construtor Boletin
     * @param ano ano que o boletim referencia;
     * @param aluno aluno ao qual o boletim pertence;
     */

    public Boletin(int ano, String aluno) {
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
}
