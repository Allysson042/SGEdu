package sgedu.gui.controllers;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import sgedu.gui.UsuarioLogado;
import sgedu.negocios.entidade.diario.Bimestre;
import sgedu.negocios.entidade.diario.BimestreDisciplina;
import sgedu.negocios.entidade.diario.Boletim;
import sgedu.negocios.entidade.usuarios.Aluno;

public class VisualizarBoletimController implements Initializable {

    @FXML
    private ListView<BimestreDisciplina> lvBimestre1;
    
    Aluno usuarioLogado=(Aluno) UsuarioLogado.user;
    
    
    
    
    
    
    
    ArrayList <BimestreDisciplina> notas;
    
    private ObservableList<BimestreDisciplina> obsNotas;
    
    @Override
    public void initialize(URL rul, ResourceBundle rb) {
    	carregarCategoria();
    }
    
    
    public void carregarCategoria() {
    	ArrayList<Boletim> arrayBoletim=usuarioLogado.getBoletins();
        Boletim boletim=arrayBoletim.get(0);
        
        ArrayList<Bimestre> bimestres = boletim.getBimestres();
        Bimestre bimestre=bimestres.get(0);
    	
        notas=bimestre.getBimestreDisciplinas();
    	
    	
    	obsNotas=FXCollections.observableArrayList(notas);
    	
    	lvBimestre1.setItems(obsNotas);	
    }
    
    
    
    
    
    
    
    

}
