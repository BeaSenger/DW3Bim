<%-- 
    Document   : veiculo
    Created on : 13/09/2018, 21:10:53
    Author     : Asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<jsp:useBean id="dao" class="DAOs.DAOVeiculo"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../Estilos/Listas.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <table id="customers">
                <thead>
                <th>Codigo</th>
                <th>Nome</th>
                <th>Tipo Veiculo</th>             
                </thead>
                <tbody>
                    <c:set var="resultadoLista" value="${dao.listInOrderCodigoVeiculo()}"/>
                    <c:forEach var="p" items="${resultadoLista}">
                        <tr> 
                            <td>${p.getCodigoVeiculo()}</td>
                            <td>${p.getNomeVeiculo()}</td>
                            <td>${p.getTipoVeiculoIdTipoVeiculo()}</td>
                            
                        </tr>
                        </c:forEach>
                </tbody>

            </table>
    </body>
</html>
