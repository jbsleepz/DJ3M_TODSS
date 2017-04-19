package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


import dao.PersoonDAO;



public class LoginController extends HttpServlet{ 	
	/**
	 * 
	 */	
	private static final long serialVersionUID = 1L;

	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		
			//to include content to request/response and to forward to pages
			RequestDispatcher rd= null;		
			
			//requested parameters
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			//makes connection to the database to 
			PersoonDAO pDao = new PersoonDAO();	
			
			
			
			if(username == null || password == null ||"".equals(username))/*|| "".equals(password)|| alleUsers.isEmpty())*/{
				request.setAttribute("msg", "Input is incorrect, try again");
				rd = request.getRequestDispatcher("/Homepage.jsp");			
			}		
			/*for(User u : alleUsers){
				if(u.GetNaam().equals(username)&& u.GetWachtwoord().equals(password)){
					request.setAttribute("msg","Dear " + u.GetNaam() + " Welcome!");
					rd = request.getRequestDispatcher("/Accountpage.jsp");
				}
				else{
					request.setAttribute("msg","Input is incorrect, try again");
					rd = request.getRequestDispatcher("/Homepage.jsp");
				}			*/

			rd.forward(request, response);

}
	
	
			
			
			
			
			
			
			
	}

