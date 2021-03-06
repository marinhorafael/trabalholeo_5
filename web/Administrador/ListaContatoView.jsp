<%@page import="java.util.ArrayList"%>
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
        <a href="Form_Administrador.jsp">Incluir Administrador</a>
        <p></p>
        <table>
            <thead>
            <th>id</th>
            <th>Login</th>
            <th>Senha</th>
            <th>Ações</th>
        </thead>
        <%
            ArrayList<Administrador> resultado = (ArrayList) request.getAttribute("meusContatos");
            for (int i = 0; i < resultado.size(); i++) {
                Administrador aux = (Administrador) resultado.get(i);
        %>
        <tr>
            <td><%=aux.getId()%></td>
            <td><%=aux.getLogin()%></td> 
            <td><%=aux.getSenha()%></td>
            <td><a href="Visualizar?id=<%=aux.getId()%>">Visualizar</a> | <a href="Editar?id=<%=aux.getId()%>">Editar</a> | <a href="Excluir?id=<%=aux.getId()%>">Excluir</a></td>
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

