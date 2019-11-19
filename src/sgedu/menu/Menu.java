package sgedu.menu;

import sgedu.excecoes.UsuarioJaCadastradoException;
import sgedu.repositorios.*;

import sgedu.turma.*;
import sgedu.usuarios.*;

/**
 * Class Menu
 */

public class Menu {
    public static void main(String[] args) throws UsuarioJaCadastradoException {
    	
        RepositorioAluno repositorioAluno = new RepositorioAluno();
        RepositorioTurma repostiorioTurma = new RepositorioTurma();
        RepositorioProfessor repositorioProfessor = new RepositorioProfessor();
        RepositorioDisciplina repositorioDisciplina = new RepositorioDisciplina();
        RepositorioCoordenador repositorioCoordenador = new RepositorioCoordenador();
        RepositorioResponsavel repositorioResponsavel = new RepositorioResponsavel();

        Coordenador coord = new Coordenador("Coord", "admin");
        Responsavel respo = new Responsavel("Lucas", "123");
        Turma turm = new Turma("3a", 2019);
        Aluno alun = new Aluno("Laisy", "123");
        
        Disciplina d = new Disciplina("Matematica", 50);
        Professor prof = new Professor("Pedro", "123", d);
        
        d.setProfessor(prof);
        turm.addDisciplinaTurma(d);
        turm.addAlunosTurma(alun);
        alun.setResponsavel(respo);
        prof.addTurma(turm);
        respo.addAluno(alun);
        
        repositorioCoordenador.addCoordenador(coord);
        repositorioResponsavel.addResponsavel(respo);
        repositorioAluno.addAluno(alun);
        repostiorioTurma.addTurma(turm);
        repositorioProfessor.addProfessor(prof);
        repositorioDisciplina.addDisciplina(d);
        
        
    }
}