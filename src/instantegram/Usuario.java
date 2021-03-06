/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instantegram;

import java.util.ArrayList;

/**
 *
 * @author proae
 */
public class Usuario {
    private String nome;
    private String sobrenome;
    private String sexo;
    private String login;
    private String senha;
    private ArrayList<Publicacao> publicacoes;
    private ArrayList<Usuario> seguidores;
    private ArrayList<Usuario> seguidos;

    public Usuario(String nome, String sobrenome, String sexo, String login, String Senha) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.login = login;
        this.senha = senha;
        this.publicacoes = new ArrayList<>();
        this.seguidores = new ArrayList<>();
        this.seguidos = new ArrayList<>();
    }
    
    public void addPublicacao(Publicacao publicacao){
        this.publicacoes.add(publicacao);
    }
    
    public void addSeguidor(Usuario usuario){
        this.seguidores.add(usuario);
    }
    
    public void addSeguidos(Usuario usuario){
        this.seguidos.add(usuario);
    }
    
    public String getSenha() {
        return senha;
    }
    
    public String getLogin() {
        return login;
    }
    
    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getSexo() {
        return sexo;
    }
    
}
