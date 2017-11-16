package br.controle.produto;

import br.DAO.produto.Produto;
import br.DAO.produto.Produto_DAO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Editar_Produto", urlPatterns = {"/Editar_Produto"})
public class Editar_Produto extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        Produto produto = new Produto(id);
        Produto_DAO produto_dao = new Produto_DAO();
        try {
            
            produto_dao.get(produto);
            request.setAttribute("produto", produto);
            RequestDispatcher rd = request.getRequestDispatcher("Produto/Form_Produto_Editar.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
            
            RequestDispatcher rd = request.getRequestDispatcher("Erro.jsp");
            rd.forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        int idCateg = Integer.parseInt(request.getParameter("idCateg"));
        String nome = request.getParameter("nome");
        String descricao = request.getParameter("descricao");
        Float valor = Float.parseFloat(request.getParameter("valor"));
        
        Produto produto = new Produto(id, idCateg, nome, descricao, valor);
        try {
            
            if ((idCateg < 0 || nome.isEmpty() || descricao.isEmpty() || valor < 0)) { 

                if (idCateg < 0) {
                    
                    request.setAttribute("erro_idCateg", "Categoria não pode ser vazia.");
                }
                if (nome.isEmpty()) {
                    
                    request.setAttribute("erro_nome", "Nome não pode ser vazio.");
                }
                if (descricao.isEmpty()) {
                    
                    request.setAttribute("erro_descricao", "Descrição não pode ser vazia.");
                }
                if (valor < 0) {
                    
                    request.setAttribute("erro_valor", "Valor não pode ser vazio.");
                }
                request.setAttribute("produto", produto);
                RequestDispatcher rd = request.getRequestDispatcher("Produto/Form_Produto_Editar.jsp");
                rd.forward(request, response);
                
            } else {
                
                Produto_DAO produto_dao = new Produto_DAO();
                try {
                    
                    produto_dao.Alterar(produto);
                    request.setAttribute("mensagem", "Alterado Com Sucesso");
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
            request.setAttribute("erro_descricao", "Descrição não pode ser vazia.");
            request.setAttribute("erro_valor", "Valor não pode ser vazio.");
            RequestDispatcher rd = request.getRequestDispatcher("Form_Produto.jsp");
            rd.forward(request, response);
        }
    }
}
