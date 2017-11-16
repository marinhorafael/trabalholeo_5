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
        <h1>Incluir Administrador</h1>
        <form action="Incluir" method="POST">
            <% if((request.getAttribute("erro_login") != null)|| (request.getAttribute("erro_login") == "")) { %> 
                 <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_login"));%></h3>        
            <% }%>
            Login:<br>
            <input type="text" name="login" >
            <br>
            <% if((request.getAttribute("erro_senha") != null)|| (request.getAttribute("erro_senha") == "")) { %> 
                 <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_senha"));%></h3>        
            <% }%>
            Senha:<br>
            <input type="text" name="senha" >
            <br>
            <br>
            <input type="submit" value="Confirmar">
            <a href="ListaContato">Voltar</a>
        </form> 
    </body>
</html>
