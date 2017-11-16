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
@WebServlet(name = "Visualizar", urlPatterns = {"/Visualizar"})
public class Visualizar extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        Administrador admin = new Administrador(id);
        Administrador_DAO admin_dao = new Administrador_DAO();
        try {
            
            admin_dao.get(admin);
            request.setAttribute("admin", admin);
            RequestDispatcher rd = request.getRequestDispatcher("Administrador/Form_Contato_Visualizar.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
            
            RequestDispatcher rd = request.getRequestDispatcher("Erro.jsp");
            rd.forward(request, response);
        }
    }

}
