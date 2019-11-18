package SGEdu.usuarios;

import java.io.Serializable;

/**
 * Class Coordenador
 * @author Allysson & Lucas Leonardo
 */

public class Coordenador extends Usuario implements Serializable{

    public Coordenador(String nome, String login, String senha) {
        super(nome, login, senha);
    }
}
