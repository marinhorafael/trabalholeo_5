/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.controle.Compras;

import br.DAO.Compras.Compras;
import br.DAO.Compras.Compras_DAO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Leo
 */
@WebServlet(name = "Editar_Compras", urlPatterns = {"/Editar_Compras"})
public class Editar_Compras extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        Compras compras = new Compras(id);
        Compras_DAO compras_dao = new Compras_DAO();
        try {

            compras_dao.get(compras);
            request.setAttribute("compras", compras);
            RequestDispatcher rd = request.getRequestDispatcher("Compras/Form_Compras_Editar.jsp");
            rd.forward(request, response);
        } catch (Exception e) {

            RequestDispatcher rd = request.getRequestDispatcher("Erro.jsp");
            rd.forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        int idCliente = Integer.parseInt(request.getParameter("idCliente"));
        int idProduto = Integer.parseInt(request.getParameter("idProduto"));
        Compras compras = new Compras(id, idCliente, idProduto);
        try {
            
            if ((idCliente == 0) || (idProduto == 0)){ 

                if (idCliente == 0) {
                    
                    request.setAttribute("erro_idCliente", "Cliente não pode ser vazio.");
                }
                if (idProduto == 0) {
                    
                    request.setAttribute("erro_idProduto", "Produto não pode ser vazio.");
                }
                request.setAttribute("compras", compras);
                RequestDispatcher rd = request.getRequestDispatcher("Compras/Form_Compras_Editar.jsp");
                rd.forward(request, response);
            } else {

                Compras_DAO compras_dao = new Compras_DAO();
                try {
                    
                    compras_dao.Alterar(compras);
                    request.setAttribute("mensagem", "Alterado Com Sucesso");
                    request.setAttribute("retorna", "ListaCompras");
                    RequestDispatcher rd = request.getRequestDispatcher("Resposta.jsp");
                    rd.forward(request, response);
                } catch (Exception e) {
                    
                    RequestDispatcher rd = request.getRequestDispatcher("Erro.jsp");
                    rd.forward(request, response);
                }
            }
        } catch (Exception e) {
            
            request.setAttribute("erro_idCliente", "Cliente não pode ser vazio.");
            request.setAttribute("erro_idProduto", "Produto não pode ser vazio.");
            RequestDispatcher rd = request.getRequestDispatcher("Form_Compras.jsp");
            rd.forward(request, response);
        }
    }
}
