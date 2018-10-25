/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;

import DAOs.DAOAluno;
import DAOs.DAOTipoCarteira;
import Entidades.Aluno;
import Entidades.TipoCarteira;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gabi
 */
@WebServlet(name = "CadAlunoervlet", urlPatterns = {"/cadAluno"})
public class CadastroAlunoServlet extends HttpServlet {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            try {
            DAOAluno daoAluno = new DAOAluno();
            Aluno a = new Aluno();
            
            String cpf  = request.getParameter("cpf_aluno");
            String nome = request.getParameter("nome_aluno");
            Date data = sdf.parse(request.getParameter("data_nasc"));
            String rg = request.getParameter("rg_aluno");
            String rgE = request.getParameter("rg_emissor_aluno");
            String end = request.getParameter("endereco_aluno");
            String cidade = request.getParameter("cidade_aluno");
            String bairro = request.getParameter("bairro_aluno");
            String cep = request.getParameter("cep_tipo_carteira");
            String tel = request.getParameter("telefone_aluno");
            String cel = request.getParameter("celular_aluno");
            
            int tipoCarteira = Integer.parseInt(request.getParameter("tipo_carteira_id_tipo_carteira"));
            DAOTipoCarteira daoTipoCarteira = new DAOTipoCarteira();
            TipoCarteira tc = new TipoCarteira();
            tc = daoTipoCarteira.obter(tipoCarteira);
            
            a.setCpfAluno(cpf);
            a.setNomeAluno(nome);
            a.setDataNascimento(data);
            a.setRgAluno(rg);
            a.setRgEmissorAluno(rgE);
            a.setEnderecoAluno(end);
            a.setCidadeAluno(cidade);
            a.setBairroAluno(bairro);
            a.setCepTipoCarteira(cep);
            a.setTelefoneAluno(tel);
            a.setCelularAluno(cel);
            a.setTipoCarteiraIdTipoCarteira(tc);
            
            daoAluno.inserir(a);
            response.sendRedirect(request.getContextPath() + "/paginas/alunoCad.jsp");

            
            } catch (ParseException ex) {
               
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
