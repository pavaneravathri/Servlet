package com.vedait.webProjects;

import java.io.IOException; 
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/studentLogin")
public class studentLogin extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
	String sernum = req.getParameter("sernum");
	String id = req.getParameter("id");
	String name = req.getParameter("name");
	String mail = req.getParameter("mail");
	String address = req.getParameter("address");
	String grade = req.getParameter("grade");
	
	
	
	int serialnumm = Integer.parseInt(sernum);
	int Studentidd = Integer.parseInt(id);
	
	student s = new student(serialnumm,Studentidd,name,mail,address,grade);
	
	int result  = studentCRUD.studentLogin(s);
	PrintWriter pw = res.getWriter();
	if(result > 0) {
		pw.println("OOPS ! Failed to Save Student Details.");
		
	}else
	{
		pw.println("Saved Successfully......!");
		
	}
	
	}

}
