package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="hospital")
public class entity {
	@Id
	@Column(name="Patientid")
	private int Patientid;
	@Column(name="Patientname")
	private String Patientname;
	@Column(name="Age")
	private int Age;
	@Column(name="Disease")
	private String Disease;
	@Column(name="Attendername")
	private String Attendername;
	@Column(name="Doctorname")
	private String Doctorname;
	@Column(name="Status")
	private String	Status;
	
	
	
	public entity() {
	}



	public entity(int patientid, String patientname, int age, String disease, String attendername, String doctorname,
			String status) {
		super();
		Patientid = patientid;
		Patientname = patientname;
		Age = age;
		Disease = disease;
		Attendername = attendername;
		Doctorname = doctorname;
		Status = status;
	}



	public int getPatientid() {
		return Patientid;
	}



	public void setPatientid(int patientid) {
		Patientid = patientid;
	}



	public String getPatientname() {
		return Patientname;
	}



	public void setPatientname(String patientname) {
		Patientname = patientname;
	}



	public int getAge() {
		return Age;
	}



	public void setAge(int age) {
		Age = age;
	}



	public String getDisease() {
		return Disease;
	}



	public void setDisease(String disease) {
		Disease = disease;
	}



	public String getAttendername() {
		return Attendername;
	}



	public void setAttendername(String attendername) {
		Attendername = attendername;
	}



	public String getDoctorname() {
		return Doctorname;
	}



	public void setDoctorname(String doctorname) {
		Doctorname = doctorname;
	}



	public String getStatus() {
		return Status;
	}



	public void setStatus(String status) {
		Status = status;
	}



	public String toString() {
		return "Patient_id="+Patientid+"Patient_name="+Patientname+"Age="+Age+"Disease="+Disease;
	}
	
}
