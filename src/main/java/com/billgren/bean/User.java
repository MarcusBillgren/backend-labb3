package com.billgren.bean;


import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "user")
@XmlAccessorType(XmlAccessType.FIELD)
public class User implements Serializable {
	
	private static final long serialVersionUID =1L;
	private int id;
	private String name;
	private String profession;
	
	public User() {
		super();
	}
	
	public User(String name, String profession) {
		super();
		this.name = name;
		this.profession = profession;
	}

	public User(int id, String name, String profession) {
		super();
		this.id = id;
		this.name = name;
		this.profession = profession;
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

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	@Override
	public String toString() {
		
		return name + ", " + profession;
	}
	
	
	
	
	
	
	
	

}
