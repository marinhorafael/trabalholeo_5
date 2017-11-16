package br.controle.Categoria;

import br.DAO.Categoria.Categoria;
import br.DAO.Categoria.Categoria_DAO;
import java.io.IOException;
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
@WebServlet(name = "Editar_Categ", urlPatterns = {"/Editar_Categ"})
public class Editar_Categ extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        Categoria categ = new Categoria(id);
        Categoria_DAO categ_dao = new Categoria_DAO();
        try {
            
            categ_dao.get(categ);
            request.setAttribute("categ", categ);
            RequestDispatcher rd = request.getRequestDispatcher("Categoria/Form_Categ_Editar.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
            
            RequestDispatcher rd = request.getRequestDispatcher("Erro.jsp");
            rd.forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        String descricao = request.getParameter("descricao");

        Categoria categ = new Categoria(id, descricao);
        try {
            if ((descricao.isEmpty())) {  

                if (descricao.isEmpty()) {
                    request.setAttribute("erro_descricao", "Descrição não pode ser vazia.");
                }
              
                request.setAttribute("categ", categ);
                RequestDispatcher rd = request.getRequestDispatcher("Categoria/Form_Categ_Editar.jsp");
                rd.forward(request, response);
            } else {

                Categoria_DAO categ_dao = new Categoria_DAO();
                try {
                    
                    categ_dao.Alterar(categ);
                    request.setAttribute("mensagem", "Alterado Com Sucesso");
                    request.setAttribute("retorna", "ListaCategoria");
                    RequestDispatcher rd = request.getRequestDispatcher("Resposta.jsp");
                    rd.forward(request, response);
                } catch (Exception e) {
                    
                    RequestDispatcher rd = request.getRequestDispatcher("Erro.jsp");
                    rd.forward(request, response);
                }
            }
        } catch (Exception e) {
            
            request.setAttribute("erro_descricao", "A categoria não pode ser vazia");
            RequestDispatcher rd = request.getRequestDispatcher("Form_Categ.jsp");
            rd.forward(request, response);
        }
    }
}
