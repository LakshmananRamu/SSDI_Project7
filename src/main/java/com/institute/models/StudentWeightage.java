package com.institute.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity (name="student_weightage")
public class StudentWeightage {
	@Id
	@Column(name = "Studentid")
	private String Studentid;
	@Column(name = "GPA")
	private int GPA;
	@Column (name="GRE")
	private int GRE;
	@Column (name="IELTSorTOEFL")
	private int IELTSorTOEFL;
	@Column (name="WorkExperience")
	private int WorkExperience;
	@Column (name="CustomQuestions")
	private int CustomQuestions;
	@Column (name="BachelorsDegree")
	private int BachelorsDegree;
	
	
	public String getStudentid() {
		return Studentid;
	}
	public void setStudentid(String Studentid) {
		this.Studentid = Studentid;
	}
	public int getGPA() {
		return GPA;
	}
	public void setGPA(int GPA) {
		this.GPA = GPA;
	}
	public int getGRE() {
		return GRE;
	}
	public void setGRE(int GRE) {
		this.GRE = GRE;
	}

	public int getIELTSorTOEFL() {
		return IELTSorTOEFL;
	}
	public void setIELTSorTOEFL(int IELTSorTOEFL) {
		this.IELTSorTOEFL = IELTSorTOEFL;
	}
	public int getWorkExperience() {
		return WorkExperience;
	}
	public void setWorkExperience(int WorkExperience) {
		this.WorkExperience = WorkExperience;
	}
	public int getCustomQuestions() {
		return CustomQuestions;
	}
	public void setCustomQuestions(int CustomQuestions) {
		this.CustomQuestions = CustomQuestions;
	}
	public int getBachelorsDegree() {
		return BachelorsDegree;
	}
	public void setBachelorsDegree(int BachelorsDegree) {
		this.BachelorsDegree = BachelorsDegree;
	}



}
