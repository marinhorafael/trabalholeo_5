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
import java.util.ArrayList;
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
@WebServlet(name = "ListaCliente", urlPatterns = {"/ListaCliente"})
public class ListaCliente extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Cliente_DAO client_dao = new Cliente_DAO();
        ArrayList<Cliente> meusClientes = client_dao.Listar();
        request.setAttribute("meusClientes", meusClientes);
        RequestDispatcher rd = request.getRequestDispatcher("Cliente/ListaClienteView.jsp");
        rd.forward(request, response);

    }

}
