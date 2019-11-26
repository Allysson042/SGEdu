package sgedu.gui.controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class CrudAlunoController {
	 @FXML
    private Button btCadastrar;

    @FXML
    private Button btAlterarDados;

    @FXML
    private Button btRemover;

    @FXML
    private Button btVisualizarAlunos;

    @FXML
    private Button btVoltar;

    @FXML
    void botaoAlterarDados(ActionEvent event) {

    }

    @FXML
    void botaoCadastrar(ActionEvent event) {
    	try {
			/////carregando a proxima tela
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../telas/CadastrarAluno.fxml"));
			Parent root = loader.load();
		
			Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Cadastro de aluno");
            stage.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

    }

    @FXML
    void botaoRemover(ActionEvent event) {

    }

    @FXML
    void botaoVisualizarAlunos(ActionEvent event) {

    }

    @FXML
    void botaoVoltar(ActionEvent event) {
    	System.out.println("voltar menu");
    	Stage stage = (Stage) btVoltar.getScene().getWindow();
    	stage.close();	
    }
}
