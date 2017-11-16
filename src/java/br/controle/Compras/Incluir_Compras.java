/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.controle.Compras;

import br.DAO.Compras.Compras;
import br.DAO.Compras.Compras_DAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Incluir_Compras", urlPatterns = {"/Incluir_Compras"})
public class Incluir_Compras extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int idCliente = Integer.parseInt(request.getParameter("idCliente"));
        int idProduto = Integer.parseInt(request.getParameter("idProduto"));
        try {

            request.setAttribute("erro_cliente", "");
            request.setAttribute("erro_produto", "");

            if ((idProduto == 0) || (idCliente == 0)) { 

                if (idCliente ==0) {
                    
                    request.setAttribute("erro_cliente", "Cliente não pode ser vazio.");
                }
                if (idProduto == 0) {
                    
                    request.setAttribute("erro_produto", "Produto não pode ser vazio.");
                }
                RequestDispatcher rd = request.getRequestDispatcher("Form_Compras.jsp");
                rd.forward(request, response);
            } else {

                Compras compras = new Compras(idCliente, idProduto);
                Compras_DAO compras_dao = new Compras_DAO();
                try {
                    
                    compras_dao.Inserir(compras);
                    request.setAttribute("mensagem", "Inclusão Com Sucesso");
                    request.setAttribute("retorna", "ListaCompras");
                    RequestDispatcher rd = request.getRequestDispatcher("Resposta.jsp");
                    rd.forward(request, response);
                } catch (Exception e) {
                    
                    RequestDispatcher rd = request.getRequestDispatcher("Erro.jsp");
                    rd.forward(request, response);
                }
            }
        } catch (Exception e) {
            request.setAttribute("erro_cliente", "Cliente não pode ser vazio.");
            request.setAttribute("erro_produto", "Produto não pode ser vazio.");
            RequestDispatcher rd = request.getRequestDispatcher("Form_Compras.jsp");
            rd.forward(request, response);
        }

    }

}
