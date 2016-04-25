package com.institute.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity (name="student_status")

public class StudentStatus {
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "DeptId")
	private int DeptId;
	@Column (name="emailid")
	private String emailid ;
	@Column (name="Status")
	private String Status;
	@Column (name="offer")
	private String offer;
	@Column (name="mailsent")
	private String mailsent;
	
	public int getDeptid() {
		return DeptId;
	}
	public void setDeptid(int DeptId) {
		this.DeptId = DeptId;
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}

	public String getemailid() {
		return emailid;
	}
	public void setemailid(String emailid) {
		this.emailid = emailid;
	}
	public String getStatus() {
		return Status;
	}
	public void setCutoff(String Status) {
		this.Status = Status;
	}
	public String getoffer() {
		return offer;
	}
	public void setoffer(String offer) {
		this.offer = offer;
	}
	public String getmailsent() {
		return mailsent;
	}
	public void setmailsent(String mailsent) {
		this.mailsent = mailsent;
	}
}
