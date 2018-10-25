<%-- 
    Document   : turmaTeoricaCad
    Created on : 25/10/2018, 13:00:33
    Author     : Asus
--%>

<%@page import="Entidades.Professor"%>
<%@page import="java.util.List"%>
<%@page import="DAOs.DAOProfessor"%>

<%
    DAOProfessor daoProfessor = new DAOProfessor();
    List<Professor> professor = daoProfessor.listInOrderCpfProfessor();
%>

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
        <form action="${pageContext.request.contextPath}/cadTurmaTeorica"> 
            <p> 
                <label for="codigo"> Codigo Turma: </label>
                <input type="text" name="codigo_turma"/>
                
                <label for="periodo"> Periodo: </label>
                <input type="text" name="periodo_turma"/>
                
                <label for="data"> Data inicio: </label>
                <input type="text" name="data_inicio"/>
                
                <label for="qtde"> Qtde Horas: </label>
                <input type="text" name="quantidade_horas"/>
                
                
                <label for="Professor"> Professor: </label>
                <select class="form-control" name="professor_cpf_professor">
                    <option value="">SELECIONE</option>
                <%
                    for (Professor i : professor) {
                %>
                <option value="<%=i.getCpfProfessor()%>"><%=i.getNomeProfessor()%></option>
                <%}%>
               
                </select>
                
                <input type="submit" value="Enviar" />
                
    </body>
</html>
