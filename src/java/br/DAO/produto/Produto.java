/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.DAO.produto;

/**
 *
 * @author Familia
 */
public class Produto {
    private int id;
    private int idCategoria;
    private String nome;
    private String descricao;
    private Float valor;

    public Produto(int id, int idCategoria, String nome, String descricao, Float valor) {
        this.id = id;
        this.idCategoria = idCategoria;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Produto(int idCategoria, String nome, String descricao, Float valor) {
        this.idCategoria = idCategoria;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Produto(int id) {
        this.id = id;
    }

    public Produto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
    
    
}
