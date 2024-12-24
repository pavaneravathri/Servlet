package com.vedait.webProjects;

import java.io.IOException;

import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class intrestCal extends HttpServlet{
	  @Override
		public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		  double amount=Double.parseDouble(req.getParameter("amount"));
	    	 double intrest=Double.parseDouble(req.getParameter("intrest"));
	    	 double duration=Double.parseDouble(req.getParameter("duration"));
	    	 
	    	 double interest=(amount*intrest*duration)/100;
	    	 
	    	 res.setContentType("text/html");
	    	 
	    	 PrintWriter pw=res.getWriter();
	    	 pw.println("<h1> Interest Calculation </h1>");
	    	
	    	 pw.println("<br>Original Amount :"+amount+"</br>");
	    	 pw.println("<br>Rate of interest :"+intrest+"</br>");
	    	 pw.println("<br>Time :"+duration+"</br>");
	    	 pw.println("<b><h2>Interested Calucated :"+interest+"<h2></b>");
	}
}
