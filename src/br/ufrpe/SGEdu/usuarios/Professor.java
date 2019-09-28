package br.ufrpe.SGEdu.usuarios;
import java.util.Scanner;
import br.ufrpe.SGEdu.repositorio.Repositorio;
import br.ufrpe.SGEdu.gestao.*;
import br.ufrpe.SGEdu.boletim.*;


public class Professor extends Usuario{
    private String disciplina;
    Repositorio repositorio = new Repositorio();
    Scanner sc = new Scanner(System.in);

    public Professor(String nome, String login, String senha, String disciplina) {
        super(nome, login, senha);
        this.disciplina=disciplina;
    }

    public void setDiciplina(String diciplina) {
        this.disciplina=diciplina;
    }

    public String getDiciplina() {
        return disciplina;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "disciplina='" + disciplina + '\'' +
                '}';
    }

    /*public void addNotas(Repositorio repositorio) {
        String nome_aluno;
        float nota1,nota2,nota3,nota4;
        System.out.println("" +
                "****************Adição de notas**************\n" +
                "Nome do aluno: ");
        nome_aluno = sc.next();
        for(Aluno aluno: repositorio.getAlunos()) {
            if(aluno.getNome().equals(nome_aluno)) {
                System.out.println("" +
                        "Nota do primeiro semestre: ");
                nota1 = sc.nextFloat();
                System.out.println("" +
                        "Nota do segundo semestre: ");
                nota2 = sc.nextFloat();
                System.out.println("" +
                        "Nota do terceiro semestre: ");
                nota3 = sc.nextFloat();
                System.out.println("" +
                        "Nota do quarto semestre: ");
                nota4 = sc.nextFloat();


                Notas notas=new Notas(this.disciplina,nota1,nota2,nota3,nota4);//cria um objeto notas com as notas lidas
                aluno.boletim.add(notas);//adiciona essas notas lidas para o array boletim do aluno selecionado


                System.out.println("" +
                        "Notas inseridas com sucesso"+
                        "*********************************************\n");
                break;
            }
        }
        System.out.println("****!!!Aluno nao encontrado!!!***");
    }
    */

}
