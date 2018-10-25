<%-- 
    Document   : tipoCarteiraCad
    Created on : 24/10/2018, 15:54:49
    Author     : Asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../Estilos/Cadastros.css" rel="stylesheet" type="text/css"/> 
        <title>Cadastro Tipo Carteira</title>
    </head>
    <body>
        <div> <h1> Cadastro Tipo Carteira </h1></div>
        <form action="${pageContext.request.contextPath}/cadTipoCarteira"> 
        <p> 
            <!--<label for="id"> ID: </label>
            <input type="text" name="id_tipo_carteira"/>-->
            <label for="nome"> Nome: </label>
            <input type="text" name="nome_tipo_carteira"/>
            <input type="submit" value="Enviar" />
        </p>

    </body>
</html>
