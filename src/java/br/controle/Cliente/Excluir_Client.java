
package br.controle.Cliente;

import br.DAO.Cliente.Cliente;
import br.DAO.Cliente.Cliente_DAO;
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
 * @author Familia
 */
@WebServlet(name = "Excluir_Client", urlPatterns = {"/Excluir_Client"})
public class Excluir_Client extends HttpServlet {

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        Cliente client = new Cliente(id);
        Cliente_DAO cliente_dao = new Cliente_DAO();
        try {
            cliente_dao.get(client);
            request.setAttribute("client", client);

            RequestDispatcher rd = request.getRequestDispatcher("Cliente/Form_Client_Excluir.jsp");
            rd.forward(request, response);

        } catch (Exception e) {
            RequestDispatcher rd = request.getRequestDispatcher("Erro.jsp");
            rd.forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        Cliente client = new Cliente(id);
        try {
                Cliente_DAO cliente_dao = new Cliente_DAO();
                try {
                    cliente_dao.Excluir(client);
                    request.setAttribute("mensagem", "Exclusão Com Sucesso");
                    request.setAttribute("retorna", "ListaCliente");
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