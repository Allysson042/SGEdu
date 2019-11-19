package sgedu.gui.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import sgedu.gui.Main;

public class LoginCoordenadorController {

    @FXML
    private Button btVoltar;

    @FXML
    void botaoVoltar(ActionEvent event) {
    	System.out.println("voltar menu");
    	Main.changeScreen("Menu");
    }

}
