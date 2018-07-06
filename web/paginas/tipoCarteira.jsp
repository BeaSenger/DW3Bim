<%-- 
    Document   : tipoCarteira
    Created on : 05/07/2018, 17:39:54
    Author     : Asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../Estilos/Listas.css" rel="stylesheet" type="text/css"/>
        <title> Auto Escola Nacional </title>
    </head>
    <body>
        <form>
            <table id="customers">
                <tr>
                    <th>ID</th>
                    <th>Tipo Carteira</th>
                </tr>
                ${resultado}
            </table>
        </form>
    </body>
</html>
