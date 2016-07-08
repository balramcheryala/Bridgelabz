package com.bridgelabz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="TeamDB")
public class TeamModel {

	@Id
	@GeneratedValue
	@Column(name = "ID" )
	private Long id;
	
	@Column(name = "Name",unique=true, nullable=false )
	private String name;
	
	@Column(name = "owner"  )
	private String owner;
	
	@Column(name = "couch"  )
	private String couch;
	
	@Column(name = "caption"  )
	private String caption;
	
	@Column(name = "veneue"  )
	private String veneue;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getCouch() {
		return couch;
	}
	public void setCouch(String couch) {
		this.couch = couch;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public String getVeneue() {
		return veneue;
	}
	public void setVeneue(String veneue) {
		this.veneue = veneue;
	}
	
}
