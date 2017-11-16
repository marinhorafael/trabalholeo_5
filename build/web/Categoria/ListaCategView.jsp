<%-- 
    Document   : ListaCategView
    Created on : 08/11/2017, 12:06:32
    Author     : Familia
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="br.DAO.Categoria.Categoria"%>
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
        <style>

        </style>
    </head>
    <body>
        <h1>Lista de Categorias</h1>
        <a href="Form_Categ.jsp">Incluir Categoria</a>
        <p></p>
        <table>
            <thead>
            <th>id</th>
            <th>Descrição</th>
            <th>Ações</th>
        </thead>
        <%
            ArrayList<Categoria> resultado = (ArrayList) request.getAttribute("minhasCategorias");
            for (int i = 0; i < resultado.size(); i++) {
                Categoria aux = (Categoria) resultado.get(i);
        %>
        <tr>
            <td><%=aux.getId()%></td>
            <td><%=aux.getDescricao()%></td> 
            <td><a href="Visualizar_Categ?id=<%=aux.getId()%>">Visualizar</a> | <a href="Editar_Categ?id=<%=aux.getId()%>">Editar</a> | <a href="Excluir_Categ?id=<%=aux.getId()%>">Excluir</a></td>
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


