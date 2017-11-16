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

@WebServlet(name = "Incluir", urlPatterns = {"/Incluir"})
public class Incluir extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        // pegando os parâmetros do request
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        try {
            
            request.setAttribute("erro_login", "");
            request.setAttribute("erro_senha", "");
            if ((senha.isEmpty()) || (login.isEmpty())){  // retorna para o formulario de admin

                if (login.isEmpty()) {
                    
                    request.setAttribute("erro_login", "O Login não pode ser vazio");
                }
                if (senha.isEmpty()) {
                    
                    request.setAttribute("erro_senha", "A Senha não pode ser vazia");
                }

                RequestDispatcher rd = request.getRequestDispatcher("Form_Administrador.jsp");
                rd.forward(request, response);
            } else {

                Administrador admin = new Administrador(login, senha);
                Administrador_DAO admin_dao = new Administrador_DAO();
                try {
                    
                    admin_dao.Inserir(admin);
                    request.setAttribute("mensagem", "Inclusão Com Sucesso");
                    request.setAttribute("retorna", "ListaContato");
                    RequestDispatcher rd = request.getRequestDispatcher("Resposta.jsp");
                    rd.forward(request, response);

                } catch (Exception e) {
                    
                    RequestDispatcher rd = request.getRequestDispatcher("Erro.jsp");
                    rd.forward(request, response);
                }
            }

        } catch (Exception e) {
            
            request.setAttribute("erro_login", "O Login não pode ser vazio");
            request.setAttribute("erro_senha", "A senha não pode ser vazia");
            RequestDispatcher rd = request.getRequestDispatcher("Form_Administrador.jsp");
            rd.forward(request, response);
        }
    }
}
