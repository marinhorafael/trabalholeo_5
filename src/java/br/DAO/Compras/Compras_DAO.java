/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.DAO.Compras;

import br.DAO.Conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Compras_DAO {

    public void Inserir(Compras compras) throws Exception {
        
        Conexao conexao = new Conexao();
        try {
            
            PreparedStatement sql = conexao.getConexao().prepareStatement("INSERT INTO COMPRAS (idCliente, idProduto) VALUES (?,?)");
            sql.setInt(1, compras.getIdCliente());
            sql.setInt(2, compras.getIdProduto());
            sql.executeUpdate();
        } catch (Exception e) {
            
            throw new RuntimeException();
        } finally {
            
            conexao.closeConexao();
        }
    }

    public Compras get(Compras compras) throws Exception {
        
        Conexao conexao = new Conexao();
        try {
            
            PreparedStatement sql = conexao.getConexao().prepareStatement("SELECT * FROM COMPRAS WHERE ID = ? ");
            sql.setInt(1, compras.getId());
            ResultSet resultado = sql.executeQuery();
            if (resultado != null) {
                
                while (resultado.next()) {
                    
                    compras.setIdCliente(Integer.parseInt(resultado.getString("idCliente")));
                    compras.setIdProduto(Integer.parseInt(resultado.getString("idProduto")));
                }
            }
            return compras;
        } catch (Exception e) {
            
            throw new RuntimeException();
        } finally {
            
            conexao.closeConexao();
        }
    }

    public void Alterar(Compras compras) throws Exception {
        
        Conexao conexao = new Conexao();
        try {
            
            PreparedStatement sql = conexao.getConexao().prepareStatement("UPDATE COMPRAS SET idCliente = ?, idProduto = ?  WHERE ID = ? ");
            sql.setInt(1, compras.getIdCliente());
            sql.setInt(2, compras.getIdProduto());
            sql.setInt(3, compras.getId());
            sql.executeUpdate();
        } catch (Exception e) {
            
            throw new RuntimeException();
        } finally {
            
            conexao.closeConexao();
        }
    }
    
    public void Excluir(Compras compras) throws Exception {
        
        Conexao conexao = new Conexao();
        try {
            
            PreparedStatement sql = conexao.getConexao().prepareStatement("DELETE FROM COMPRAS WHERE ID = ? ");
            sql.setInt(1, compras.getId());
            sql.executeUpdate();
        } catch (Exception e) {
            
            throw new RuntimeException();
        } finally {
            
            conexao.closeConexao();
        }
    }

    public ArrayList<Compras> Listar() {
        
        ArrayList<Compras> minhasCompras = new ArrayList();
        Conexao conexao = new Conexao();
        try {
            
            String selectSQL = "SELECT * FROM COMPRAS";
            PreparedStatement preparedStatement;
            preparedStatement = conexao.getConexao().prepareStatement(selectSQL);
            ResultSet resultado = preparedStatement.executeQuery();
            if (resultado != null) {
                
                while (resultado.next()) {
                    
                    Compras compras;
                    compras = new Compras(Integer.parseInt(resultado.getString("id")),
                            Integer.parseInt(resultado.getString("idCliente")),
                            Integer.parseInt(resultado.getString("idProduto")));
                    minhasCompras.add(compras);
                }
            }
        } catch (SQLException e) {
            
            e.printStackTrace();
        } finally {
            
            conexao.closeConexao();
        }
        return minhasCompras;
    }
}
