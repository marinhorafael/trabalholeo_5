package br.DAO.Compras;

public class Compras {

    private int id;
    private int idCliente;
    private int idProduto;

    public Compras(int id, int idCliente, int idProduto) {
        this.id = id;
        this.idCliente = idCliente;
        this.idProduto = idProduto;
    }

    public Compras(int idCliente, int idProduto) {
        this.idCliente = idCliente;
        this.idProduto = idProduto;
    }

    public Compras(int id) {
        this.id = id;
    }

    public Compras() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
    
    

    
}