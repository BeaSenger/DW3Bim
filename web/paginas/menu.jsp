<%-- 
    Document   : JSPnaosei
    Created on : 20/05/2018, 20:17:58
    Author     : Asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Auto Escola Nacional</title>
        <link href="../Estilos/estilos.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
       <div id="todoSite"> 
           <div id="esquerda"> 
               <div id="cabecalho"> 
                   Auto Escola Nacional
               </div> 
               <div id="menu"> 
                       <a href="${pageContext.request.contextPath}/aluno" target="princ" id="bt2"> Alunos </a>
                       <a href="alunoCad.jsp" target="princ" id="bt1"> Cadastro de Alunos </a>
                       
                       <a href="${pageContext.request.contextPath}/professor" target="princ" id="bt3"> Professores </a>
                       <a href="professorCad.jsp" target="princ" id="bt1"> Cadastro de Professores </a>

                       <a href="http://localhost:8084/Beatriz_AutoEscola/paginas/tipoCarteira.jsp" target="princ" id="bt4"> Tipo Carteira</a>
                       <a href="tipoCarteiraCad.jsp" target="princ" id="bt1"> Cadastro Tipo Carteira </a>
                       
                       <a href="${pageContext.request.contextPath}/veiculo" target="princ" id="bt5"> Veiculos </a>
                       <a href="veiculoCad.jsp" target="princ" id="bt1"> Cadastro de Veiculos </a>
                       
                       <a href="http://localhost:8084/Beatriz_AutoEscola/paginas/tipoVeiculo.jsp" target="princ" id="bt6"> Tipo Veiculo </a>
                       <a href="tipoVeiculoCad.jsp" target="princ" id="bt1"> Cadastro de Tipo Veiculo </a>
               </div>
           </div>
       </div> 
    </body>
</html>
