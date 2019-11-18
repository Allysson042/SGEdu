package SGEdu.usuarios;

import java.io.Serializable;

/**
 * Superclass Usuario
 * @author Allysson & Lucas Leonardo
 */
public class Usuario implements Serializable {
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

    public void setSenha(String senha) { this.senha = senha; }

    public String getLogin() { return login; }

    public String getSenha() { return senha; }
    
    public boolean verificaSenha(String senha) {
        if (this.senha.equals(senha)) {
            return true;
        }
        return false;
    }
}