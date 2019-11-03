package SGEdu.usuarios;
import java.util.Scanner;

/**
 * Class Coordenador
 * @author Allysson & Lucas Leonardo
 */
public class Coordenador extends Usuario {
    Scanner sc = new Scanner(System.in);

    public Coordenador(String nome, String login, String senha) {
        super(nome, login, senha);
    }
}
