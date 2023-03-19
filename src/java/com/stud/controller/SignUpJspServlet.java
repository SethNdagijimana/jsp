/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stud.controller;

import com.stud.dao.StudentJspDao;
import com.stud.model.StudentJspModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sethr
 */
@WebServlet(name = "SignUpJspServlet", urlPatterns = {"/SignUpJspServlet"})
public class SignUpJspServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SignUpJspServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SignUpJspServlet at " + request.getContextPath() + "</h1>");
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
        
        StudentJspModel student = new StudentJspModel();
        
        student.setEmail(request.getParameter("email"));
        student.setPassword(request.getParameter("password"));
        
        StudentJspDao studentDao = new StudentJspDao();
        studentDao.saveStudent(student);
        
                
         String email = request.getParameter("email");
         Properties props = new Properties();
         
         props.put("mail.smtp.auth", "true");
props.put("mail.smtp.starttls.enable", "true");
props.put("mail.smtp.host", "smtp.gmail.com");
props.put("mail.smtp.port", "587");
          Session session = Session.getInstance(props,
         new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
               return new PasswordAuthentication("sethreas@gmail.com", "msnyqorwprqegjww");
            }
         });
         try {
         // Create a new email message
         Message message = new MimeMessage(session);
         message.setFrom(new InternetAddress("sethreas@gmail.com"));
         message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
         message.setSubject("Confirmation Email");
         message.setText("Thank you for registering.");

         // Send the email message
         Transport.send(message);

         // Redirect the user to a confirmation page
         response.sendRedirect("login.jsp");

      } catch (MessagingException e) {
         throw new RuntimeException(e);
     }
        
//        processRequest(request, response);
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
