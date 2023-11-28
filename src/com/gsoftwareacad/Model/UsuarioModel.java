// UsuarioModel.java
package com.gsoftwareacad.Model;

public class UsuarioModel {
    private String id;
    private String nome;
    private String telefone;
    private String login;
    private String senha;
    private String perfil;

    // Adicione um construtor
    public UsuarioModel(String id, String nome, String telefone, String login, String senha, String perfil) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
    }

    // Adicione os getters
    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public String getPerfil() {
        return perfil;
    }
}
