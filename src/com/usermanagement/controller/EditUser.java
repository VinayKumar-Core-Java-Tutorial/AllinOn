package com.usermanagement.controller;


import java.io.IOException;  
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/EditUser")  
public class EditUser extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
           throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        out.println("<h1>Update User details</h1>");  
        String sid=request.getParameter("userid");  
        int id=Integer.parseInt(sid);  
        
        String uname = request.getParameter("username");
        String upwd = request.getParameter("userpwd");
        String uemail = request.getParameter("useremail");
        
        request.setAttribute("id", id);
        request.setAttribute("username", uname);
        request.setAttribute("upwd", upwd);
        request.setAttribute("uemail", uemail);
       
        
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/UserEdit.jsp");
        rd.forward(request, response);
       
          
        
    }  
}  