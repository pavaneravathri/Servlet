package com.vedait.webProjects;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;



public class firstServletEx implements Servlet{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
       PrintWriter pw =	res.getWriter();
       pw.println("<h1>Pavan Eravathri.........!</h1>");
	}
	

}
