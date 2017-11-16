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
        <h1>Incluir Produto</h1>
        <form action="Incluir_Produto" method="POST">
            
            <%  if((request.getAttribute("erro") != null) || (request.getAttribute("erro") == "")){ %> 
                    <h5 style="color:Tomato;"><% out.print(request.getAttribute("erro"));%></h5>        
            <%  }%>
            Categoria:<br>
            <input type="text" name="idCateg" id="idCateg">
            <br>                               
                                
            <%  if((request.getAttribute("erro") != null) || (request.getAttribute("erro") == "")) { %> 
                    <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro"));%></h3>        
            <%  }%>
            Nome:<br>
            <input type="text" name="nome" id="nome">
            <br>
            
            <%  if(request.getAttribute("erro") != null) { %> 
                    <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro"));%></h3>        
            <%  }%>
            Descricao:<br>
            <input type="text" name="descricao" id="descricao">
            <br>
            <%  if(request.getAttribute("erro") != null) { %> 
                    <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro"));%></h3>        
            <%  }%>
            Valor:<br>
            <input type="text" name="valor" id="valor">
                
            <br><br>
            <input type="submit" value="Confirmar">
            <a href="ListaProduto">Voltar</a>
        </form> 
    </body>
</html>
