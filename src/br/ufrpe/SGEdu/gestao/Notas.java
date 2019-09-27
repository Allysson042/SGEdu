package br.ufrpe.SGEdu.gestao;

public class Notas {
    private String disciplina;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    public Notas(String diciplina, double nota1,double nota2,double nota3,double nota4) {
        this.disciplina=diciplina;
        this.nota1=nota1;
        this.nota2=nota2;
        this.nota3=nota3;
        this.nota4=nota4;
    }
    
    public void exibirNotas() {
    	System.out.printf("disciplina: %s\n",this.disciplina);
    	System.out.printf("nota1: %.2f\n",this.nota1);
    	System.out.printf("nota2: %.2f\n",this.nota2);
    	System.out.printf("nota3: %.2f\n",this.nota3);
    	System.out.printf("nota4: %.2f\n",this.nota4);
    }
    
    
}
