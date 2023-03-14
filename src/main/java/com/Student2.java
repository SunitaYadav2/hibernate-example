package com;

import javax.persistence.Entity;
import javax.persistence.Id;




@Entity

public class Student2 {
	
	int id;
	String name;
	String result;
	public Student2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student2(int id, String name, String result) {
		super();
		this.id = id;
		this.name = name;
		this.result = result;
	}
	
	@Id
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
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Student2 [id=" + id + ", name=" + name + ", result=" + result + "]";
	}
	
	
	

}
