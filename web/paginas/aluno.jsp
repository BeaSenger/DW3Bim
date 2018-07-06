<%-- 
    Document   : aluno
    Created on : 05/07/2018, 17:14:03
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
                    <th>CPF</th>
                    <th>Nome</th>
                    <th>Data Nascimento</th>        
                    <th>RG</th> 
                    <th>Orgao Emissor</th> 
                    <th>Endereço</th> 
                    <th>Cidade</th> 
                    <th>Bairro</th>
                    <th>CEP</th>
                    <th>Telefone</th>
                    <th>Celular</th>
                    <th>Tipo Carteira</th>
                </tr>
                    ${resultado}
                </table>
        </form>   
    </body>
</html>
