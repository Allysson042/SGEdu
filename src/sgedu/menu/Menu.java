package sgedu.menu;

import sgedu.repositorios.*;

import sgedu.turma.*;
import sgedu.usuarios.*;

/**
 * Class Menu
 */

public class Menu {
    public static void main(String[] args) {
    	
        RepositorioAluno repositorioAluno = new RepositorioAluno();
        RepositorioTurma repostiorioTurma = new RepositorioTurma();
        RepositorioProfessor repositorioProfessor = new RepositorioProfessor();
        RepositorioDisciplina repositorioDisciplina = new RepositorioDisciplina();
        RepositorioCoordenador repositorioCoordenador = new RepositorioCoordenador();
        RepositorioResponsavel repositorioResponsavel = new RepositorioResponsavel();

        Coordenador coord = new Coordenador("Coord", "admin", "admin");
        Responsavel respo = new Responsavel("Lucas", "Lucas", "123");
        Turma turm = new Turma("3a", 2019);
        Aluno alun = new Aluno("Laisy", "Laisy", "123");
        
        Disciplina d = new Disciplina("Matematica", 50);
        Professor prof = new Professor("Pedro", "Pedro", "123", d);
        
        d.setProfessor(prof);
        turm.addDisciplina(d);
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