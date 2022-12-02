
package com.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Register</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Register at " + request.getContextPath() + "</h1>");
            
            // getting all the incomming detail from 
            
            String first_name = request.getParameter("first_name");
            String last_name = request.getParameter("last_name");
            String password = request.getParameter("password");
            String email = request.getParameter("email");
            
            out.println("<h2>" + first_name + "</h2>");
            out.println("<h2>" + last_name + "</h2>");
            out.println("<h2>" + password + "</h2>");
            out.println("<h2>" + email + "</h2>");
            
            // connection...............................................
            try {
                Class.forName("com.mysql.jdbc.Driver");
                
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/university", "root", "root");
                
                // query....
                
                String query = "insert into registration_form(first_name, last_name, password, email) values (?, ?, ?, ?);";
                
                PreparedStatement pstmt = con.prepareStatement(query);
                
                pstmt.setString(1, first_name);
                pstmt.setString(2, last_name);
                pstmt.setString(3, password);
                pstmt.setString(4, email);
                
                pstmt.executeUpdate();
                
                out.println("<h1>Done........</h1>");
            } catch (Exception e) {
                e.printStackTrace();
                out.println("<h1>" + e + "</h1>");
            }
            
            //.........................................................
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
