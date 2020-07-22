package users;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/DeleteLink")  
public class DeleteLink extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
             throws ServletException, IOException {  
       
    	response.setContentType("text/html");  
    	PrintWriter out=response.getWriter(); 
        String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);  
        
        String fbcheck = request.getParameter("fbcheck");

        String gmcheck = request.getParameter("gmcheck");

        
          
        UserParam e=new UserParam();  
        
        e.setId(id); 
        e.setFcheck(fbcheck);

        e.setGcheck(gmcheck);


        int status=UserCrud.deleteLinkValues(e);  
        if(status>0){  
            response.sendRedirect("ViewUser");  
        }else{  
            out.println("Sorry! unable to update record");  
        }  
          
        out.close();  
    }  
}  
