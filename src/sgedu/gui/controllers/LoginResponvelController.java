package sgedu.gui.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import sgedu.fachada.Fachada;
import sgedu.main.Main;

public class LoginResponvelController {


    @FXML
    private Button btVoltar;
    
    @FXML
    private TextField tfLogin;

    @FXML
    private Button btLogar;
    
    @FXML
    private PasswordField pfSenha;

    @FXML
    void BotaoLogar(ActionEvent event) {
    	if(Fachada.negocioAluno.confirmaLogin(tfLogin.getText(),pfSenha.getText())) {
    		Main.changeScreen("ResponsavelLogado");
    	}else {
    		Main.changeScreen("menu");
    	}

    }

    @FXML
    void botaoVoltar(ActionEvent event) {
    	System.out.println("voltar menu");
    	Main.changeScreen("Menu");
    }

}
