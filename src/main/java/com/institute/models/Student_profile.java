package com.institute.models;
import javax.persistence.*;

@Entity (name="studentprofile")
public class Student_profile {
	
	@Id
	@Column(name = "Emailid")
	private String Emailid;
	@Column(name = "firstname")
	private String firstname;
	@Column (name="lastname")
	private String lastname;
	@Column(name = "salutation")
	private String salutation;
	@Column(name = "prefname")
	private String prefname;
	@Column (name="sex")
	private String sex;
	@Column(name = "dob")
	private String dob;
	@Column(name = "country")
	private String country;
	@Column(name = "state")
	private String state;
	@Column (name="postal")
	private String postal;
	@Column (name="phone")
	private String phone;
	@Column(name = "add1")
	private String add1;
	@Column(name = "add2")
	private String add2;
	@Column (name="city")
	private String city;
	@Column(name="TOFEL")
	private double TOFEL;
	@Column(name="IELTS")
	private double IELTS;
	@Column(name="GRE")
	private double GRE;
	@Column(name="GPA")
	private double GPA;
	@Column(name="grad_from")
	private String grad_from;
	@Column (name="college")
	private String college;
	@Column(name="grad_to")
	private String grad_to;
	@Column(name = "degree")
	private String degree;
	@Column(name = "major")
	private String major;
	@Column(name = "empstatus")
	private String emp_status;
	@Column(name = "position")
	private String pos;
	@Column(name = "workedcountry")
	private String con;
	@Column(name = "firm")
	private String firm;
	public String getFirm() {
		return firm;
	}
	public void setFirm(String firm) {
		this.firm = firm;
	}
	@Column(name = "experience")
	private double exp;
	@Column(name = "completed")
	private int completed;
	
	
	
	
	public int getCompleted() {
		return completed;
	}
	public void setCompleted(int completed) {
		this.completed = completed;
	}
	public String getEmp_status() {
		return emp_status;
	}
	public void setEmp_status(String emp_status) {
		this.emp_status = emp_status;
	}
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}
	public String getCon() {
		return con;
	}
	public void setCon(String con) {
		this.con = con;
	}
	public double getExp() {
		return exp;
	}
	public void setExp(double exp) {
		this.exp = exp;
	}
	public double getTOFEL() {
		return TOFEL;
	}
	public void setTOFEL(double tOFEL) {
		TOFEL = tOFEL;
	}
	public double getIELTS() {
		return IELTS;
	}
	public void setIELTS(double iELTS) {
		IELTS = iELTS;
	}
	public double getGRE() {
		return GRE;
	}
	public void setGRE(double gRE) {
		GRE = gRE;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}

	public String getGrad_from() {
		return grad_from;
	}
	public void setGrad_from(String grad_from) {
		this.grad_from = grad_from;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getGrad_to() {
		return grad_to;
	}
	public void setGrad_to(String grad_to) {
		this.grad_to = grad_to;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostal() {
		return postal;
	}
	public void setPostal(String postal) {
		this.postal = postal;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAdd1() {
		return add1;
	}
	public void setAdd1(String add1) {
		this.add1 = add1;
	}
	public String getAdd2() {
		return add2;
	}
	public void setAdd2(String add2) {
		this.add2 = add2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Column (name="month")
	
	
	public String getEmailid() {
		return Emailid;
	}
	public void setEmailid(String emailid) {
		Emailid = emailid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getSalutation() {
		return salutation;
	}
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
	public String getPrefname() {
		return prefname;
	}
	public void setPrefname(String prefname) {
		this.prefname = prefname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
}
