/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.controle.Categoria;

import br.DAO.Categoria.Categoria;
import br.DAO.Categoria.Categoria_DAO;
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
@WebServlet(name = "Visualizar_Categ", urlPatterns = {"/Visualizar_Categ"})
public class Visualizar_Categ extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        Categoria categ = new Categoria(id);
        Categoria_DAO categ_dao = new Categoria_DAO();
        try {
            
            categ_dao.get(categ);
            request.setAttribute("categ", categ);
            RequestDispatcher rd = request.getRequestDispatcher("Categoria/Form_Categ_Visualizar.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
            
            RequestDispatcher rd = request.getRequestDispatcher("Erro.jsp");
            rd.forward(request, response);
        }
    }

}
