package com.hiber;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Student {
	
	@Id
	private int id;
	
	private String name;
	
	private String course;
	
	private long mobNo;
	
	private String city;
	
	public Student(int id, String name, String course, long mobNo, String city) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.mobNo = mobNo;
		this.city = city;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public long getMobNo() {
		return mobNo;
	}
	public void setMobNo(int mobNo) {
		this.mobNo = mobNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+" : "+this.name+" : "+this.course+" : "+this.mobNo+" : "+this.city;
	}
	
		
}
