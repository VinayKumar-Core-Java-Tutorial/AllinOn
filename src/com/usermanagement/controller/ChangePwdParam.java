package com.usermanagement.controller;


import java.io.IOException;  
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  

@WebServlet("/ChangePwdParam")  
public class ChangePwdParam extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
           throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        out.println("<h1>Update User details</h1>");
        
        String uniqueid=request.getParameter("uniqueid");  
        
        String fname = request.getParameter("firstname");
        String lname = request.getParameter("lastname");
        String upwd = request.getParameter("upwd");
        
        request.setAttribute("firstname", fname);
        request.setAttribute("lastname", lname);
        request.setAttribute("uniqueid", uniqueid);
        request.setAttribute("upwd", upwd);
        
        RequestDispatcher rd = request.getRequestDispatcher("/ChangePasswordForm.jsp");
        rd.forward(request, response);
       
          
        
    }  
}  