package com.vedait.webProjects;

public class student {
	private int serialnum;
	private int Studentid;
	private String studentName;
	private String StudentMail;
	private String StudentAddress;
	private String StudentGrade;
	
	
	public student(int serialnum, int studentid, String studentName, String studentMail, String studentAddress,
			String studentGrade) {
		super();
		this.serialnum = serialnum;
		Studentid = studentid;
		this.studentName = studentName;
		StudentMail = studentMail;
		StudentAddress = studentAddress;
		StudentGrade = studentGrade;
	}
	public int getSerialnum() {
		return serialnum;
	}
	public void setSerialnum(int serialnum) {
		this.serialnum = serialnum;
	}
	public int getStudentid() {
		return Studentid;
	}
	public void setStudentid(int studentid) {
		Studentid = studentid;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentMail() {
		return StudentMail;
	}
	public void setStudentMail(String studentMail) {
		StudentMail = studentMail;
	}
	public String getStudentAddress() {
		return StudentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		StudentAddress = studentAddress;
	}
	public String getStudentGrade() {
		return StudentGrade;
	}
	public void setStudentGrade(String studentGrade) {
		StudentGrade = studentGrade;
	}
}
