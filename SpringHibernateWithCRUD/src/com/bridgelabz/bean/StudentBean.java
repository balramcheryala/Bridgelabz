package com.bridgelabz.bean;

public class StudentBean {
	private Integer id;
	private String fname;
	private String lname;
	private String rnumber;
	private Long mobile;
	private String address;
	
	public Integer getId() {
		return id;
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
	public void setRnumber(String rnumber) {
		this.rnumber = rnumber;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
