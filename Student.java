package com.practice.example;

public class Student implements Comparable<Student>{
	 private int sid;
	 private String sname;
	 private int sAgeString;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getsAgeString() {
		return sAgeString;
	}
	public void setsAgeString(int sAgeString) {
		this.sAgeString = sAgeString;
	}
	public Student(int sid, String sname, int sAgeString) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sAgeString = sAgeString;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sAgeString=" + sAgeString + "]";
	}
	@Override
	public int compareTo(Student o) {
		if(this.sid<o.sid) {
			return -1;	
		}
		else if (this.sid>o.sid) {
			return 1;
		}
		else {
			return 0;
		}
	}
	 
	 

}
