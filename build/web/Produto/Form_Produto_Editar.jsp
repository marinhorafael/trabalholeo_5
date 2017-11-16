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
        <h1>Alterar Dados do Produto</h1>
        <% Produto produto = (Produto) request.getAttribute("produto"); %>
        <form action="Editar_Produto" method="POST">
            
            <input type="hidden" name="id" id="id" value="<%=produto.getId()%>" >
            
            <% if(request.getAttribute("erro_idCateg") != null){ %> 
                 <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_idCateg"));%></h3>     
            <% }%>
            Categoria:<br>
            <input type="text" name="idCateg" id="idCateg" value="<%=produto.getIdCategoria() %>" >
            <br>
            
            <% if(request.getAttribute("erro_nome") != null){ %> 
                <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_nome"));%></h3>       
            <% }%>
            Nome:<br>
            <input type="text" name="nome" id="nome" value="<%=produto.getNome() %>" >
            <br>
            
            <% if(request.getAttribute("erro_descricao") != null){ %>
                <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_descricao"));%></h3>        
            <% }%>
            Descrição:<br>
            <input type="text" name="descricao" id="descricao" value="<%=produto.getDescricao() %>" >
            <br>
            
            <% if(request.getAttribute("erro_valor") != null){ %> 
                <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_valor"));%></h3>        
            <% }%>
            Valor:<br>
            <input type="text" name="valor" id="valor" value="<%=produto.getValor() %>" >
            <br>
            <br>
            <input type="submit" value="Alterar">
            <a href="ListaProduto">Voltar</a>
        </form> 
    </body>
</html>
