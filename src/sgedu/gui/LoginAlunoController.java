package sgedu.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class LoginAlunoController {

    @FXML
    private Button btVoltar;
    
    
    @FXML
    void botaoVoltar() {
    	System.out.println("voltar menu");
    	Main.changeScreen("Menu");
    }

}
