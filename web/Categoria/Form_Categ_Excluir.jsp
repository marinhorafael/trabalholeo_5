<%-- 
    Document   : Form_Categ_Excluir
    Created on : 08/11/2017, 11:38:15
    Author     : Familia
--%>

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
    </head>
    <body>
        <h1>Lista de Categorias</h1>
        <h1>Excluir Categoria</h1>
        <% Categoria categ = (Categoria) request.getAttribute("categ");
        %>
        <form action="Excluir_Categ" method="Post">

            <input type="hidden" name="id" id="id" value="<%=categ.getId()%>" >

            <% if (request.getAttribute("erro_descricao") != null) { %> 
            <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_descricao"));%></h3>        
            <% }%>
            Descrição:<br>
            <input type="text" name="decricao" id="descricao" value="<%=categ.getDescricao()%>" readonly="" >
            <br><br>
            <input type="submit" value="Confirmar">
            <a href="ListaCategoria">Voltar</a>
        </form> 
    </body>
</html>
