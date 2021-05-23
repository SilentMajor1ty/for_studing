/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab5;

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
 * @author sereg
 */
@WebServlet(name = "Lab5Servlet", urlPatterns = {"/lab5"})
public class Lab5Servlet extends HttpServlet {

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
            out.println("<title>Servlet Lab5Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Lab5Servlet at " + request.getContextPath() + "</h1>");
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
        Lab4Task tfl4 = new Lab4Task();
        TaskText t1fl5 = new TaskText();
        
        List<String> text = tfl4.getList(tfl4.text);
        String t1find = request.getParameter("t1find");
        int t1start;
        int t1finish;
        String t1 = "";
        String t3string = request.getParameter("t3string");
        byte t3byte = Byte.parseByte(request.getParameter("t3byte"));
        
        if ("".equals(request.getParameter("t1start"))){
            t1start = -1;
        }
        else if (Integer.parseInt(request.getParameter("t1start")) < 0){
            t1 = "Enter search positions that are greater than or equal to 0";
            t1start = Integer.parseInt(request.getParameter("t1start"));
        }
        else{
        
            t1start = Integer.parseInt(request.getParameter("t1start"));
        }
        
        if ("".equals(request.getParameter("t1finish"))){
            t1finish = -1;
        }
        else if (Integer.parseInt(request.getParameter("t1finish")) < 0){
            t1 = "Enter search positions that are greater than or equal to 0";
            t1finish = Integer.parseInt(request.getParameter("t1finish"));
        }
        else{
        
            t1finish = Integer.parseInt(request.getParameter("t1finish"));
        }
        
        Task task = new Task(Integer.parseInt(request.getParameter("t2")));
        
        if ("".equals(t1))
            t1 = t1fl5.Task1(t1find, t1start, t1finish, text);
        String t2s = "" + task.getUnsortedStringList();
        String t2b = "" + task.getUnsortedByteList();
        String sortedList = "" + task.sortApproach2String();
        String sortedListv2 = "" + task.sortApproach2Byte();
        String findt3s = task.Task3String(t3string, task.sortApproach2String());
        String findt3b = task.Task3Byte(t3byte, task.sortApproach2Byte());

        request.setAttribute("t1", t1);
        request.setAttribute("t2s", t2s);
        request.setAttribute("t2b", t2b);
        request.setAttribute("sortedList", sortedList);
        request.setAttribute("sortedListv2", sortedListv2);
        request.setAttribute("findt3s", findt3s);
        request.setAttribute("findt3b", findt3b);
        
        request.setAttribute("t1find", t1find);
        request.setAttribute("t3string", t3string);
        request.setAttribute("t3byte", t3byte);
        
        request.getRequestDispatcher("lab5.jsp").forward(request,response);
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
