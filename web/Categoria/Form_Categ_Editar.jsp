<%@page import="br.DAO.Categoria.Categoria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CRUD em servlet</title>
    </head>
    <body>
        <h1>Lista de Categorias</h1>
        <h1>Alterar Dados da Categoria</h1>
        <% Categoria categ = (Categoria) request.getAttribute("categ");
        %>
        <form action="Editar_Categ" method="POST">

            <input type="hidden" name="id" id="id" value="<%=categ.getId()%>" >

            <% if (request.getAttribute("erro_descricao") != null) { %> 
            <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_descricao"));%></h3>        
            <% }%>
            Descrição:<br>
            <input type="text" name="descricao" id="descricao" value="<%=categ.getDescricao()%>" >
            <br>
            <br>
            <input type="submit" value="Alterar">
            <a href="ListaCategoria">Voltar</a>
        </form> 
    </body>
</html>
