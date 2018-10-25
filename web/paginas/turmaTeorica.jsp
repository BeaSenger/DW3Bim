<%-- 
    Document   : TurmaTeorica
    Created on : 24/10/2018, 16:33:59
    Author     : Asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../Estilos/Listas.css" rel="stylesheet" type="text/css"/>
        <title> Auto Escola Nacional</title>
    </head>
    <body>
        <form>
            <table id="customers">
                <tr>
                    <th>Codigo</th>
                    <th>Período</th>
                    <th>Data Inicioo</th>        
                    <th>Qtde Horas</th> 
                    <th>Prof</th> 
                </tr>
                    ${resultado}
                </table>
        </form>   
    </body>
</html>
