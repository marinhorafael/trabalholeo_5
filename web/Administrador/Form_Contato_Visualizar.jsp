<%@page import="br.DAO.Administrador.Administrador"%>
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
        
        <h1>Lista de Administradores</h1>
        <h1>Dados do Administrador</h1>
        <% Administrador admin = (Administrador) request.getAttribute("admin");%>
        <form action="ListaContato" method="GET">

            <input type="hidden" name="id" id="id" value="<%=admin.getId()%>" >

            Login:<br>
            <input type="text" name="login" id="login" value="<%=admin.getLogin()%>" readonly="true" >
            <br>

            Senha:<br>
            <input type="text" name="senha" id="senha" value="<%=admin.getSenha()%>" readonly="true" >
            <br><br>

            <a href="ListaContato">Voltar</a> 
        </form> 
    </body>
</html>
