<%-- 
    Document   : professorCad
    Created on : 05/07/2018, 16:54:15
    Author     : Asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../Estilos/Cadastros.css" rel="stylesheet" type="text/css"/>
        <title> Auto Escola Nacional </title>
    </head>
    <body>
        <div> <h1> Cadastro Instrutor </h1></div>
        <form action="${pageContext.request.contextPath}/cadProfessor"> 
            <p> 
                <label for="cpf"> CPF: </label>
                <input type="text" name="cpf" value="" />
                <label for="nome"> Nome: </label>
                <input type="text" name="nome" value="" />
                <label for="habilitacao"> Habilitação: </label>
                <input type="text" name="habilitacao" value="" />
                <input type="submit" value="Enviar" />
            </p>
            
        
        </form>
    </body>
</html>
