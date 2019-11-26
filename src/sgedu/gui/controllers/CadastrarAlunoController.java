package sgedu.gui.controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sgedu.fachada.Fachada;
import sgedu.negocios.entidade.usuarios.Aluno;
import sgedu.negocios.excecoes.UsuarioJaCadastradoException;

public class CadastrarAlunoController {



    @FXML
    private TextField tfNome;

    @FXML
    private TextField tfSenha;

    @FXML
    private Label lbLogin;

    @FXML
    private Button btVoltar;

    @FXML
    private PasswordField tfSenha2;

    @FXML
    private Button btCadastrar;
    
    Fachada fachada=Fachada.criaObjeto();

    @FXML
    void botaoCadastrar(ActionEvent event) {
    	Aluno aluno = new Aluno(tfNome.getText(),tfSenha.getText());
    	

		try {
			fachada.adicionarAluno(aluno);
			lbLogin.setText(aluno.getLogin());
			System.out.println(aluno.getLogin());
		} catch (ClassNotFoundException | UsuarioJaCadastradoException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	

    }

    @FXML
    void botaoVoltar(ActionEvent event) {
    	System.out.println("voltar menu");
    	Stage stage = (Stage) btVoltar.getScene().getWindow();
    	stage.close();	

    }

}
