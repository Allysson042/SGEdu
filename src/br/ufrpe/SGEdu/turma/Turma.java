package br.ufrpe.SGEdu.turma;

import br.ufrpe.SGEdu.usuarios.*;
import br.ufrpe.SGEdu.gestao.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Classe Turma, cria objetos do tipo Turma, são as turmas da escola, composta pelos alunos, professores e disciplinas;
 * @author Laisy
 */
public class Turma {
    private String nome;
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    private ArrayList alunosTurma = new ArrayList();
    private ArrayList<Professor> professores = new ArrayList<Professor>();
    private ArrayList professoresTurma = new ArrayList();
    private ArrayList disciplinasTurma = new ArrayList();

    Horario horario = new Horario();

    /**
     * Construtor Turma
     * @param nome nome da Turma, ex:3º B
     */
    public Turma(String nome) {
        this.nome = nome;
        this.professoresTurma = professoresTurma;
        this.alunosTurma = alunosTurma;
        this.disciplinasTurma = disciplinasTurma;
        this.horario = horario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void addAluno(Aluno aluno) {
        String alu;
        if(!alunos.isEmpty()){
            for (int i = 0; i < alunos.size(); i++) {
                alu = alunos.get(i).getNome();
                alunosTurma.add(alu);
            }
        } else{
            System.out.println("Turma não possui alunos! ");
        }

    }

    public void removerAluno(String nome){
        int index;
        if(alunosTurma.contains(nome)){
            index = alunosTurma.indexOf(nome);
            alunosTurma.remove(index);
            System.out.println("Aluno removido! ");
        } else{
            System.out.println("Aluno não pertence a turma! ");
        }
    }

    public void printarAlunos(){
        int i;
        if(!alunosTurma.isEmpty()){
            for (i = 0; i < alunosTurma.size(); i++) {
                System.out.printf("Aluno %d: %s \n", i, alunosTurma.get(i));
            }
        } else{
            System.out.println("Turma ainda não possui alunos! ");
        }

    }

    public boolean buscarAlunoNaTurma(String nome){
        if(alunosTurma.contains(nome)){
            return true;
        } else{
            return false;
        }
    }

    public ArrayList getAlunosTurma() {
        return alunosTurma;
    }

    public void addProfessor(Professor professor) {
        String prof;
        if(!professores.isEmpty()){
            for (int i = 0; i < professores.size(); i++) {
                prof = professores.get(i).getNome();
                professoresTurma.add(prof);
            }
        } else{
            System.out.println("Turma não possui professores! ");
        }

    }

    public void removerProfessor(String nome){
        int index;
        if(professoresTurma.contains(nome)){
            index = professoresTurma.indexOf(nome);
            professoresTurma.remove(index);
            System.out.println("Professor removido! ");
        } else{
            System.out.println("Professor não pertence a  turma! ");
        }
    }

    public void printarProfessores(){
        int i;
        if(!professoresTurma.isEmpty()){
            for (i = 0; i < professoresTurma.size(); i++) {
                System.out.printf("Professor %d: %s \n", i, professoresTurma.get(i));
            }
        } else{
            System.out.println("Turma ainda não possui professores! ");
        }

    }
    public String getDisciplinaTurma(int i){
       return disciplinasTurma.get(i).toString();
    }

    public int getTamanhoArrayDisciplina(){
        return disciplinasTurma.size();
    }

    public void addDisciplina(Professor professor){
        String disc;
        if(!professores.isEmpty()){
            for (int i = 0; i < professores.size(); i++) {
                disc = professores.get(i).getDiciplina();
                disciplinasTurma.add(disc);
            }
        } else{
            System.out.println("Cadastre um professor! ");
        }

    }

    public void removerDisciplina(String nome){
        int index;
        if(disciplinasTurma.contains(nome)){
            index = disciplinasTurma.indexOf(nome);
            disciplinasTurma.remove(index);
            System.out.println("Disciplina removida! ");
        } else{
            System.out.println("Disciplina não pertence a turma! ");
        }
    }

    public void printarDisciplinas(){
        int i;
        if(!disciplinasTurma.isEmpty()){
            for (i = 0; i < disciplinasTurma.size(); i++) {
                System.out.printf("Disciplina %d: %s \n", i, disciplinasTurma.get(i));
            }
        } else{
            System.out.println("Turma ainda não possui Disciplinas! ");
        }

    }

    @Override
    public String toString() {
        return "Turma{" +
                "nome='" + nome + '\'' +
                ", alunosTurma=" + alunosTurma +
                ", professoresTurma=" + professoresTurma +
                ", disciplinasTurma=" + disciplinasTurma +
                ", horario=" + horario +
                '}';
    }
}
