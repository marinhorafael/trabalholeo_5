<%-- 
    Document   : Form_Categ
    Created on : 08/11/2017, 11:19:32
    Author     : Familia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-BR">
    <head>
        <title>Área Restrita</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="style.css" type="text/css" />
        <script type="text/javascript" src="script.js"></script>
    </head>
    <body>

        <form class="center" name="cadastro" id="cadastro" action="Incluir_Categ" method="POST">
            <fieldset>
                <legend>Dados Categoria</legend>
                <div>
                    <% if ((request.getAttribute("erro_descricao") != null)
                                || (request.getAttribute("erro_descricao") == "")) { %> 
                    <h5 style="color:Tomato;"><% out.print(request.getAttribute("erro_descricao"));%></h5>        
                    <% }%>   
                    <label>Descrição:</label>
                    <input type="text" class="basic" name="descricao" id="descricao" size="60" </input>
                </div>
                <br>
                <input type="submit" class="black" value="Confirmar" >   
                <br>
                <a href="ListaCategoria">Voltar</a>
            </fieldset> 

        </form>

    </body>
</html>
