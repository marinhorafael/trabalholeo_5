
package br.controle.produto;

import br.DAO.produto.Produto;
import br.DAO.produto.Produto_DAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ListaProduto", urlPatterns = {"/ListaProduto"})
public class ListaProduto extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Produto_DAO produto_dao = new Produto_DAO();
        ArrayList<Produto> meusProdutos = produto_dao.Listar();
        request.setAttribute("meusProdutos", meusProdutos);
        RequestDispatcher rd = request.getRequestDispatcher("Produto/ListaProdutoView.jsp");
        rd.forward(request, response);
    }
}
