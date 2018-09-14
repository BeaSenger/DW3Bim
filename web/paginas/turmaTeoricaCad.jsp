<%-- 
    Document   : turmaTeoricaCad
    Created on : 13/09/2018, 11:27:30
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
        <div> <h1> Cadastro Turma Teorica </h1></div>
        <form action="${pageContext.request.contextPath}/cadProfessor"> 
            <p> 
                <label for="codigo"> Codigo: </label>
                <input type="text" name="codigo" value="" />
                <label for="periodo"> Período: </label>
                <input type="text" name="periodo" value="" />
                <label for="data"> Data: </label>
                <input type="text" name="data" value="" />
                <label for="cpfProf"> CPF Prof: </label>
                <input type="text" name="cpfProf" value="" />
                <label for="qtdeHoras"> qtde. Horas: </label>
                <input type="text" name="qtdeHoras" value="" />
                <input type="submit" value="Enviar" />
            </p>
    </body>
</html>
