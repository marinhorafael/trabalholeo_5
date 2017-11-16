/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
@WebServlet(name = "Incluir_Client", urlPatterns = {"/Incluir_Client"})
public class Incluir_Client extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nome = request.getParameter("nome");
        String identidade = request.getParameter("identidade");
        String cpf = request.getParameter("cpf");
        String estado = request.getParameter("estado");
        String cidade = request.getParameter("cidade");
        String bairro = request.getParameter("bairro");
        String cep = request.getParameter("cep");
        String endereco = request.getParameter("endereco");
        String referencia = request.getParameter("referencia");
        String telFixo = request.getParameter("telFixo");
        String celular = request.getParameter("celular");
        String numCCredito = request.getParameter("numCCredito");
        String bandCCredito = request.getParameter("bandCCredito");
        try {
            // pegando os parâmetros do request

            if ((nome.isEmpty()) || (endereco.isEmpty()) || (bairro.isEmpty()) || (cidade.isEmpty())
                    || (cep.isEmpty()) || (estado.isEmpty()) || (cpf.isEmpty()) || (identidade.isEmpty())
                    || (telFixo.isEmpty()) || (celular.isEmpty()) || (numCCredito.isEmpty()) || (bandCCredito.isEmpty())) {

                if (nome.isEmpty()) {

                    request.setAttribute("erro_nome", "Nome não pode ser vazio.");
                }
                if (endereco.isEmpty()) {

                    request.setAttribute("erro_endereco", "Endereço não pode ser vazio.");
                }
                if (bairro.isEmpty()) {

                    request.setAttribute("erro_bairro", "Bairro não pode ser vazio.");
                }
                if (cidade.isEmpty()) {

                    request.setAttribute("erro_cidade", "Cidade não pode ser vazio.");
                }
                if (estado.isEmpty()) {

                    request.setAttribute("erro_estado", "Estado não pode ser vazio.");
                }
                if (bandCCredito.isEmpty()) {

                    request.setAttribute("erro_bandCCredito", "Banda Cartão Crédito não pode ser vazio");
                }
                if (cep.isEmpty()) {

                    request.setAttribute("erro_cep", "CEP não pode ser menor que 0.");
                }
                if (cpf.isEmpty()) {

                    request.setAttribute("erro_cpf", "CPF campo não pode ser menor que 0.");
                }
                if (identidade.isEmpty()) {

                    request.setAttribute("erro_identidade", "RG não pode ser menor que 0.");
                }
                if (telFixo.isEmpty()) {

                    request.setAttribute("erro_telFixo", "o campo não pode ser menor que 0");
                }
                if (celular.isEmpty()) {

                    request.setAttribute("erro_celular", "Celular não pode ser menor que 0.");
                }
                if (numCCredito.isEmpty()) {

                    request.setAttribute("erro_numCCredito", "Número Cartão Crédito não pode ser menor que 0");
                }
            } else {

                Cliente client = new Cliente(nome,identidade,cpf,estado,cidade,bairro,cep,endereco,referencia,telFixo,celular,numCCredito,bandCCredito);
                Cliente_DAO cliente_dao = new Cliente_DAO();
                try {

                    cliente_dao.Inserir(client);
                    request.setAttribute("mensagem", "Inclusão Com Sucesso");
                    request.setAttribute("retorna", "ListaCliente");
                    RequestDispatcher rd = request.getRequestDispatcher("Resposta.jsp");
                    rd.forward(request, response);
                } catch (Exception e) {

                    RequestDispatcher rd = request.getRequestDispatcher("Erro.jsp");
                    rd.forward(request, response);
                }
            }
        } catch (Exception e) {

            request.setAttribute("erro_nome", "Nome não pode ser vazio.");
            request.setAttribute("erro_endereco", "Endereço não pode ser vazio.");
            request.setAttribute("erro_bairro", "Bairro não pode ser vazio.");
            request.setAttribute("erro_cidade", "Cidade não pode ser vazio.");
            request.setAttribute("erro_bandCCredito", "Banda Cartão Crédito não pode ser vazio");
            request.setAttribute("erro_cep", "CEP não pode ser menor que 0.");
            request.setAttribute("erro_cpf", "CPF campo não pode ser menor que 0.");
            request.setAttribute("erro_identidade", "RG não pode ser menor que 0.");
            request.setAttribute("erro_telFixo", "o campo não pode ser menor que 0");
            request.setAttribute("erro_celular", "Celular não pode ser menor que 0.");
            request.setAttribute("erro_numCCredito", "Número Cartão Crédito não pode ser menor que 0");
            request.setAttribute("erro_estado", "Estado não pode ser vazio.");
            RequestDispatcher rd = request.getRequestDispatcher("Form_Client.jsp");
            rd.forward(request, response);
        }
    }

}
