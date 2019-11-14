package SGEdu.repositorios;
import java.util.ArrayList;
import SGEdu.notificacao.*;

public class RepositorioNotificacoes {
	ArrayList <Notificacao> notificacoes;
	
	public RepositorioNotificacoes() {
		this.notificacoes=new ArrayList<Notificacao>();
	}
	
	public void addNotificacao(Notificacao noti) {
		notificacoes.add(noti);		
	}
	
	public Notificacao buscaNotificacaoRemetente(String remetente) {
		for(int i=0; i<notificacoes.size(); i++) {
			if(notificacoes.get(i).getRemetente().contentEquals(remetente)) {
				return notificacoes.get(i);
			}
		}
		return null;
	}
	
	public Notificacao buscaNotificacaoDestinatario(String destinatario) {
		for(int i=0; i<notificacoes.size(); i++) {
			if(notificacoes.get(i).getDestinatario().contentEquals(destinatario)) {
				return notificacoes.get(i);
			}
		}
		return null;
	}
	
	public Notificacao buscaNotificacaoID(int id) {
		for(int i=0; i<notificacoes.size(); i++) {
			if(notificacoes.get(i).getId()==id) {
				return notificacoes.get(i);
			}
		}
		return null;
	}
	
	public void removerNotificacao(int id) {
		Notificacao noti=this.buscaNotificacaoID(id);
		notificacoes.remove(noti);
	}
	
	
	
	
	
	
	

}