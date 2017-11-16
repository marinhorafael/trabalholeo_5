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

@WebServlet(name = "Incluir_Produto", urlPatterns = {"/Incluir_Produto"})
public class Incluir_Produto extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // pegando os parâmetros do request
        int idCateg = Integer.parseInt(request.getParameter("idCateg"));
        String nome = request.getParameter("nome");
        String descricao = request.getParameter("descricao");
        Float valor = Float.parseFloat(request.getParameter("valor"));
        try {
            
            request.setAttribute("erro_idCateg", "");
            request.setAttribute("erro_nome", "");
            request.setAttribute("erro_descricao", "");
            request.setAttribute("erro_valor", "");
            if ((idCateg < 0 || nome.isEmpty() || descricao.isEmpty() || valor < 0.0)) {  // retorna para o formulario de categoria

                if (idCateg < 0) {

                    request.setAttribute("erro_idCateg", "Categoria não pode ser vazia.");
                }
                if (nome.isEmpty()) {

                    request.setAttribute("erro_nome", "Nome não pode ser vazio.");
                }
                if (descricao.isEmpty()) {

                    request.setAttribute("erro_descricao", "Descricao não pode ser vazia.");
                }
                if (valor < 0.0) {

                    request.setAttribute("erro_valor", "Valor não pode ser vazio.");
                }
                RequestDispatcher rd = request.getRequestDispatcher("Form_Produto.jsp");
                rd.forward(request, response);
            } else {

                Produto produto = new Produto(idCateg, nome, descricao, valor);
                Produto_DAO produto_dao = new Produto_DAO();
                try {
                    produto_dao.Inserir(produto);
                    request.setAttribute("mensagem", "Inclusão Com Sucesso");
                    request.setAttribute("retorna", "ListaProduto");
                    RequestDispatcher rd = request.getRequestDispatcher("Resposta.jsp");
                    rd.forward(request, response);

                } catch (Exception e) {
                    RequestDispatcher rd = request.getRequestDispatcher("Erro.jsp");
                    rd.forward(request, response);
                }

            }

        } catch (Exception e) {
            request.setAttribute("erro_idCateg", "Categoria não pode ser vazia.");
            request.setAttribute("erro_nome", "Nome não pode ser vazio.");
            request.setAttribute("erro_descricao", "Descricao não pode ser vazia.");
            request.setAttribute("erro_valor", "Valor não pode ser vazio.");
            RequestDispatcher rd = request.getRequestDispatcher("Form_Produto.jsp");
            rd.forward(request, response);
        }

    }

}
