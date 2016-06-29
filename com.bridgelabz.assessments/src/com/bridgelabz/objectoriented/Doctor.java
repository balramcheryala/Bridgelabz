package com.bridgelabz.objectoriented;

/*
* created by: Bridge Labz
* Date 15/05/2016
*
* Perpose: This model is used for storing doctor details	 
**/

import com.bridgelabz.utility.Utility;
public class Doctor{
	private String name,specialization,availability;
	private int id;
	Utility u1;
	public Doctor(){
		u1=new Utility();
		System.out.println("Enter Doctors Details ...");

		System.out.print("Enter Name: ");
		this.name=u1.inputString();
		System.out.println();

		System.out.print("Enter Id No: ");
		this.id=u1.inputInteger();
		System.out.println();

		System.out.print("Enter specialization: ");
		this.specialization=u1.inputString();
		System.out.println();

		System.out.print("Enter availability (1:AM   2:PM  3:both)");
		this.availability=u1.inputString();
		System.out.println();
	}

	public int getId(){
		return id;
	}

	public String getName(){
		return name;
	}

	public String getSpecialization(){
		return specialization;
	}

	public String getAvailability(){
		return availability;
	}

	public String toString(){
		return id+"     "+name+"     "+specialization+"     "+availability+"\n";
	}
}
