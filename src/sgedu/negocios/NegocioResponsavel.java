package sgedu.negocios;

import java.io.IOException;

import sgedu.dados.usuarios.IRepositorioResponsavel;
import sgedu.negocios.entidade.usuarios.Responsavel;

public class NegocioResponsavel {
	
	private IRepositorioResponsavel repositorio;
	
	public NegocioResponsavel(IRepositorioResponsavel repositorio){
		this.repositorio=repositorio;
	}
	
	public void adicionar(Responsavel responsavel) throws IOException {
		Responsavel responsavelBusca=repositorio.buscarResponsavelLogin(responsavel.getLogin());
		
		if(responsavelBusca==null) {
			repositorio.addResponsavel(responsavel);
			
		}
	}
	
	public boolean confirmaLogin(String login, String senha) {
		return repositorio.buscarResponsavelLogin(login).verificaSenha(senha);
	}
	
	
	
	
}
