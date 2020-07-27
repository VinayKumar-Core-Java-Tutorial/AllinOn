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
@WebServlet("/AddCheckbox")  
public class AddChkbx extends HttpServlet {  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)   
          throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);  
          
        
        String fbcheck = request.getParameter("fbcheck");
        String fbname = request.getParameter("fbname");
        String fbpwd = request.getParameter("fbpwd");
        String gmcheck = request.getParameter("gmcheck");
        String gmname = request.getParameter("gmname");
        String gmpwd = request.getParameter("gmpwd");
               
          
        UserParam e=new UserParam();  
        
        e.setId(id); 
        e.setFcheck(fbcheck);
        e.setFname(fbname);
        e.setFpwd(fbpwd);
        e.setGcheck(gmcheck);
        e.setGname(gmname);
        e.setGpwd(gmpwd);
        
          
        int status=UserCrud.addLinkValues(e);  
        if(status>0){  
            response.sendRedirect("ViewUser");  
        }else{  
            out.println("Sorry! unable to update record");  
        }  
          
        out.close();  
    }  
  
}  