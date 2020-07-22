package users;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/AddLinks")  
public class AddLinks extends HttpServlet {  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)   
             throws ServletException, IOException {  
        String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);      
        
        String uname = request.getParameter("username");
        String upwd = request.getParameter("userpwd");
        String uemail = request.getParameter("useremail");
        String fbcheck = request.getParameter("fbcheckbx");
        String fbname = request.getParameter("fbname");
        String fbpwd = request.getParameter("fbpswd");
        String gmailcheck = request.getParameter("gmcheck");
        String gmname = request.getParameter("gmname");
        String gmpwd = request.getParameter("gmpwd");
        
        request.setAttribute("id", id);
        request.setAttribute("username", uname);
        request.setAttribute("upwd", upwd);
        request.setAttribute("uemail", uemail);
        request.setAttribute("fbcheck", fbcheck);
        request.setAttribute("fbname", fbname);
        request.setAttribute("fbpwd", fbpwd);
        request.setAttribute("gmcheck", gmailcheck);
        request.setAttribute("gmname", gmname);
        request.setAttribute("gmpwd", gmpwd);
        
        
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/AddCheckbox.jsp");
        rd.forward(request, response);
        
         
    }  
}  