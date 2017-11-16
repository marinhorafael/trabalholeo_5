<%@page import="java.util.ArrayList"%>
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
        <a href="Form_Compras.jsp">Incluir Compras</a>
        <p></p>
        <table>
            <thead>
            <th>id</th>
            <th>Cliente</th>
            <th>Produto</th>
            <th>Ações</th>
        </thead>
        <%
            ArrayList<Compras> resultado = (ArrayList) request.getAttribute("minhasCompras");
            for (int i = 0; i < resultado.size(); i++) {
                Compras aux = (Compras)resultado.get(i);
        %>
        <tr>
        <td><%=aux.getId()%></td>
        <td><%=aux.getIdCliente()%></td> 
        <td><%=aux.getIdProduto()%></td>
        <td><a href="Visualizar_Compras?id=<%=aux.getId()%>">Visualizar</a> | <a href="Editar_Compras?id=<%=aux.getId()%>">Editar</a> | <a href="Excluir_Compras?id=<%=aux.getId()%>">Excluir</a></td>
        </tr>
        <%
            }
        %>

        </table>
        <br>
        <br>
        <a href="index.html"> Voltar</a>

</body>
</html>

