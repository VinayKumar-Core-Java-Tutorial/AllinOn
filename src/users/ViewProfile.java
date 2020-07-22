package users;


import java.io.IOException;  
import java.io.PrintWriter;  
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/ViewUser")  
public class ViewProfile extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
               throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        
        UserParam p = new UserParam();
        p = UserCrud.getUserById(4);
        
        request.setAttribute("id", p.getId());
        request.setAttribute("username", p.getUname());
        request.setAttribute("upwd", p.getUpwd());
        request.setAttribute("uemail", p.getUemail());
        request.setAttribute("fcheck", p.getFcheck());
        request.setAttribute("fname", p.getFname());
        request.setAttribute("fpwd", p.getFpwd());
        request.setAttribute("gcheck", p.getGcheck());
        request.setAttribute("gname", p.getGname());
        request.setAttribute("gpwd", p.getGpwd());
    	
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/UserProfile.jsp");
        rd.forward(request, response);
    }  
}  