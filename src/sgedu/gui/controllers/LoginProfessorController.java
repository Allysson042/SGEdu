package sgedu.gui.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import sgedu.gui.Main;

public class LoginProfessorController {

    @FXML
    private Button btVoltar;
    
    @FXML
    void botaoVoltar() {
    	System.out.println("voltar menu");
    	Main.changeScreen("Menu");
    }
    

}
