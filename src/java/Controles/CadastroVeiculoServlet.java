/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;

import DAOs.DAOTipoVeiculo;
import DAOs.DAOVeiculo;
import Entidades.TipoVeiculo;
import Entidades.Veiculo;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
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
@WebServlet(name = "CadastroVeiculoServlet", urlPatterns = {"/cadVeiculo"})
public class CadastroVeiculoServlet extends HttpServlet {

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
            DAOVeiculo daoVeiculo = new DAOVeiculo();
            Veiculo a = new Veiculo();
            
            int codigo = Integer.valueOf(request.getParameter("codigo_veiculo"));
            String nome = request.getParameter("nome_veiculo");
            int tipoVeiculo = Integer.parseInt(request.getParameter("tipo_veiculo_id_tipo_veiculo"));
            DAOTipoVeiculo daoTipoVeiculo = new DAOTipoVeiculo();
            TipoVeiculo tc = new TipoVeiculo();
            tc = daoTipoVeiculo.obter(tipoVeiculo);
            
            a.setCodigoVeiculo(codigo);
            a.setNomeVeiculo(nome);
            a.setTipoVeiculoIdTipoVeiculo(tc);
            daoVeiculo.inserir(a);
            response.sendRedirect(request.getContextPath() + "/paginas/veiculoCad.jsp");
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
