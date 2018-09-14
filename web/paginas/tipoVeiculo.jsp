
<%-- 
    Document   : tipoVeiculo
    Created on : 13/09/2018, 20:58:05
    Author     : Asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<jsp:useBean id="dao" class="DAOs.DAOTipoVeiculo"/>
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
                <th>ID</th>
                <th>Nome</th>
                </thead>
                <tbody>
                    <c:set var="resultadoLista" value="${dao.listInOrderNomeTipoVeiculo()}"/>
                    <c:forEach var="p" items="${resultadoLista}">
                        <tr> 
                            <td>${p.getIdTipoVeiculo()}</td>
                            <td>${p.getNomeTipoVeiculo()}</td>
                            
                        </tr>
                        </c:forEach>
                </tbody>

            </table>
    </body>
</html>
