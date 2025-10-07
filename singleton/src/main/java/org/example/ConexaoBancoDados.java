package org.example;

public class ConexaoBancoDados {

    private static ConexaoBancoDados instance = new ConexaoBancoDados();

    private ConexaoBancoDados() {}

    public static ConexaoBancoDados getInstance() {
        return instance;
    }

    private String url;
    private String usuario;
    private String senha;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}

