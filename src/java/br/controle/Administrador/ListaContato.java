/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.controle.Administrador;

import br.DAO.Administrador.Administrador;
import br.DAO.Administrador.Administrador_DAO;
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
 * @author Leo
 */
@WebServlet(name = "ListaContato", urlPatterns = {"/ListaContato"})
public class ListaContato extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Administrador_DAO admin_dao = new Administrador_DAO();
        ArrayList<Administrador> meusContatos = admin_dao.Listar();
        request.setAttribute("meusContatos", meusContatos);
        RequestDispatcher rd = request.getRequestDispatcher("Administrador/ListaContatoView.jsp");
        rd.forward(request, response);

    }

}
