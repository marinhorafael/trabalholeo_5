package br.DAO.Administrador;

public class Administrador {

    private int id;
    private String login;
    private String senha;
    
    public Administrador(int id){
        this.id = id;
    }
    public Administrador(String login, String senha) {

        this.login = login;
        this.senha = senha;
    }

    public Administrador(int id, String login, String senha) {
        this.id = id;
        this.login = login;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
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

}
