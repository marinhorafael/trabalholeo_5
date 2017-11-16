/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.DAO.produto;

import br.DAO.Conexao.Conexao;
import br.DAO.produto.Produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Produto_DAO {

    public void Inserir(Produto produto) throws Exception {
        Conexao conexao = new Conexao();
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement("INSERT INTO produto (idCategoria, nome, descricao, valor) VALUES (?,?,?,?)");
            sql.setInt(1, produto.getIdCategoria());
            sql.setString(2, produto.getNome());
            sql.setString(3, produto.getDescricao());
            sql.setFloat(4, produto.getValor());
            sql.executeUpdate();

        } catch (Exception e) {
            throw new RuntimeException();
        } finally {
            conexao.closeConexao();
        }
    }

    public Produto get(Produto produto) throws Exception {
        
        Conexao conexao = new Conexao();
        try {
            
            PreparedStatement sql = conexao.getConexao().prepareStatement("SELECT * FROM PRODUTO WHERE ID = ? ");
            sql.setInt(1, produto.getId());
            ResultSet resultado = sql.executeQuery();
            if (resultado != null) {
                
                while (resultado.next()) {
                    
                    produto.setIdCategoria(Integer.parseInt(resultado.getString("idCateg")));
                    produto.setNome(resultado.getString("nome"));
                    produto.setDescricao(resultado.getString("descricao"));
                    produto.setValor(Float.parseFloat(resultado.getString("valor")));
                }
            }
            return produto;
        } catch (Exception e) {
            
            throw new RuntimeException();
        } finally {

            conexao.closeConexao();
        }
    }

    public void Alterar(Produto produto) throws Exception {
        Conexao conexao = new Conexao();
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement("UPDATE PRODUTO SET idCategoria = ?, nome = ?, descricao = ?, valor = ?  WHERE ID = ?");
            sql.setInt(1, produto.getIdCategoria());
            sql.setString(2, produto.getNome());
            sql.setString(3, produto.getDescricao());
            sql.setFloat(4, produto.getValor());
            sql.setInt(5, produto.getId());
            sql.executeUpdate();

        } catch (Exception e) {
            throw new RuntimeException();
        } finally {
            conexao.closeConexao();
        }
    }

    public void Excluir(Produto produto) throws Exception {
        Conexao conexao = new Conexao();
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement("DELETE FROM produto WHERE ID = ? ");
            sql.setInt(1, produto.getId());
            sql.executeUpdate();

        } catch (Exception e) {
            throw new RuntimeException();
        } finally {
            conexao.closeConexao();
        }
    }

    public ArrayList<Produto> Listar() {
        ArrayList<Produto> meusProdutos = new ArrayList();
        Conexao conexao = new Conexao();
        try {
            String selectSQL = "SELECT * FROM PRODUTO";
            PreparedStatement preparedStatement;
            preparedStatement = conexao.getConexao().prepareStatement(selectSQL);
            ResultSet resultado = preparedStatement.executeQuery();
            if (resultado != null) {
                while (resultado.next()) {
                    Produto produto;
                    produto = new Produto(
                            Integer.parseInt(resultado.getString("id")),
                            Integer.parseInt(resultado.getString("idCateg")),
                            resultado.getString("nome"),
                            resultado.getString("descricao"),
                            Float.parseFloat(resultado.getString("valor"))
                    );
                    meusProdutos.add(produto);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexao.closeConexao();
        }
        return meusProdutos;

    }

}
