package br.ufrpe.SGEdu.script;
import br.ufrpe.SGEdu.repositorio.Repositorio;
import br.ufrpe.SGEdu.usuarios.*;

public class Script {

	
	public void addCoordenador(Repositorio repositorio) {
		String nome="jooj",login="coord",senha="123";
		
		Coordenador coordenador =new Coordenador(nome,login,senha);
		
		repositorio.adicionarCoordenadores(coordenador);	
	}
	
	
	
	
	
	
}
