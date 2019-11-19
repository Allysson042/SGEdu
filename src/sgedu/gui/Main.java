package sgedu.gui;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	
	///variaveis staticas para formar o "cache" de cenas para trocar
	private static Stage stage;
	private static Scene menu;
	private static Scene loginAluno;
	private static Scene loginProfessor;
	private static Scene loginResponsavel;
	private static Scene loginCoordenador;
	private static Scene VisualizarBoletim;
	
	
	@Override
	public void start(Stage Pstage) throws Exception {
		stage=Pstage;
		
		///criando o cache de cenas
		Parent FXMLMenu = FXMLLoader.load(getClass().getResource("./telas/Menu.fxml"));
		menu=new Scene(FXMLMenu);
		
		Parent FXMLLoginAluno = FXMLLoader.load(getClass().getResource("./telas/LoginAluno.fxml"));
		loginAluno=new Scene(FXMLLoginAluno);
		
		Parent FXMLLoginProfessor = FXMLLoader.load(getClass().getResource("./telas/LoginProfessor.fxml"));
		loginProfessor=new Scene(FXMLLoginProfessor);
		
		Parent FXMLLoginResponsavel = FXMLLoader.load(getClass().getResource("./telas/LoginResponsavel.fxml"));
		loginResponsavel=new Scene(FXMLLoginResponsavel);
		
		Parent FXMLLoginCoordenador = FXMLLoader.load(getClass().getResource("./telas/LoginCoordenador.fxml"));
		loginCoordenador=new Scene(FXMLLoginCoordenador);
		
		/*
		Parent FXMLVisualizarBoletim = FXMLLoader.load(getClass().getResource("./telas/VisualizarBoletim.fxml"));
		VisualizarBoletim=new Scene(FXMLVisualizarBoletim);*/
		
		
		
		
		
		
		//Scene scene = new Scene(menu);
		
		
		
		stage.setScene(menu);
		stage.show();		
	}
	
	
	///metodo que troca as cenas
	
	public static void changeScreen(String scr) {
		switch(scr) {
			case "Menu":
				stage.setScene(menu);
				break;
			case "LoginAluno":
				stage.setScene(loginAluno);
				break;
			case "LoginProfessor":
				stage.setScene(loginProfessor);
				break;
			case "LoginResponsavel":
				stage.setScene(loginResponsavel);
				break;
			case "LoginCoordenador":
				stage.setScene(loginCoordenador);
				break;
				
		
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
