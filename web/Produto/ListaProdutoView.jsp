<%-- 
    Document   : ListaCategView
    Created on : 08/11/2017, 12:06:32
    Author     : Familia
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="br.DAO.produto.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Área Restrita</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="style.css" type="text/css" />
        <script type="text/javascript" src="script.js"></script>
    </head>
    <body>
        <h1>Lista de Produtos</h1>
        <a href="Form_Produto.jsp">Incluir Produto</a>
        <p></p>
        <table>
            <thead>
            <th>id</th>
            <th>Categoria</th>
            <th>Nome</th>
            <th>Descrição</th>
            <th>Valor</th>
            <th>Ações</th>
        </thead>
        <%
            ArrayList<Produto> resultado = (ArrayList) request.getAttribute("meusProdutos");
            for (int i = 0; i < resultado.size(); i++) {
                Produto aux = (Produto) resultado.get(i);
        %>
        <tr>
            <td><%=aux.getId()%></td>
            <td><%=aux.getIdCategoria()%></td> 
            <td><%=aux.getNome()%></td> 
            <td><%=aux.getDescricao()%></td> 
            <td><%=aux.getValor()%></td> 
            <td><a href="Visualizar_Produto?id=<%=aux.getId()%>">Visualizar</a> | <a href="Editar_Produto?id=<%=aux.getId()%>">Editar</a> | <a href="Excluir_Produto?id=<%=aux.getId()%>">Excluir</a></td>
        </tr>
        <%
            }
        %>

    </table>
    <br>
    <br>
    <a href="index.html">Voltar</a>   

</body>
</html>


