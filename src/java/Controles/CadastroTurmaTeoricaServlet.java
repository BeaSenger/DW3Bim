/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;

import DAOs.DAOProfessor;
import DAOs.DAOTurmaTeorica;
import Entidades.Professor;
import Entidades.TurmaTeorica;
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
 * @author Asus
 */
@WebServlet(name = "CadastroTurmaTeoricaServlet", urlPatterns = {"/cadTurmaTeorica"})
public class CadastroTurmaTeoricaServlet extends HttpServlet {

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
                DAOTurmaTeorica daoTurmaTeorica = new DAOTurmaTeorica();
                TurmaTeorica a = new TurmaTeorica();

                int codigo = Integer.valueOf(request.getParameter("codigo_turma"));
                String periodo = request.getParameter("periodo_turma");
                Date data = sdf.parse(request.getParameter("data_inicio"));
                int qtde = Integer.valueOf(request.getParameter("quantidade_horas"));

                int professor = Integer.valueOf(request.getParameter("professr_cpf_professor"));
                DAOProfessor daoProfessor = new DAOProfessor();
                Professor prof = new Professor();
                prof = daoProfessor.obter(professor);
                
                
                a.setCodigoTurma(codigo);
                a.setPeriodoTurma(periodo);
                a.setDataInicio(data);
                a.setQuantidadeHoras(qtde);
                a.setProfessorCpfProfessor(prof);

                daoTurmaTeorica.inserir(a);
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
