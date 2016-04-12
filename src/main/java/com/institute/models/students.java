package com.institute.models;
import javax.persistence.*;

@Entity (name="studentlogindetails")
public class students {
	
	@Id
	@Column(name = "Emailid")
	private String Emailid;
	@Column(name = "Password")
	private String Password;
	@Column (name="Name")
	private String Name;
	@Column (name="Gender")
	private String Gender;
	
	
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getEmailid() {
		return Emailid;
	}
	public void setEmailid(String emailid) {
		Emailid = emailid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	

}
