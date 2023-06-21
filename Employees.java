package com.practice.example;

import java.util.Comparator;

public class Employees implements Comparator<Employees>{
	private int id;
	private String name;

	public Employees(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + "]";
	}

//	@Override
//	public int compareTo(Employees o) {
//
//		if (o.id > id) {
//			return -1;
//		}
//		if (o.id < id) {
//			return 1;
//		} else {
//			return 0;
//		}
//	}

	@Override
	public int compare(Employees o1, Employees o2) {
		if(o1.id>o2.id) {
			return -1;
		}
		else if (o1.id<o2.id) {
			return 1;
		}
		else {
			return 0;
		}
	}

}
