package org.songxiang;

import java.util.Date;

import javax.persistence.*;
//@Entity
//@Table(name="Person_inf")
public class Person {
	//@Id @Column(name="person_id")
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Integer id ; 
		private String name ; 
	
		private String password;
		
		private Date birth ; 
	 public Person()
	 {	 
	 };
	public Person(String name, String password,Date date) {
		super();
		this.name = name;
		this.password = password;
		this.birth = birth;
		this.birth = date ;
	}
//	@Override
//	public String toString() {
//		return "Person [name=" + name + ", password=" + password + ", birth="
//				+ birth + "]";
//	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public Integer getId() {
		return id;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
}
