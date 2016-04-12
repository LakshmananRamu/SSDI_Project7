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
	@Column (name="suffix")
	private String suffix;
	@Column(name = "salutation")
	private String salutation;
	@Column(name = "prefname")
	private String prefname;
	@Column (name="sex")
	private String sex;
	@Column (name="month")
	private int month;
	@Column (name="date")
	private int date;
	@Column (name="year")
	private int year;
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
	@Column(name="grad_from_m")
	private double grad_from_m;
	@Column(name="grad_from_y")
	private double grad_from_y;
	@Column(name="grad_to_m")
	private double grad_to_m;
	@Column(name="grad_to_y")
	private double grad_to_y;
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
	@Column(name = "experience")
	private double exp;
	@Column(name = "completed")
	private int completed;
	@Column(name = "custom1")
	private String custom1;
	@Column(name = "custom2")
	private String custom2;
	@Column(name = "custom3")
	private String custom3;
	@Column(name = "custom4")
	private String custom4;
	@Column(name = "custom5")
	private String custom5;
	
	
	
	
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
	public double getGrad_from_m() {
		return grad_from_m;
	}
	public void setGrad_from_m(double grad_from_m) {
		this.grad_from_m = grad_from_m;
	}
	public double getGrad_from_y() {
		return grad_from_y;
	}
	public void setGrad_from_y(double grad_from_y) {
		this.grad_from_y = grad_from_y;
	}
	public double getGrad_to_m() {
		return grad_to_m;
	}
	public void setGrad_to_m(double grad_to_m) {
		this.grad_to_m = grad_to_m;
	}
	public double getGrad_to_y() {
		return grad_to_y;
	}
	public void setGrad_to_y(double grad_to_y) {
		this.grad_to_y = grad_to_y;
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
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
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
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getcustom1() {
		return custom1;
	}
	public void setcustom1(String custom1) {
		this.custom1 = custom1;
	}
	public String getcustom2() {
		return custom1;
	}
	public void setcustom2(String custom2) {
		this.custom2 = custom2;
	}
	public String getcustom3() {
		return custom3;
	}
	public void setcustom3(String custom3) {
		this.custom3 = custom3;
	}
	public String getcustom4() {
		return custom4;
	}
	public void setcustom4(String custom4) {
		this.custom4 = custom4;
	}
	public String getcustom5() {
		return custom1;
	}
	public void setcustom5(String custom5) {
		this.custom5 = custom5;
	}

}
