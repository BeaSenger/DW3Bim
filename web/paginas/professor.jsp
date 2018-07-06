<%-- 
    Document   : professor
    Created on : 29/06/2018, 01:10:48
    Author     : Gabi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../Estilos/Listas.css" rel="stylesheet" type="text/css"/>
        <title>Auto Escola Nacional</title>
    </head>
    <body>
        <form>
            <table id="customers">
                <tr>
                    <th>CPF</th>
                    <th>Nome</th>
                    <th>Habilitação</th>             
                </tr>
                    ${resultado}
                </table>
        </form>   
    </body>
</html>
