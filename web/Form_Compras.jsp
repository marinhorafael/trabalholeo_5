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
        <h1>Incluir Administrador</h1>
        <form action="Incluir_Compras" method="POST">
            
            <% if(request.getAttribute("erro") != null) { %> 
                 <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro"));%></h3>        
            <% }%>
            Cliente:<br>
            <input type="text" name="idCliente" id="idCliente" >
            <br>
            
            <% if(request.getAttribute("erro") != null) { %> 
                 <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro"));%></h3>        
            <% }%>
            Produto:<br>
            <input type="text" name="idProduto" id="idProduto" >
            <br><br>
            <input type="submit" value="Confirmar">
            <a href="ListaCompras">Voltar</a>
        </form> 
    </body>
</html>
