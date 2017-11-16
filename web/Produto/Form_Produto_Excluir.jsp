<%-- 
    Document   : Form_Categ_Excluir
    Created on : 08/11/2017, 11:38:15
    Author     : Familia
--%>

<%@page import="br.DAO.produto.Produto"%>
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
        <h1>Lista de Produtos</h1>
        <h1>Excluir Produto</h1>
        <% Produto produto = (Produto) request.getAttribute("produto");%>
        <form action="Excluir_Produto" method="Post">

            <input type="hidden" name="id" value="<%=produto.getId()%>" >

            <% if (request.getAttribute("erro") != null) { %> <!--  verificar depois-->
            <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro"));%></h3><!--  verificar depois-->        
            <% }%>
            Categoria:<br>
            <input type="text" name="idCateg" value="<%=produto.getIdCategoria()%>" readonly="" >
            <br>
            <% if (request.getAttribute("erro") != null) { %> <!--  verificar depois-->
            <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro"));%></h3><!--  verificar depois-->        
            <% }%>
            Nome:<br>
            <input type="text" name="nome" value="<%=produto.getNome()%>" readonly="" >
            <br>
            <% if (request.getAttribute("erro") != null) { %> <!--  verificar depois-->
            <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro"));%></h3><!--  verificar depois-->        
            <% }%>
            Descrição:<br>
            <input type="text" name="descricao" value="<%=produto.getDescricao()%>" readonly="">
            <br>
            <% if (request.getAttribute("erro") != null) { %> <!--  verificar depois-->
            <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro"));%></h3><!--  verificar depois-->        
            <% }%>
            Valor:<br>
            <input type="text" name="valor" value="<%=produto.getValor()%>" readonly="" >
            <br><br>
            <input type="submit" value="Confirmar">
            <a href="ListaProduto">Voltar</a>
        </form> 
    </body>
</html>
