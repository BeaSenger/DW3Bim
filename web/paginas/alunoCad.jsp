<%-- 
    Document   : alunoCad
    Created on : 13/09/2018, 10:53:20
    Author     : Asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../Estilos/Cadastros.css" rel="stylesheet" type="text/css"/>
        <title>Auto Escola Nacional</title>
    </head>
    <body>
        <div> <h1> Cadastro Aluno </h1></div>
        <form action="${pageContext.request.contextPath}/cadAluno"> 
            <p> 
                <label for="cpf"> CPF: </label>
                <input type="text" name="cpf" value="" />
                <label for="nome"> Nome: </label>
                <input type="text" name="nome" value="" />
                <label for="data"> Data Nascimento: </label>
                <input type="text" name="data" value="" />
                <label for="rgA"> RG Aluno: </label>
                <input type="text" name="rgA" value="" />
                <label for="rgEmissor"> Orgao Emissor: </label>
                <input type="text" name="rgEmissor" value="" />
                <label for="endereco"> Endereço: </label>
                <input type="text" name="endereco" value="" />
                <label for="cidade"> Cidade: </label>
                <input type="text" name="cidade" value="" />
                <label for="bairro"> Bairro: </label>
                <input type="text" name="bairro" value="" />
                <label for="cep"> CEP: </label>
                <input type="text" name="cep" value="" />
                <label for="tel"> Telefone: </label>
                <input type="text" name="tel" value="" />
                <label for="cel"> Celular: </label>
                <input type="text" name="cel" value="" />
                <label for="habilitacao"> Habilitação: </label>
                <input type="text" name="habilitacao" value="" />
                
                <input type="submit" value="Enviar" />
            </p>
        </form>
    </body>
</html>
