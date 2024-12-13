/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lldua
 */
public class Colaborador {
private int idColoborador;
private String nome;
private String email;
private String senha;
private String telefone;

    // Criação do primeiro construtor sem id
    public Colaborador(String nome, String email, String senha, String telefone) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
    }// fim do primeiro construtor

    // criação do segundo construtor com o id
    public Colaborador(int idColoborador, String nome, String email, String senha, String telefone) {
        this.idColoborador = idColoborador;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
    }// fim do segundo construtor
    
    // construtor vazio
    public Colaborador() {
    }// fim do construtor vazio

    public int getIdColoborador() {
        return idColoborador;
    }

    public void setIdColoborador(int idColoborador) {
        this.idColoborador = idColoborador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
   
}// fim da classe Colaborador
