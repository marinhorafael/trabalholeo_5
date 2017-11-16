/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.DAO.Cliente;

import br.DAO.Conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Familia
 */
public class Cliente_DAO {

    public void Inserir(Cliente client) throws Exception {

        Conexao conexao = new Conexao();
        try {

            PreparedStatement sql = conexao.getConexao().prepareStatement("INSERT INTO CLIENTE (nome,identidade,cpf,estado,cidade,bairro,cep,endereco,referencia,telfixo,celular,numccredito,bandccredito) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
            sql.setString(1, client.getNome());
            sql.setString(2, client.getIdentidade());
            sql.setString(3, client.getCpf());
            sql.setString(4, client.getEstado());
            sql.setString(5, client.getCidade());
            sql.setString(6, client.getBairro());
            sql.setString(7, client.getCep());
            sql.setString(8, client.getEndereco());
            sql.setString(9, client.getReferencia());
            sql.setString(10, client.getTelFixo());
            sql.setString(11, client.getCelular());
            sql.setString(12, client.getNumCCredito());
            sql.setString(13, client.getBandCCredito());
            sql.executeUpdate();
        } catch (Exception e) {

            throw new RuntimeException();
        } finally {

            conexao.closeConexao();
        }
    }

    public Cliente get(Cliente client) throws Exception {

        Conexao conexao = new Conexao();
        try {

            PreparedStatement sql = conexao.getConexao().prepareStatement("SELECT * FROM CLIENTE WHERE id = ? ");
            sql.setInt(1, client.getId());
            ResultSet resultado = sql.executeQuery();
            if (resultado != null) {

                while (resultado.next()) {

                    client.setNome(resultado.getString("nome"));
                    client.setIdentidade(resultado.getString("identidade"));
                    client.setCpf(resultado.getString("cpf"));
                    client.setEstado(resultado.getString("estado"));
                    client.setCidade(resultado.getString("cidade"));
                    client.setBairro(resultado.getString("bairro"));
                    client.setCep(resultado.getString("cep"));
                    client.setEndereco(resultado.getString("endereco"));
                    client.setReferencia(resultado.getString("referencia"));
                    client.setTelFixo(resultado.getString("telFixo"));
                    client.setCelular(resultado.getString("celular"));
                    client.setNumCCredito(resultado.getString("numCCredito"));
                    client.setBandCCredito(resultado.getString("bandCCredito"));
                }
            }
            return client;
        } catch (Exception e) {

            throw new RuntimeException();
        } finally {

            conexao.closeConexao();
        }
    }

    public void Alterar(Cliente client) throws Exception {

        Conexao conexao = new Conexao();
        try {

            PreparedStatement sql = conexao.getConexao().prepareStatement("UPDATE CLIENTE SET NOME = ?,IDENTIDADE = ?,CPF = ?,ESTADO = ?,CIDADE = ?,BAIRRO = ?,CEP = ?,ENDERECO = ?,REFERENCIA = ?,TELFIXO = ?,CELULAR = ?,NUMCCREDITO = ?,BANDCCREDITO = ? WHERE id = ? ");
            sql.setString(1, client.getNome());
            sql.setString(2, client.getIdentidade());
            sql.setString(3, client.getCpf());
            sql.setString(4, client.getEstado());
            sql.setString(5, client.getCidade());
            sql.setString(6, client.getBairro());
            sql.setString(7, client.getCep());
            sql.setString(8, client.getEndereco());
            sql.setString(9, client.getReferencia());
            sql.setString(10, client.getTelFixo());
            sql.setString(11, client.getCelular());
            sql.setString(12, client.getNumCCredito());
            sql.setString(13, client.getBandCCredito());
            sql.setInt(14, client.getId());
            sql.executeUpdate();
        } catch (Exception e) {

            throw new RuntimeException();
        } finally {

            conexao.closeConexao();
        }
    }

    public void Excluir(Cliente client) throws Exception {
        Conexao conexao = new Conexao();
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement("DELETE FROM CLIENTE WHERE ID = ? ");
            sql.setInt(1, client.getId());
            sql.executeUpdate();

        } catch (Exception e) {
            throw new RuntimeException();
        } finally {
            conexao.closeConexao();
        }
    }

    public ArrayList<Cliente> Listar() {

        ArrayList<Cliente> meusClientes = new ArrayList();
        Conexao conexao = new Conexao();
        try {

            String selectSQL = "SELECT * FROM CLIENTE";
            PreparedStatement preparedStatement;
            preparedStatement = conexao.getConexao().prepareStatement(selectSQL);
            ResultSet resultado = preparedStatement.executeQuery();
            if (resultado != null) {

                while (resultado.next()) {

                    Cliente client;
                    client = new Cliente(Integer.parseInt(resultado.getString("id")),
                            resultado.getString("nome"),
                            resultado.getString("identidade"),
                            resultado.getString("cpf"),
                            resultado.getString("estado"),
                            resultado.getString("cidade"),
                            resultado.getString("bairro"),
                            resultado.getString("cep"),
                            resultado.getString("endereco"),
                            resultado.getString("referencia"),
                            resultado.getString("telFixo"),
                            resultado.getString("celular"),
                            resultado.getString("numCCredito"),
                            resultado.getString("bandCCredito"));
                    meusClientes.add(client);
                }
            }
        } catch (SQLException e) {
            
            e.printStackTrace();
        } finally {
            
            conexao.closeConexao();
        }
        return meusClientes;
    }
}
