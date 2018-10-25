<%-- 
    Document   : veiculoCad
    Created on : 25/10/2018, 20:36:47
    Author     : Asus
--%>

<%@page import="Entidades.TipoVeiculo"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="DAOs.DAOTipoVeiculo"%>

<%
    DAOTipoVeiculo daoTipoVeiculo = new DAOTipoVeiculo();
    List<TipoVeiculo> tipoVeiculo = daoTipoVeiculo.listInOrderIdTipoVeiculo();
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../Estilos/Cadastros.css" rel="stylesheet" type="text/css"/>
        <title>Cadastro</title>
    </head>
    <body>

        <div> <h1> Cadastro Veículos </h1></div>
        <form action="${pageContext.request.contextPath}/cadVeiculo"> 
            <p> 
                <label for="codigo"> Codigo: </label>
                <input type="text" name="codigo_veiculo"/>
                
                <label for="nome"> Nome: </label>
                <input type="text" name="nome_veiculo"/>
                
                <label for="text"> Tipo: </label>
                <select class="form-control" name="tipo_veiculo_id_tipo_veiculo">
                    <option value="">SELECIONE</option>
                <%
                    for (TipoVeiculo i : tipoVeiculo) {
                %>
                <option value="<%=i.getIdTipoVeiculo()%>"><%=i.getNomeTipoVeiculo()%></option>
                <%}%>
               
                </select>
                
                <input type="submit" value="Enviar" />
                
    </body>
</html>
