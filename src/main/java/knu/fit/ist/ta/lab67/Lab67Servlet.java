/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab67;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sereg
 */
@WebServlet(name = "Lab67Servlet", urlPatterns = {"/lab6-7"})
public class Lab67Servlet extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Lab67Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Lab67Servlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        Regression regr = new Regression();
        Tree tr = new Tree();
        Check ch = new Check();
        
        tr.add(7);
        tr.add(1);
        tr.add(5);
        tr.add(3);
        tr.add(10);
        tr.add(2);
        tr.add(8);
        tr.add(9);
        
        
        
        request.setAttribute("l6n", request.getParameter("l6n"));
        request.setAttribute("n1", request.getParameter("n1"));
        request.setAttribute("n2", request.getParameter("n2"));
        
        
        
        String lab7n1 = "";
        String lab7n2 = "";
        
        
        
        String lab6 =  ch.showResult(request.getParameter("l6n"));
        
        
        
        if (regr.isANumber(request.getParameter("n1")))
            if (tr.containsNode(Integer.parseInt(request.getParameter("n1"))))
                lab7n1 = "true";
            else if (!tr.containsNode(Integer.parseInt(request.getParameter("n1"))))
                lab7n1 = "false";
        else
            lab7n1 = "Wrong numbers, try others";
        
        if (regr.isANumber(request.getParameter("n2")))
            if (tr.containsNode(Integer.parseInt(request.getParameter("n2"))))
                lab7n2 = "true";
            else if (!tr.containsNode(Integer.parseInt(request.getParameter("n2"))))
                lab7n2 = "false";
        else
            lab7n2 = "Wrong numbers, try others";
        
        
        String lab7ind = tr.nodeIndexList();
        String lab7sort = tr.traverseInOrder(tr.root);
        String lab7pre = tr.traversePreOrder(tr.root);
        String lab7post = tr.traversePostOrder(tr.root);
        String lab7lev = tr.traverseLevelOrder(tr.root);

        request.setAttribute("lab6", lab6);
        request.setAttribute("lab7n1", lab7n1);
        request.setAttribute("lab7n2", lab7n2);
        request.setAttribute("lab7ind", lab7ind);
        request.setAttribute("lab7sort", lab7sort);
        request.setAttribute("lab7pre", lab7pre);
        request.setAttribute("lab7post", lab7post);
        request.setAttribute("lab7lev", lab7lev);
        
        request.getRequestDispatcher("lab6-7.jsp").forward(request,response);
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
