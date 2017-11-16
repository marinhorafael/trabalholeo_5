<%-- 
    Document   : Form_Client_Excluir
    Created on : 09/11/2017, 20:26:30
    Author     : Familia
--%>

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
        <h1>Excluir Cliente</h1>
        <% Cliente client = (Cliente) request.getAttribute("client");%>
        <form action="Excluir_Client" method="Post">

            <input type="hidden" name="id" value="<%=client.getId()%>" >
            <%--nome--%>
            <% if (request.getAttribute("erro_string") != null) { %> 
            <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_string"));%></h3>        
            <% }%>
            <p>Nome:</p>
            <input type="text" name="nome" value="<%=client.getNome()%>" readonly="" >
            <br>     
            <%--endereço--%>
            <% if (request.getAttribute("erro_string") != null) { %> 
            <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_string"));%></h3>        
            <% }%>
            <p>Endereço:</p>
            <input type="text" name="endereco" value="<%=client.getEndereco()%>" readonly="" >
            <br>                        
            <%--bairro--%>
            <% if (request.getAttribute("erro_string") != null) { %> 
            <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_string"));%></h3>        
            <% }%>
            <p>Bairro:</p>
            <input type="text" name="bairro" value="<%=client.getBairro()%>" readonly="" >
            <br>                        
            <%--Cidade--%>
            <% if (request.getAttribute("erro_string") != null) { %> 
            <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_string"));%></h3>        
            <% }%>
            <p>Cidade:</p>
            <input type="text" name="cidade" value="<%=client.getCidade()%>" readonly="" >
            <br>                        
            <%--CEP--%>
            <% if (request.getAttribute("erro_num") != null) { %> 
            <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_string"));%></h3>        
            <% }%>
            <p>CEP:</p>
            <input type="text" name="cep" value="<%=client.getCep()%>" readonly="" >
            <br>                    
            <%--estado--%>
            <% if (request.getAttribute("erro_string") != null) { %> 
            <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_string"));%></h3>        
            <% }%>
            <p>Estado:</p>
            <input type="text" name="estado" value="<%=client.getEstado()%>" readonly="" >
            <%--referencia--%>
            <% if (request.getAttribute("erro_string") != null) { %> 
            <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_string"));%></h3>        
            <% }%>
            <p>Referencia:</p>
            <input type="text" name="referencia" value="<%=client.getReferencia()%>" readonly="" >
            <br>                         
            <%--cpf--%>
            <% if (request.getAttribute("erro_num") != null) { %> 
            <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_string"));%></h3>        
            <% }%>
            <p>CPF:</p>
            <input type="text" name="cpf" value="<%=client.getCpf()%>" readonly="" >
            <br>                    
            <%--identidade--%>
            <% if (request.getAttribute("erro_num") != null) { %> 
            <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_string"));%></h3>        
            <% }%>
            <p>CEP:</p>
            <input type="text" name="cep" value="<%=client.getCep()%>" readonly="" >
            <br>                    
            <%--telFixo--%>
            <% if (request.getAttribute("erro_num") != null) { %> 
            <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_string"));%></h3>        
            <% }%>
            <p>Telefone Fixo</p>
            <input type="text" name="telFixo" value="<%=client.getTelFixo()%>" readonly="" >
            <br>                    
            <%--celular--%>
            <% if (request.getAttribute("erro_num") != null) { %> 
            <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_string"));%></h3>        
            <% }%>
            <p>Celular:</p>
            <input type="text" name="celular" value="<%=client.getCelular()%>" readonly="" >
            <br>                    
            <%--numCCredito--%>
            <% if (request.getAttribute("erro_num") != null) { %> 
            <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_string"));%></h3>        
            <% }%>
            <p>Cartao de Credito(n°)</p>
            <input type="text" name="numCCredito" value="<%=client.getNumCCredito()%>" readonly="" >
            <br>                    
            <%--bandCCredito--%>
            <% if (request.getAttribute("erro_string") != null) { %> 
            <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_string"));%></h3>        
            <% }%>                    
            <p>Bandeira:</p>
            <input name="banCCredito" value="<%=client.getBandCCredito()%>" readonly="">
            <br><br>
            <input type="submit" value="Confirmar">
            <a href="ListaCliente">Voltar</a>
        </form> 
    </body>
</html>
