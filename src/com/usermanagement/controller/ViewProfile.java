package com.usermanagement.controller;


import java.io.IOException;  
import java.io.PrintWriter;  
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;

import com.usermanagement.dao.UserCrud;
import com.usermanagement.model.UserParam;  
@WebServlet("/ViewUser")  
public class ViewProfile extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
               throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        
        
        UserParam user = new UserParam();
        user = UserCrud.getUserById(7);
        
        request.setAttribute("id", user.getId());
        request.setAttribute("username", user.getUname());
        request.setAttribute("upwd", user.getUpwd());
        request.setAttribute("uemail", user.getUemail());
        request.setAttribute("fcheck", user.getFcheck());
        request.setAttribute("fname", user.getFname());
        request.setAttribute("fpwd", user.getFpwd());
        request.setAttribute("gcheck", user.getGcheck());
        request.setAttribute("gname", user.getGname());
        request.setAttribute("gpwd", user.getGpwd());
    	
        RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
        rd.forward(request, response);
    }  
}  