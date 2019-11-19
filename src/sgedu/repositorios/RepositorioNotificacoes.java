package sgedu.repositorios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import sgedu.excecoes.NotificacaoJaAdicionadaException;
import sgedu.excecoes.NotificacaoNaoEncontradaException;
import sgedu.notificacao.Notificacao;

public class RepositorioNotificacoes {
	ArrayList <Notificacao> notificacoes;
	public static int contadorNotificacao;
	
	public RepositorioNotificacoes() {
		this.notificacoes=new ArrayList<Notificacao>();
	}
	
	public void salvarArquivoNotificacao() throws IOException {
		FileOutputStream file = new FileOutputStream("Notificacoes.dat");
		ObjectOutputStream os = new ObjectOutputStream(file);
		os.writeObject(notificacoes);
		os.close();
	}
	
	public void buscarArquivoNotificacao() throws IOException, ClassNotFoundException {
		FileInputStream file = new FileInputStream("Notificacoes.dat");
		ObjectInputStream is = new ObjectInputStream(file);
		notificacoes = (ArrayList<Notificacao>) is.readObject();
		is.close();
	}
	
	public void addNotificacao(Notificacao noti) throws NotificacaoJaAdicionadaException, IOException {
		if(buscaNotificacaoID(noti.getId()) != null) {
			throw new NotificacaoJaAdicionadaException();
		}
		notificacoes.add(noti);
		contadorNotificacao++;
		salvarArquivoNotificacao();
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
	
	public void removerNotificacao(int id) throws NotificacaoNaoEncontradaException, IOException {
		Notificacao noti = buscaNotificacaoID(id);
		if(noti == null) {
			throw new NotificacaoNaoEncontradaException();
		}
		notificacoes.remove(noti);
		salvarArquivoNotificacao();
	}
}