package br.ufrpe.SGEdu.repositorio;
import br.ufrpe.SGEdu.usuarios.Aluno;
import br.ufrpe.SGEdu.turma.Turma;
import br.ufrpe.SGEdu.usuarios.Coordenador;
import br.ufrpe.SGEdu.usuarios.Professor;
import br.ufrpe.SGEdu.usuarios.Responsavel;

import java.util.ArrayList;

/**
 * Classe Repositorio
 * @author Lucas
 */
public class Repositorio {
    private ArrayList<Turma> listadeturmas = new ArrayList<>();
    private ArrayList<Responsavel> listaderesponsaveis = new ArrayList<>();
    private ArrayList<Aluno> listadealunos = new ArrayList<>();
    private ArrayList<Professor> listadeprofessores = new ArrayList<>();
    private ArrayList<Coordenador> listadecoordenadores = new ArrayList<>();

    public ArrayList<Turma> getTurmas() {
        return listadeturmas;
    }
    public ArrayList<Responsavel> getResponsaveis() {
        return listaderesponsaveis;
    }
    public ArrayList<Aluno> getAlunos() {
        return listadealunos;
    }
    public void adicionarAlunos(Aluno aluno) {
        listadealunos.add(aluno);
    }
    public ArrayList<Professor> getProfessores() {
        return listadeprofessores;
    }
    public void adicionarProfessores(Professor professor) {
        listadeprofessores.add(professor);
    }
    public void adicionarResponsaveis(Responsavel responsavel) {
        listaderesponsaveis.add(responsavel);
    }
    public ArrayList<Coordenador> getCoordenadores() { return listadecoordenadores; }
    public void adicionarCoordenadores(Coordenador coordenador) {
        listadecoordenadores.add(coordenador);
    }

    public void adicionarTurmas(Turma turma) {
        listadeturmas.add(turma);
    }
}