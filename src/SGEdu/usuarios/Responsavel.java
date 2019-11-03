package SGEdu.usuarios;
import java.util.ArrayList;


import SGEdu.diario.Boletim;
import SGEdu.repositorios.Repositorio;

/**
 * Class Responsavel
 * @author Allysson & Lucas Leonardo
 */

public class Responsavel extends Usuario {
    private ArrayList<Aluno> alunos;

    //obrigatório ao menos 1 aluno para associar o responsável
    public Responsavel(String nome, String login, String senha) {
        super(nome, login, senha);
        this.alunos = new ArrayList<Aluno>();
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

}
