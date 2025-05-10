/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Pessoa {
    //Classe pessoa
    private int id;
    private String nome;
    private String sobrenome;
    private String datanascimento;

    public Pessoa(int id, String nome, String sobrenome, String datanascimento) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.datanascimento = datanascimento;
    }

    public Pessoa(){
        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }
    
}
