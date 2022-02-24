package com.capg.assignment;



public class Contact {
	private String Fname;
	private String Lname;
	private long PhoneNo;
	private String Email;
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public long getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		PhoneNo = phoneNo;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Contact(String fname, String lname, long i, String email) {
		super();
		Fname = fname;
		Lname = lname;
		PhoneNo = i;
		Email = email;
	}
	public Contact() {
		super();
	}
	
	@Override
	public String toString() {
		return getFname()+","+getLname()+","+getPhoneNo()+","+getEmail();
	}

}
