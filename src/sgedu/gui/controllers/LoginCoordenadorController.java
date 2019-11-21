package sgedu.gui.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import sgedu.fachada.Fachada;
import sgedu.main.Main;

public class LoginCoordenadorController {

    @FXML
    private Button btVoltar;
    
    @FXML
    private TextField tfLogin;

    @FXML
    private Button btLogar;
    
    @FXML
    private PasswordField pfSenha;
    
    Fachada fachada=Fachada.criaObjeto();

    @FXML
    void BotaoLogar(ActionEvent event) {
    	if(fachada.confirmaLoginCoordenador(tfLogin.getText(),pfSenha.getText())) {
    		Main.changeScreen("CoordenadorLogado");
    		System.out.println("Logou coordenador");
    	}else {
    		Main.changeScreen("menu");
    		System.out.println("falha no login");
    	}
    	

    }

    @FXML
    void botaoVoltar(ActionEvent event) {
    	System.out.println("voltar menu");
    	Main.changeScreen("Menu");
    }
    
    

}
