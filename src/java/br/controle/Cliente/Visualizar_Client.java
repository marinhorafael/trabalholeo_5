/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.controle.Cliente;

import br.DAO.Cliente.Cliente;
import br.DAO.Cliente.Cliente_DAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Familia
 */
@WebServlet(name = "Visualizar_Client", urlPatterns = {"/Visualizar_Client"})
public class Visualizar_Client extends HttpServlet {

 @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        Cliente client = new Cliente(id);
        Cliente_DAO client_dao = new Cliente_DAO();
        try {
            client_dao.get(client);
            request.setAttribute("client", client);

            RequestDispatcher rd = request.getRequestDispatcher("Cliente/Form_Client_Visualizar.jsp");
            rd.forward(request, response);

        } catch (Exception e) {
            RequestDispatcher rd = request.getRequestDispatcher("Erro.jsp");
            rd.forward(request, response);
        }
    }

}
