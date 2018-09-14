/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;

import DAOs.DAOAluno;
import Entidades.Aluno;
import static Entidades.Aluno_.tipoCarteiraIdTipoCarteira;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Asus
 */
@WebServlet(name = "CadastroAlunoServlet", urlPatterns = {"/CadastroAlunoServlet"})
public class CadastroAlunoServlet extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            DAOAluno daoAluno = new DAOAluno();
            Aluno p = new Aluno();
            String cpf = request.getParameter("cpf");
            String nome = request.getParameter("nome");
            String data = request.getParameter("data");
            String rgA = request.getParameter("rgA");
            String rgE = request.getParameter("rgEmissor");
            String endereco = request.getParameter("endereco");
            String cidade = request.getParameter("cidade");
            String bairro = request.getParameter("bairro");
            String cep = request.getParameter("cep");
            String tel = request.getParameter("tel");
            String cel = request.getParameter("cel");
            String habilitacao = request.getParameter("habilitacao");
            
            p.setCpfAluno(cpf);
            p.setNomeAluno(nome);
//            p.setDataNascimento(String.valueOf(data));
            p.setRgAluno(rgA);
            p.setRgEmissorAluno(rgE);
            p.setEnderecoAluno(endereco);
            p.setCidadeAluno(cidade);
            p.setBairroAluno(bairro);
            p.setCepTipoCarteira(cep);
            p.setTelefoneAluno(tel);
            p.setCelularAluno(cel);
//            p.setTipoCarteiraIdTipoCarteira(habilitacao);
            
            daoAluno.inserir(p);
            response.sendRedirect(request.getContextPath()+"/paginas/alunoCad.jsp");
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
