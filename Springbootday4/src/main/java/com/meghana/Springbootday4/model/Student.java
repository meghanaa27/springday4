package com.meghana.Springbootday4.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studentdata")
public class Student {
	@Id
	private int id;
	private String studName;
	private String studDep;
	private String studMail;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String studName, String studDep, String studMail) {
		super();
		this.id = id;
		this.studName = studName;
		this.studDep = studDep;
		this.studMail = studMail;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getStudDep() {
		return studDep;
	}
	public void setStudDep(String studDep) {
		this.studDep = studDep;
	}
	public String getStudMail() {
		return studMail;
	}
	public void setStudMail(String studMail) {
		this.studMail = studMail;
	}
}
