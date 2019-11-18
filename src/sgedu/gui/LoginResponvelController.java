package SGEdu.GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class LoginResponvelController {

    @FXML
    private Button btVoltar;

    @FXML
    void botaoVoltar(ActionEvent event) {
    	System.out.println("voltar menu");
    	Main.changeScreen("Menu");

    }

}
