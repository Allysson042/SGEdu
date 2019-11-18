package sgedu.notificacao;

import java.io.Serializable;

import sgedu.repositorios.RepositorioNotificacoes;

public class Notificacao implements Serializable{
	private String notificacao;
	private String nomeRemetente;
	private String nomeDestinatario;
	private int id;
	
	public Notificacao(String notificacao, String remetente, String destinatario, int id) {
		this.notificacao=notificacao;
		this.nomeRemetente=remetente;
		this.nomeDestinatario=destinatario;
		this.id=id;
		
	}
	
	public void setNotificação(String notificacao) {
		this.notificacao=notificacao;
	} 
	
	public String getNotificação() {
		return this.notificacao;		
	}
	
	public void setRemetente(String remetente) {
		this.nomeRemetente=remetente;
	}
	
	public String getRemetente() {
		return this.nomeRemetente;
	}
	
	public void setDestinatario(String destinatario) {
		this.nomeDestinatario=destinatario;
	}
	
	public String getDestinatario() {
		return this.nomeDestinatario;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = RepositorioNotificacoes.contadorNotificacao;
	}
	
}