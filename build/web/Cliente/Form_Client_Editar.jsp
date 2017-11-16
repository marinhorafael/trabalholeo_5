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
        <h1>Alterar Dados do Cliente</h1>
        <% Cliente client = (Cliente) request.getAttribute("client");
        %>
        <form action="Editar_Client" method="POST">

            <input type="hidden" name="id" id ="id" value="<%=client.getId()%>" >

            <%--nome--%>
            <% if (request.getAttribute("erro_nome") != null) { %> 
            <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_nome"));%></h3>        
            <% }%>
            <p>Nome:</p>
            <input type="text" name="nome" id="nome" value="<%=client.getNome()%>" >
            <br>     

            <%--identidade--%>
            <% if (request.getAttribute("erro_identidade") != null) { %> 
            <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_identidade"));%></h3>        
            <% }%>
            <p>Identidade:</p>
            <input type="text" name="identidade" id="identidade" value="<%=client.getIdentidade()%>" >
            <br>                    

            <%--cpf--%>
            <% if (request.getAttribute("erro_cpf") != null) { %> 
            <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_cpf"));%></h3>        
            <% }%>
            <p>CPF:</p>
            <input type="text" name="cpf" id="cpf" value="<%=client.getCpf()%>" >
            <br>  

            <%--estado--%>
            <% if (request.getAttribute("erro_estado") != null) { %> 
            <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_estado"));%></h3>        
            <% }%>
            <p>Estado:</p>
            <input type="text" name="estado" id="estado" value="<%=client.getEstado()%>" >

            <%--Cidade--%>
            <% if (request.getAttribute("erro_cidade") != null) { %> 
            <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_cidade"));%></h3>        
            <% }%>
            <p>Cidade:</p>
            <input type="text" name="cidade" id="cidade" value="<%=client.getCidade()%>" >
            <br>  

            <%--bairro--%>
            <% if (request.getAttribute("erro_bairro") != null) { %> 
            <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_bairro"));%></h3>        
            <% }%>
            <p>Bairro:</p>
            <input type="text" name="bairro" id="bairro" value="<%=client.getBairro()%>" >
            <br>  

            <%--CEP--%>
            <% if (request.getAttribute("erro_cep") != null) { %> 
            <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_cep"));%></h3>        
            <% }%>
            <p>CEP:</p>
            <input type="text" name="cep" id="cep" value="<%=client.getCep()%>" >
            <br>    

            <%--endereço--%>
            <% if (request.getAttribute("erro_endereco") != null) { %> 
            <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_endereco"));%></h3>        
            <% }%>
            <p>Endereço:</p>
            <input type="text" name="endereco" id="endereco" value="<%=client.getEndereco()%>" >
            <br>  

            <%--referencia--%>     
            <p>Referencia:</p>
            <input type="text" name="referencia" id="referencia" value="<%=client.getReferencia()%>" >
            <br>    

            <%--telFixo--%>
            <% if (request.getAttribute("erro_telFixo") != null) { %> 
            <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_telFixo"));%></h3>        
            <% }%>
            <p>Telefone Fixo</p>
            <input type="text" name="telFixo" id="telFixo" value="<%=client.getTelFixo()%>" >
            <br>       

            <%--celular--%>
            <% if (request.getAttribute("erro_celular") != null) { %> 
            <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_celular"));%></h3>        
            <% }%>
            <p>Celular:</p>
            <input type="text" name="celular" id="celular" value="<%=client.getCelular()%>" >
            <br>         

            <%--numCCredito--%>
            <% if (request.getAttribute("erro_numCCredito") != null) { %> 
            <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_numCCredito"));%></h3>        
            <% }%>
            <p>Cartao de Credito(n°)</p>
            <input type="text" name="numCCredito" id="numCCredito" value="<%=client.getNumCCredito()%>" >
            <br>       

            <%--bandCCredito--%>
            <% if (request.getAttribute("erro_bandCCredito") != null) { %> 
            <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_bandCCredito"));%></h3>        
            <% }%>                    
            <p>Bandeira:</p>
            <input name="banCCredito" id="banCCredito" value="<%=client.getBandCCredito()%>">

            <br><br>
            <input type="submit" value="Alterar">
            <a href="ListaCliente">Voltar</a>
        </form> 
    </body>
</html>
