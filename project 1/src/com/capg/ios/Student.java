package com.capg.ios;

import java.io.Serializable;

public class Student implements Serializable {
 private int stId;
 private String stName;
 private String address;
  
 public Student() {}

public int getStId() {
	return stId;
}

public void setStId(int stId) {
	this.stId = stId;
}

public String getStName() {
	return stName;
}

public void setStName(String stName) {
	this.stName = stName;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public Student(int stId, String stName, String address) {
	super();
	this.stId = stId;
	this.stName = stName;
	this.address = address;
}
 
 @Override
  public String toString() {
	return stName  + address + stId;
	 
 }
 
}
