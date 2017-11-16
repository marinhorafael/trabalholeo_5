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

@WebServlet(name = "Incluir_Categ", urlPatterns = {"/Incluir_Categ"})
public class Incluir_Categ extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // pegando os parâmetros do request
        String descricao = request.getParameter("descricao");
        try {
            request.setAttribute("erro_descricao", "");

            if (descricao.isEmpty()) // verifica os dados
            {  // retorna para o formulario de categ

                if (descricao.isEmpty()) {
                    request.setAttribute("erro_descricao", "Descrição não pode ser vazia");
                }

                
                RequestDispatcher rd = request.getRequestDispatcher("Form_Categ.jsp");
                rd.forward(request, response);
            } else {

                Categoria categ = new Categoria(descricao);
                Categoria_DAO categ_dao = new Categoria_DAO();
                try {
                    categ_dao.Inserir(categ);
                    request.setAttribute("mensagem", "Inclusão Com Sucesso");
                    request.setAttribute("retorna", "ListaCategoria");
                    RequestDispatcher rd = request.getRequestDispatcher("Resposta.jsp");
                    rd.forward(request, response);

                } catch (Exception e) {
                    
                    RequestDispatcher rd = request.getRequestDispatcher("Erro.jsp");
                    rd.forward(request, response);
                }

            }

        } catch (Exception e) {
            
            request.setAttribute("erro_descricao", "A Descrição não pode ser vazia.");
            RequestDispatcher rd = request.getRequestDispatcher("Form_Categ.jsp");
            rd.forward(request, response);
        }

    }

}
