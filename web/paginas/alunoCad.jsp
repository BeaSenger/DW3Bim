<%-- 
    Document   : veiculoCad
    Created on : 13/09/2018, 13:56:07
    Author     : Asus
--%>
<%@page import="Entidades.TipoCarteira"%>
<%@page import="java.util.List"%>
<%@page import="DAOs.DAOTipoCarteira"%>

<%
    DAOTipoCarteira daoTipoCarteira = new DAOTipoCarteira();
    List<TipoCarteira> tipoCarteira = daoTipoCarteira.listInOrderIdTipoCarteira();
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

        <div> <h1> Cadastro Alunos </h1></div>
        <form action="${pageContext.request.contextPath}/cadAluno"> 
            <p> 
                <label for="cpf"> CPF Aluno: </label>
                <input type="text" name="cpf_aluno"/>
                
                <label for="nome"> Nome: </label>
                <input type="text" name="nome_aluno"/>
                
                <label for="data"> Data: </label>
                <input type="text" name="data_nasc"/>
                
                <label for="rg"> RG: </label>
                <input type="text" name="rg_aluno"/>
                
                <label for="rgE"> Órgao Emissor: </label>
                <input type="text" name="rg_emissor_aluno"/>
                
                <label for="end"> Endereço: </label>
                <input type="text" name="endereco_aluno"/>
                
                <label for="cidade"> Cidade: </label>
                <input type="text" name="cidade_aluno"/>
                
                <label for="bairro"> Bairro: </label>
                <input type="text" name="bairro_aluno"/>
                
                <label for="cep"> CEP: </label>
                <input type="text" name="cep_tipo_carteira"/>
                
                <label for="tel"> Telefone: </label>
                <input type="text" name="telefone_aluno"/>
                
                <label for="cel"> Celular: </label>
                <input type="text" name="celular_aluno"/>
                
                <label for="Habilitacao"> Habilitação: </label>
                <select class="form-control" name="tipo_carteira_id_tipo_carteira">
                    <option value="">SELECIONE</option>
                <%
                    for (TipoCarteira i : tipoCarteira) {
                %>
                <option value="<%=i.getIdTipoCarteira()%>"><%=i.getNomeTipoCarteira()%></option>
                <%}%>
               
                </select>
                
                <input type="submit" value="Enviar" />
                
    </body>
</html>
