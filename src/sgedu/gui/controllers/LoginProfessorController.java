package sgedu.gui.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import sgedu.fachada.Fachada;
import sgedu.main.Main;

public class LoginProfessorController {


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
    void botaoLogar(ActionEvent event) {
    	if(fachada.confirmaLoginProfessor(tfLogin.getText(),pfSenha.getText())) {
    		Main.changeScreen("ProfessorLogado");
    		System.out.println("Logou professor");
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
