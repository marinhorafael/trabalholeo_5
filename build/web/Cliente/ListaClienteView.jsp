<%@page import="java.util.ArrayList"%>
<%@page import="br.DAO.Cliente.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Área Restrita</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="style.css" type="text/css" />
        <script type="text/javascript" src="script.js"></script>

           
    </head>
    <body>
        <h1>Lista de Clientes</h1>
        <a href="Form_Client.jsp">Incluir Cliente</a>
        <p></p>
        <table>
            <thead>
            <th>id</th>
            <th>Nome</th>
            <th>RG(identidade)</th>
            <th>CPF</th>
            <th>Estado(UF)</th>
            <th>Cidade</th>
            <th>Bairro</th>
            <th>CEP</th>
            <th>Endereço</th>
            <th>Referência</th>
            <th>Telefone</th>
            <th>Celular</th>
            <th>Cartão de Crédito</th>
            <th>Bandeira</th>

        </thead>

        <%
            ArrayList<Cliente> resultado = (ArrayList) request.getAttribute("meusClientes");
            for (int i = 0; i < resultado.size(); i++) {
                Cliente aux = (Cliente) resultado.get(i);
        %>

        <tr>
            <td><%=aux.getId()%></td>
            <td><%=aux.getNome()%></td>
            <td><%=aux.getIdentidade()%></td>
            <td><%=aux.getCpf()%></td>
            <td><%=aux.getEstado()%></td>
            <td><%=aux.getCidade()%></td> 
            <td><%=aux.getBairro()%></td>
            <td><%=aux.getCep()%></td>
            <td><%=aux.getEndereco()%></td>
            <td><%=aux.getReferencia()%></td> 
            <td><%=aux.getTelFixo()%></td>
            <td><%=aux.getCelular()%></td>
            <td><%=aux.getNumCCredito()%></td> 
            <td><%=aux.getBandCCredito()%></td>  
            <td><a href="Visualizar_Client?id=<%=aux.getId()%>">Visualizar</a> | <a href="Editar_Client?id=<%=aux.getId()%>">Editar</a> | <a href="Excluir_Client?id=<%=aux.getId()%>">Excluir</a></td>
        </tr>

        <%}%>

    </table>
    <br>
    <br>
    <a href="index.html">Voltar</a>    
</body>
</html>
