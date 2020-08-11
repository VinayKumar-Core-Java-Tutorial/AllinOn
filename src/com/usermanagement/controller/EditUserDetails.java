package com.usermanagement.controller;


import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;

import com.usermanagement.dao.UserCrud;
import com.usermanagement.model.UserParam;  
@WebServlet("/EditUserDetails")  
public class EditUserDetails extends HttpServlet {  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)   
          throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        
        String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);  
        String name=request.getParameter("username");  
        String password=request.getParameter("userpassword");  
        String email=request.getParameter("usermail");  
          
        UserParam e=new UserParam();  
        e.setId(id);        
        e.setFirstname(name);  
        e.setUpwd(password);  
        e.setUemail(email); 
       
          
        int status=UserCrud.update(e);  
        if(status>0){  
            response.sendRedirect("ViewUser");  
        }else{  
            out.println("Sorry! unable to update record");  
        }  
          
        out.close();  
    }  
  
}  