package com.bean;

public class Student {
	private int sid;
	private String fname, lname, email;
	
	
	public Student(int sid, String fname, String lname, String email) {            //constructor
		this.sid = sid;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "SID : " + sid+ "\nFirst Name: " +fname+ "\nLname: " +lname+ "\nEmail: " +email;
	}
}
