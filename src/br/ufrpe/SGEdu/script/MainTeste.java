package br.ufrpe.SGEdu.script;
import java.util.Scanner;
import br.ufrpe.SGEdu.gestao.*;
import br.ufrpe.SGEdu.usuarios.Aluno;
import br.ufrpe.SGEdu.repositorio.Repositorio;
import br.ufrpe.SGEdu.usuarios.Coordenador;
import br.ufrpe.SGEdu.usuarios.Professor;
import br.ufrpe.SGEdu.usuarios.Responsavel;
import br.ufrpe.SGEdu.turma.Turma;

public class MainTeste {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Repositorio repositorio = new Repositorio();
        Script script = new Script();
        script.addCoordenador(repositorio);
        
        //turma teste
        String nome_t="6° ano";
        Turma turma=new Turma(nome_t);
        
        //responsavel teste
        String nome_r="pai de jooj", login_r="pai de jooj", senha_r="123";
        Responsavel responsavel=new Responsavel(nome_r,login_r,senha_r);
        
        
        //nota teste 
        
        String disciplina="matematica";
        double n1=8,n2=5.4,n3=9.55,n4=3; 
        Notas nota=new Notas(disciplina,n1,n2,n3,n4);
        
        
        //nota teste 2
        
        String disciplina2="portugues";
        double n5=3,n6=7.5,n7=7.69,n8=4; 
        Notas nota2=new Notas(disciplina2,n5,n6,n7,n8);
        
        //aluno teste
        String nome_a="jooj",login_a="jooj",senha_a="123";
        Aluno aluno=new Aluno(nome_a,login_a,senha_a,responsavel,turma);
        repositorio.adicionarAlunos(aluno);
        
        for(Aluno aluno1: repositorio.getAlunos()) {
        	aluno1.boletim.add(nota);
        }
        
        for(Aluno aluno1: repositorio.getAlunos()) {
        	aluno1.boletim.add(nota2);
        }
        
        
        
       aluno.exibirBoletim();
        
       
        
        
        
        //professor teste
        //String nome_p="arlindo", login_p="arlindo",senha_p="123", disciplina="matematica";
        //Professor professor = new Professor(nome_p,login_p,senha_p,disciplina);
        
       // professor.addNotas(repositorio);
        
        
        
        
        
	
      
	
	
	}
      
      

}
