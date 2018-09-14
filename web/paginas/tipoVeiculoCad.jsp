<%-- 
    Document   : tipoVeiculoXCad
    Created on : 13/09/2018, 11:37:50
    Author     : Asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../Estilos/Cadastros.css" rel="stylesheet" type="text/css"/> 
        <title>Cadastro Tipo Veiculo</title>
    </head>
    <body>
        <div> <h1> Cadastro Tipo Veiculo </h1></div>
        <form action="${pageContext.request.contextPath}/cadTipoVeiculo"> 
        <p> 
            <label for="id"> ID: </label>
            <input type="text" name="id_tipo_veiculo"/>
            <label for="nome"> Nome: </label>
            <input type="text" name="nome_tipo_veiculo"/>
            <input type="submit" value="Enviar" />
        </p>

    </body>
</html>
