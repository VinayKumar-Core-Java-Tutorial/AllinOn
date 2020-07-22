package users;

import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SaveUser")
public class SaveUserServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)   
	         throws ServletException, IOException {  
	        response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	          
	        String name=request.getParameter("name");  
	        String password=request.getParameter("password");  
	        String email=request.getParameter("email"); 
	        String fcheck = request.getParameter("fcheck");
	        String fname = request.getParameter("fname");
	        String fpwd = request.getParameter("fpwd");
	        String gcheck = request.getParameter("gcheck");
	        String gname = request.getParameter("gname");
	        String gpwd = request.getParameter("gpwd");

	          
	        UserParam e=new UserParam();  
	        e.setUname(name);  
	        e.setUpwd(password);  
	        e.setUemail(email); 
	        e.setFcheck(fcheck);
	        e.setFname(fname);
	        e.setFpwd(fpwd);
	        e.setGcheck(gcheck);
	        e.setGname(gname);
	        e.setGpwd(gpwd);
	          
	        int status=UserCrud.save(e);  
	        if(status>0){  
	            out.print("<p>Record saved successfully! Please try to login</p>");  
	            request.getRequestDispatcher("index.html").include(request, response);  
	        }else{  
	            out.println("Sorry! unable to save record");  
	        }  
	          
	        out.close();  
	    }  

}
