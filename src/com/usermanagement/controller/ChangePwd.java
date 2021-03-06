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
@WebServlet("/ChangePwd")  
public class ChangePwd extends HttpServlet {  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)   
          throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        
        String uniqueid=request.getParameter("uniqueid");  
        String fname=request.getParameter("firstname");  
        String lname=request.getParameter("lastname"); 
        String upwd = request.getParameter("newupwd");
          
        UserParam e=new UserParam();  
        e.setFirstname(fname);
        e.setLastname(lname);
        e.setUniqueid(uniqueid);
        e.setUpwd(upwd);
                 
        int status=UserCrud.changepwd(e);  
        if(status>0){  
            response.sendRedirect("index.html");  
        }else{  
            out.println("Sorry! unable to update record");  
        }  
          
        out.close();  
    }  
  
}  