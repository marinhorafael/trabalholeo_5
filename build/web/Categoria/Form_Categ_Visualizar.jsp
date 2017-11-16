<%-- 
    Document   : Form_Categ_Visualizar
    Created on : 08/11/2017, 11:52:34
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
        <h1>Dados da Categoria</h1>
        <% Categoria categ = (Categoria) request.getAttribute("categ");
        %>
        <form action="ListaCategoria" method="GET">

            <input type="hidden" name="id" id="id" value="<%=categ.getId()%>" >

            <% if (request.getAttribute("erro_descricao") != null) { %> 
            <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_descricao"));%></h3>        
            <% }%>
            Descrição:<br>
            <input type="text" name="descricao" id="descricao" value="<%=categ.getDescricao()%>" readonly="true" >
            <br><br>
            <a href="ListaCategoria">Voltar</a>
        </form> 
    </body>
</html>
