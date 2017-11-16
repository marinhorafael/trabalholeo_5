<%@page import="br.DAO.Cliente.Cliente"%>
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
        <h1>Lista de Clientes</h1>
        <h1>Dados da Cliente</h1>
        <% Cliente client = (Cliente) request.getAttribute("client"); 
        %>
        <form action="ListaCliente" method="GET">
            
            <input type="hidden" name="id" value="<%=client.getId()%>" >
            
            <%--nome--%>
            <% if(request.getAttribute("erro_string") != null){ %> 
                 <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_string"));%></h3>        
            <% }%>
            Nome:<br>
            <input type="text" name="nome" value="<%=client.getNome() %>" readonly="true" >
            <br>
            <%--endereço--%>
            <% if(request.getAttribute("erro_string") != null){ %> 
                 <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_string"));%></h3>        
            <% }%>
            Endereco:<br>
            <input type="text" name="endereco" value="<%=client.getEndereco() %>" readonly="true" >
            <br>
            <%--bairro--%>
            <% if(request.getAttribute("erro_string") != null){ %> 
                 <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_string"));%></h3>        
            <% }%>
            Bairro:<br>
            <input type="text" name="bairro" value="<%=client.getBairro() %>" readonly="true" >
            <br>
            <%--cidade--%>
            <% if(request.getAttribute("erro_string") != null){ %> 
                 <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_string"));%></h3>        
            <% }%>
            Cidade:<br>
            <input type="text" name="cidade" value="<%=client.getCidade() %>" readonly="true" >
            <br>
            <%--cep--%>
            <% if(request.getAttribute("erro_num") != null){ %> 
                 <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_num"));%></h3>        
            <% }%>
            CEP:<br>
            <input type="text" name="cep" value="<%=client.getCep()%>" readonly="true" >
            <br>
            <%--estado--%>
            <% if(request.getAttribute("erro_string") != null){ %> 
                 <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_string"));%></h3>        
            <% }%>
            Estado(UF):<br>
            <input type="text" name="estado" value="<%=client.getEstado() %>" readonly="true" >
            <br>
            <%--referencia--%>
            <% if(request.getAttribute("erro_string") != null){ %> 
                 <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_string"));%></h3>        
            <% }%>
            Referencia:<br>
            <input type="text" name="referencia" value="<%=client.getReferencia() %>" readonly="true" >
            <br>
            <%--cpf--%>
            <% if(request.getAttribute("erro_num") != null){ %> 
                 <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_num"));%></h3>        
            <% }%>
            CPF:<br>
            <input type="text" name="cpf" value="<%=client.getCpf()%>" readonly="true" >
            <br>
            <%--identidade--%>
            <% if(request.getAttribute("erro_num") != null){ %> 
                 <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_num"));%></h3>        
            <% }%>
            RG(identidade):<br>
            <input type="text" name="identidade" value="<%=client.getIdentidade()%>" readonly="true" >
            <br>
            <%--Telefone--%>
            <% if(request.getAttribute("erro_num") != null){ %> 
                 <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_num"));%></h3>        
            <% }%>
            Telefone Fixo:<br>
            <input type="text" name="telFixo" value="<%=client.getTelFixo()%>" readonly="true" >
            <br>
            <%--celular--%>
            <% if(request.getAttribute("erro_num") != null){ %> 
                 <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_num"));%></h3>        
            <% }%>
            Celular:<br>
            <input type="text" name="celular" value="<%=client.getCelular()%>" readonly="true" >
            <br>
            <%--n° CC--%>
            <% if(request.getAttribute("erro_num") != null){ %> 
                 <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_num"));%></h3>        
            <% }%>
            Numero do Cartao de Credito:<br>
            <input type="text" name="numCCredito" value="<%=client.getNumCCredito()%>" readonly="true" >
            <br>
            <%--Band CC--%>
            <% if(request.getAttribute("erro_string") != null){ %> 
                 <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_string"));%></h3>        
            <% }%>
            Bandeira do Cartão de crédito<br>
            <input type="text" name="bandCCredito" value="<%=client.getBandCCredito() %>" readonly="true" >
            <br><br>
                        
            <a href="ListaCliente">Voltar</a>
        </form> 
    </body>
</html>

