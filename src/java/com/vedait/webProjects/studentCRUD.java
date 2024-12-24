package com.vedait.webProjects;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.Statement;

public class studentCRUD {
	
	public static int studentLogin(student s) {
		int result=0;
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vedait", "root", "pavan");
            Statement stst = con.createStatement();
            int re = stst.executeUpdate("insert into student values("+s.getSerialnum()+","+s.getStudentid()+",'"+s.getStudentName()+"','"+s.getStudentMail()+"','"+s.getStudentAddress()+"','"+s.getStudentGrade()+"')");
        }catch(Exception e){
            e.printStackTrace();
        }
		return result;
		
	}

}
