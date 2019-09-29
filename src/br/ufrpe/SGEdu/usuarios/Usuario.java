package br.ufrpe.SGEdu.usuarios;

/**
 * Classe Usuario, SuperClasse que cria objetos usuário ao qual utilizaram o sistema;
 * @author
 */
public class Usuario {
    private String nome;
    private String login;
    private String senha;

    /**
     * Construtor Usuario
     * @param nome
     * @param login
     * @param senha
     */
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

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
