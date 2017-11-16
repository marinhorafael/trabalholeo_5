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

        <h1>Dados do Cliente</h1>
        <form name="inserecliente" id="inserecliente" action="Incluir_Client" onsubmit="return valida()" method="POST">
            <%--nome--%>
            <% if ((request.getAttribute("erro_nome") != null)
                        || (request.getAttribute("erro_nome") == "")) { %> 
            <h5 style="color:Tomato;"><% out.print(request.getAttribute("erro_nome"));%></h5>        
            <% }%>
            Nome:<br>
            <input type="text" name="nome" id="nome" placeholder="Inserir Nome">
            <br>

            <%--identidade--%>
            <% if (request.getAttribute("erro_identidade") != null) { %> 
            <h5 style="color:Tomato;"><% out.print(request.getAttribute("erro_identidade"));%></h5>        
            <% }%>
            RG:<br>
            <input type="text" name="identidade" id="identidade" placeholder="Inserir nº RG"/>
            <br>
            
            <%--cpf--%>
            <% if (request.getAttribute("erro_cpf") != null) { %> 
            <h5 style="color:Tomato;"><% out.print(request.getAttribute("erro_cpf"));%></h5>        
            <% }%>
            CPF:<br>
            <input type="text" name="cpf" id="cpf" maxlength="14" pattern="^d{3}\.\d{3}\.\d{3}\-\d{2}" title="Digite o CPF no formato nnn.nnn.nnn-nn(apenas números)" type="text"></input>
            <br>

            <%--estado--%>
            <% if ((request.getAttribute("erro_estado") != null)
                        || (request.getAttribute("erro_estado") == "")) { %> 
            <h5 style="color:Tomato;"><% out.print(request.getAttribute("erro_estado"));%></h5>        
            <% }%>
            Estado:<br>
            <input type="text" name="estado" id="estado" placeholder="Estado(UF)">     
            <br>			

            <%--Cidade--%>
            <% if ((request.getAttribute("erro_cidade") != null)
                        || (request.getAttribute("erro_cidade") == "")) { %> 
            <h5 style="color:Tomato;"><% out.print(request.getAttribute("erro_cidade"));%></h5>        
            <% }%>
            Cidade:<br>
            <input type="text" name= "cidade" id="cidade" placeholder="Inserir Cidade">
            <br>

            <%--bairro--%>
            <% if ((request.getAttribute("erro_bairro") != null)
                        || (request.getAttribute("erro_bairro") == "")) { %> 
            <h5 style="color:Tomato;"><% out.print(request.getAttribute("erro_bairro"));%></h5>        
            <% }%>
            Bairro:<br>
            <input type="text" name="bairro" id="bairro" placeholder="Inserir Bairro">
            <br>

            <%--CEP--%>
            <% if (request.getAttribute("erro_cep") != null) { %> 
            <h5 style="color:Tomato;"><% out.print(request.getAttribute("erro_cep"));%></h5>        
            <% }%>
            CEP:<br>
            <input type="text" name="cep" id="cep" placeholder="Inserir CEP"> 
            <br>			

            <%--endereço--%>
            <% if ((request.getAttribute("erro_endereco") != null)
                        || (request.getAttribute("erro_endereco") == "")) { %> 
            <h5 style="color:Tomato;"><% out.print(request.getAttribute("erro_endereco"));%></h5>        
            <% }%>
            Endereço:<br>
            <input type="text" name="endereco" id="endereco" placeholder="Inserir Endereço" >
            <br>

            <%--referencia--%>
            Referência:<br>
            <input type="text" name="referencia" id="referencia" placeholder="Inserir Referência">  
            <br>

            <%--telFixo--%>
            <% if (request.getAttribute("erro_telFixo") != null) { %> 
            <h5 style="color:Tomato;"><% out.print(request.getAttribute("erro_telFixo"));%></h5>        
            <% }%>
            Telefone Fixo:<br>
            <input type="text" name="telFixo" id="telFixo" placeholder="Inserir Telefone">
            <br>

            <%--celular--%>
            <% if (request.getAttribute("erro_celular") != null) { %> 
            <h5 style="color:Tomato;"><% out.print(request.getAttribute("erro_celular"));%></h5>        
            <% }%>        
            Celular:<br>
            <input type="text" name="celular" id="celular" placeholder="Inserir Celular" >
            <br>

            <%--numCCredito--%>
            <% if (request.getAttribute("erro_numCCredito") != null) { %> 
            <h5 style="color:Tomato;"><% out.print(request.getAttribute("erro_numCCredito"));%></h5>        
            <% }%>    
            Nº Cartão Crédito:<br>
            <input type="text" name="numCCredito" id="numCCredito" placeholder="Inserir Nº Cartão">
            <br>

            <%--bandCCredito--%>
            <% if ((request.getAttribute("erro_bandCCredito") != null)
                        || (request.getAttribute("erro_bandCCredito") == "")) { %> 
            <h5 style="color:Tomato;"><% out.print(request.getAttribute("erro_bandCCredito"));%></h5>        
            <% }%>
            Bandeira:<br>
            <input name="bandCCredito" id="bandCCredito" placeholder="Inserir bandeira do Cartão">					
            <br>
            <br>

            <input type="submit" value="Confirmar">
            <a href="ListaCliente"> Voltar </a>
        </form>


    </body>
</html>