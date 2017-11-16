/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.controle.Administrador;

import br.DAO.Administrador.Administrador;
import br.DAO.Administrador.Administrador_DAO;
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
@WebServlet(name = "Editar", urlPatterns = {"/Editar"})
public class Editar extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        Administrador admin = new Administrador(id);
        Administrador_DAO admin_dao = new Administrador_DAO();
        try {
            admin_dao.get(admin);
            request.setAttribute("admin", admin);

            RequestDispatcher rd = request.getRequestDispatcher("Administrador/Form_Contato_Editar.jsp");
            rd.forward(request, response);

        } catch (Exception e) {
            RequestDispatcher rd = request.getRequestDispatcher("Erro.jsp");
            rd.forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        String senha = request.getParameter("senha");
        String login = request.getParameter("login");
        Administrador admin = new Administrador(id, login, senha);
        try {
            
            if ((senha.isEmpty()) || (login.isEmpty())){// retorna para o formulario de admin

                if (login.isEmpty()) {
                    
                    request.setAttribute("erro_login", "O login não pode ser vazio");
                }
                if (senha.isEmpty()) {
                    
                    request.setAttribute("erro_senha", "A senha não pode ser vazia");
                }
                request.setAttribute("admin", admin);
                RequestDispatcher rd = request.getRequestDispatcher("Administrador/Form_Contato_Editar.jsp");
                rd.forward(request, response);
            } else {

                Administrador_DAO admin_dao = new Administrador_DAO();
                try {
                    
                    admin_dao.Alterar(admin);
                    request.setAttribute("mensagem", "Alterado Com Sucesso");
                    request.setAttribute("retorna", "ListaContato");
                    RequestDispatcher rd = request.getRequestDispatcher("Resposta.jsp");
                    rd.forward(request, response);
                } catch (Exception e) {
                    
                    RequestDispatcher rd = request.getRequestDispatcher("Erro.jsp");
                    rd.forward(request, response);
                }
            }
        } catch (Exception e) {
            
            request.setAttribute("erro_login", "O login não pode ser vazio");
            request.setAttribute("erro_senha", "A senha não pode ser vazia");
            RequestDispatcher rd = request.getRequestDispatcher("Form_Administrador.jsp");
            rd.forward(request, response);
        }
    }
}
