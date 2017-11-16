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
        <h1>Excluir Compras</h1>
        <% Compras compras = (Compras) request.getAttribute("compras"); %>
        <form action="Excluir_Compras" method="Post">
            
            <input type="hidden" name="id" id="id" value="<%=compras.getId()%>" >

            Cliente:<br>
            <input type="text" name="idCliente" id="idCliente" value="<%=compras.getIdCliente() %>" readonly="" >
            <br>

            Produto:<br>
            <input type="text" name="idProduto" id="idProduto" value="<%=compras.getIdProduto()%>" readonly="" >
            <br><br>
            
            <input type="submit" value="Confirmar">
            <a href="ListaCompras">Voltar</a>
        </form> 
    </body>
</html>
