package com.bridgelabz.objectoriented;

/*
* created by: Bridge Labz
* Date 15/05/2016
*
* Perpose: Providing functionality to search.	 
**/

import java.util.ArrayList;
import com.bridgelabz.objectoriented.Doctor;
import com.bridgelabz.objectoriented.PatientsModel;

public class Search{

	//serch for doctor by name.						
	public ArrayList<Doctor> searchDoctorName(ArrayList<Doctor> doctorList,String name){

		ArrayList<Doctor> tempList=new ArrayList<Doctor>();
		for(Doctor doctor:doctorList){
			if(doctor.getName().equals(name)){
				tempList.add(doctor);
			}
		}
		return tempList;
	}

	//serch for doctor by Id.						
	public ArrayList<Doctor> searchDoctorId(ArrayList<Doctor> doctorList,int id){

		ArrayList<Doctor> tempList=new ArrayList<Doctor>();
		for(Doctor doctor:doctorList){
			if(doctor.getId()==id){
				tempList.add(doctor);
			}
		}
		return tempList;
	}

	//serch for doctor by specialization.						
	public ArrayList<Doctor> searchDoctorSpecialization(ArrayList<Doctor> doctorList,String specialization){

		ArrayList<Doctor> tempList=new ArrayList<Doctor>();
		for(Doctor doctor:doctorList){
			if(doctor.getSpecialization().equals(specialization)){
				tempList.add(doctor);
			}
		}
		return tempList;
	}

	//serch for doctor by specialization.						
	public ArrayList<Doctor> searchDoctorAvailability(ArrayList<Doctor> doctorList,String availability){

		ArrayList<Doctor> tempList=new ArrayList<Doctor>();
		for(Doctor doctor:doctorList){
			if(doctor.getAvailability().equals(availability)){
				tempList.add(doctor);
			}
		}
		return tempList;
	}

	//serch for Patients by mobileNumber.						
	public ArrayList<PatientsModel> searchPatientMobileNumber(ArrayList<PatientsModel> patientList,String mobileNumber){

		ArrayList<PatientsModel> tempList=new ArrayList<PatientsModel>();
		for(PatientsModel patient:patientList){
			if(patient.getmobileNumber().equals(mobileNumber)){
				tempList.add(patient);
			}
		}
		return tempList;
	}

	//serch for Patients by id.						
	public ArrayList<PatientsModel> searchPatientId(ArrayList<PatientsModel> patientList,int id){

		ArrayList<PatientsModel> tempList=new ArrayList<PatientsModel>();
		for(PatientsModel patient:patientList){
			if(patient.getId()==id){
				tempList.add(patient);
			}
		}
		return tempList;
	}

	//serch for Patients by age.						
	public ArrayList<PatientsModel> searchPatientAge(ArrayList<PatientsModel> patientList,int age){

		ArrayList<PatientsModel> tempList=new ArrayList<PatientsModel>();
		for(PatientsModel patient:patientList){
			if(patient.getAge()==age){
				tempList.add(patient);
			}
		}
		return tempList;
	}
}
