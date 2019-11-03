package SGEdu.usuarios;

/**
 * Superclass Usuario
 * @author Allysson & Lucas Leonardo
 */
public class Usuario {
    private String nome;
    private String login;
    private String senha;

    public Usuario(String nome, String login, String senha) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public void redefirSenha(String senha) { this.senha = senha; }

    public String getLogin() { return login; }

    public boolean verificaSenha(String senha) {
        if (this.senha.equals(senha)) {
            return true;
        }
        return false;
    }
}