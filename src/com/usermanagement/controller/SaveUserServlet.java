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

@WebServlet("/SaveUser")
public class SaveUserServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)   
	         throws ServletException, IOException {  
	        response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	       
	          
	        String firstname=request.getParameter("firstname");  
	        String lastname=request.getParameter("lastname");
	        String email=request.getParameter("email"); 
	        String fcheck = request.getParameter("fcheck");
	        String fname = request.getParameter("fname");
	        String fpwd = request.getParameter("fpwd");
	        String gcheck = request.getParameter("gcheck");
	        String gname = request.getParameter("gname");
	        String gpwd = request.getParameter("gpwd");
	        String phonenumber = request.getParameter("phonenumber");
	        String address = request.getParameter("address");

	          
	        UserParam e=new UserParam();  
	        e.setUname(firstname,lastname);  
	        e.setUpwd();  
	        e.setUemail(email); 
	        e.setFcheck(fcheck);
	        e.setFname(fname);
	        e.setFpwd(fpwd);
	        e.setGcheck(gcheck);
	        e.setGname(gname);
	        e.setGpwd(gpwd);
	        e.setPhonenumber(phonenumber);
	        e.setAddress(address);
	        e.setFirstname(firstname);
	        e.setLastname(lastname);
	        e.setUniqueid();
	        
	        int status=UserCrud.save(e);  
	        
	        String args[] = new String[6];
	        args[0] = firstname;
	        args[1] = lastname;
	        args[2] = email;
	        args[3] = e.getUniqueid();
	        args[4] = e.getUpwd();
	        args[5] = firstname + " " + lastname;
	        
	        Email.main(args);
	          
	        
	        if(status>0){  
	            out.print("<p>Record saved successfully! Please try to login</p>");  
	            request.getRequestDispatcher("index.html").include(request, response);  
	        }else{  
	            out.println("Sorry! unable to save record");  
	        }  
	          
	        out.close();  
	    }  

}
