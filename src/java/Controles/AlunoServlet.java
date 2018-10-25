/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;

import DAOs.DAOAluno;
import Entidades.Aluno;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Asus
 */
@WebServlet(name = "AlunoServlet", urlPatterns = {"/aluno"})
public class AlunoServlet extends HttpServlet {

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
            DAOAluno aluno = new DAOAluno();
            List<Aluno> listaAluno = aluno.listInOrderCpfAluno();
            String tabela = "";
            for (Aluno a : listaAluno) {
                tabela += "<tr>"
                        + "<td>" + a.getCpfAluno() + "</td>"
                        + "<td>" + a.getNomeAluno() + "</td>"
                        + "<td>" + a.getDataNascimento() + "</td>"
                        + "<td>" + a.getRgAluno() + "</td>"
                        + "<td>" + a.getRgEmissorAluno() + "</td>"
                        + "<td>" + a.getEnderecoAluno() + "</td>"
                        + "<td>" + a.getCidadeAluno() + "</td>"
                        + "<td>" + a.getBairroAluno() + "</td>"
                        + "<td>" + a.getCepTipoCarteira() + "</td>"
                        + "<td>" + a.getTelefoneAluno() + "</td>"
                        + "<td>" + a.getCelularAluno() + "</td>"
                        + "<td>" + a.getTipoCarteiraIdTipoCarteira().getNomeTipoCarteira()+ "</td>"
                        + "</tr>";
            }
            request.getSession().setAttribute("resultado", tabela);
            response.sendRedirect(request.getContextPath() + "/paginas/aluno.jsp");
        
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
