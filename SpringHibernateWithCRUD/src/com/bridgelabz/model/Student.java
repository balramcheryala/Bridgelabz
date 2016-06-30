package com.bridgelabz.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StudentTable")
public class Student implements Serializable{

	private static final long serialVersionUID = -723583058586873479L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "Studentid")
	private Integer id;
	
	@Column(name="StudentFirstname")
	private String fname;
	
	@Column(name="StudentLastName")
	private String lname;
	
	@Column(name="RollNumber",unique=true, nullable=false)
	private String rnumber;
	
	@Column(name="Mobile",unique=true, nullable=false)
	private Long mobile;
	@Column(name="Address")
	private String address;
	public Integer getId() {
		return id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getRnumber() {
		return rnumber;
	}

	public void setRnumber(String string) {
		this.rnumber = string;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

}
