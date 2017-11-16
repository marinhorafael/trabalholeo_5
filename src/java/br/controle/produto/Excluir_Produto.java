package br.controle.produto;

import br.DAO.produto.Produto;
import br.DAO.produto.Produto_DAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Excluir_Produto", urlPatterns = {"/Excluir_Produto"})
public class Excluir_Produto extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        Produto produto = new Produto(id);
        Produto_DAO produto_dao = new Produto_DAO();
        try {
            
            produto_dao.get(produto);
            request.setAttribute("produto", produto);
            RequestDispatcher rd = request.getRequestDispatcher("Produto/Form_Produto_Excluir.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
            
            RequestDispatcher rd = request.getRequestDispatcher("Erro.jsp");
            rd.forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        Produto produto = new Produto(id);
        try {
            Produto_DAO produto_dao = new Produto_DAO();
            try {
                produto_dao.Excluir(produto);
                request.setAttribute("mensagem", "Exclusão Com Sucesso");
                request.setAttribute("retorna", "ListaProduto");
                RequestDispatcher rd = request.getRequestDispatcher("Resposta.jsp");
                rd.forward(request, response);
            } catch (Exception e) {
                RequestDispatcher rd = request.getRequestDispatcher("Erro.jsp");
                rd.forward(request, response);
            }

        } catch (Exception e) {
            RequestDispatcher rd = request.getRequestDispatcher("Erro.jsp");
            rd.forward(request, response);
        }

    }
}
