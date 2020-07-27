package com.usermanagement.controller;


import java.io.IOException;  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;

import com.usermanagement.dao.UserCrud;  
@WebServlet("/DeleteUserAccount")  
public class DeleteUser extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
             throws ServletException, IOException {  
        String sid=request.getParameter("userid");  
        int id=Integer.parseInt(sid);  
        UserCrud.delete(id);  
        response.sendRedirect("SaveUser");  
    }  
}  
