<%-- 
    Document   : professorCad
    Created on : 25/10/2018, 20:24:59
    Author     : Asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../Estilos/Cadastros.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>

        <div> <h1> Cadastro Professor </h1></div>
        <form action="${pageContext.request.contextPath}/cadProfessor"> 
            <p> 
                <label for="cpf"> CPF Professor: </label>
                <input type="text" name="cpf_professor"/>
                
                <label for="nome"> Nome: </label>
                <input type="text" name="nome_professor"/>
                
                <label for="habi"> Habitlitação: </label>
                <input type="text" name="habilitacao"/>
               
                <input type="submit" value="Enviar" />
                
    </body>
</html>

