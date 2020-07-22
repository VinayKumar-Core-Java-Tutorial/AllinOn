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
@WebServlet("/FbGmailWelcome")  
public class FbGmailIndex extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
               throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        
        String fbname=request.getParameter("facebookname"); 
        String gmname = request.getParameter("gmailname");
        
        request.setAttribute("fname", fbname);
        request.setAttribute("gname", gmname);
        
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/FbGmailIndex.jsp");
        rd.forward(request, response);
    }  
}  