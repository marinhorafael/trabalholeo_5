<%@page import="br.DAO.Compras.Compras_DAO"%>
<%@page import="br.DAO.Compras.Compras"%>

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
        <h1>Lista de Compras</h1>
        <h1>Alterar Dados da Compra</h1>
        <% Compras compras = (Compras) request.getAttribute("compras"); 
        %>
        <form action="Editar_Compras" method="POST">
            
            <input type="hidden" name="id" id="id" value="<%=compras.getId()%>" >
            
            <% if(request.getAttribute("erro") != null){ %> 
                 <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro"));%></h3>        
            <% }%>
            Cliente:<br>
            <input type="text" name="idCliente" id="idCliente" value="<%=compras.getIdCliente() %>" >
            <br>
            <% if(request.getAttribute("erro") != null){ %> 
                 <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro"));%></h3>        
            <% }%>
            Produto:<br>
            <input type="text" name="idProduto" id ="idProduto" value="<%=compras.getIdProduto()%>" >
            <br><br>
            <input type="submit" value="Alterar">
            <a href="ListaCompras">Voltar</a>
        </form> 
    </body>
</html>
