/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.DAO.Cliente;

/**
 *
 * @author Familia
 */
public class Cliente {
    private int id;
    private String nome;
    private String identidade;

    public Cliente(int id, String nome, String identidade, String cpf, String estado, String cidade, String bairro, String cep, String endereco, String referencia, String telFixo, String celular, String numCCredito, String bandCCredito) {
        this.id = id;
        this.nome = nome;
        this.identidade = identidade;
        this.cpf = cpf;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.cep = cep;
        this.endereco = endereco;
        this.referencia = referencia;
        this.telFixo = telFixo;
        this.celular = celular;
        this.numCCredito = numCCredito;
        this.bandCCredito = bandCCredito;
    }

    public Cliente(int id) {
        this.id = id;
    }

    public Cliente(String nome, String identidade, String cpf, String estado, String cidade, String bairro, String cep, String endereco, String referencia, String telFixo, String celular, String numCCredito, String bandCCredito) {
        this.nome = nome;
        this.identidade = identidade;
        this.cpf = cpf;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.cep = cep;
        this.endereco = endereco;
        this.referencia = referencia;
        this.telFixo = telFixo;
        this.celular = celular;
        this.numCCredito = numCCredito;
        this.bandCCredito = bandCCredito;
    }
    private String cpf;
    private String estado;
    private String cidade;
    private String bairro;
    private String cep;
    private String endereco;
    private String referencia;
    private String telFixo;
    private String celular;
    private String numCCredito;
    private String bandCCredito;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the identidade
     */
    public String getIdentidade() {
        return identidade;
    }

    /**
     * @param identidade the identidade to set
     */
    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the referencia
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * @param referencia the referencia to set
     */
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    /**
     * @return the telFixo
     */
    public String getTelFixo() {
        return telFixo;
    }

    /**
     * @param telFixo the telFixo to set
     */
    public void setTelFixo(String telFixo) {
        this.telFixo = telFixo;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @return the numCCredito
     */
    public String getNumCCredito() {
        return numCCredito;
    }

    /**
     * @param numCCredito the numCCredito to set
     */
    public void setNumCCredito(String numCCredito) {
        this.numCCredito = numCCredito;
    }

    /**
     * @return the bandCCredito
     */
    public String getBandCCredito() {
        return bandCCredito;
    }

    /**
     * @param bandCCredito the bandCCredito to set
     */
    public void setBandCCredito(String bandCCredito) {
        this.bandCCredito = bandCCredito;
    }

    
    
}