package SGEdu.menu;

import java.util.Scanner;

import SGEdu.diario.Boletim;
import SGEdu.turma.*;
import SGEdu.usuarios.*;
import SGEdu.repositorios.*;

/**
 * Class Menu
 * @author Lucas Leonardo
 */

public class Menu {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        RepositorioUsuarios repositorioUsuarios = new RepositorioUsuarios();
        RepositorioTurma repostiorioTurma = new RepositorioTurma();
        RepositorioDisciplina repositorioDisciplina = new RepositorioDisciplina();

        Usuario coord = new Coordenador("Allysson", "admin", "admin");
        Usuario respo = new Responsavel("Lucas", "Lucas", "123");
        Turma turm = new Turma("3a", 2019);
        Usuario alun = new Aluno("Laisy", "Laisy", "123");
        Disciplina d = new Disciplina("Matematica", 50);
        Usuario prof = new Professor("Pedro", "Pedro", "123", d);
        
        repositorioUsuarios.addUsuario(coord);
        repositorioUsuarios.addUsuario(respo);
        repositorioUsuarios.addUsuario(alun);
        repostiorioTurma.addTurma(turm);
        repositorioUsuarios.addUsuario(prof);
        repositorioDisciplina.addDisciplina(d);
        
    }
}