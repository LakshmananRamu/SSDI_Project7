package com.institute.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name="cs")
public class csdepartment {

	@Id
	@Column(name = "Emailid")
	private String Emailid;
	@Column(name = "ques1")
	private int ques1;
	@Column(name = "ques2")
	private int ques2;
	@Column(name = "ques3")
	private int ques3;
	@Column(name = "ques4")
	private int ques4;
	@Column(name = "ques5")
	private int ques5;
	@Column (name="card")
	private long card;
	@Column (name="status")
	private int status;
	
	
	public long getCard() {
		return card;
	}
	public void setCard(long card) {
		this.card = card;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getEmailid() {
		return Emailid;
	}
	public void setEmailid(String emailid) {
		Emailid = emailid;
	}
	public int getQues1() {
		return ques1;
	}
	public void setQues1(int ques1) {
		this.ques1 = ques1;
	}
	public int getQues2() {
		return ques2;
	}
	public void setQues2(int ques2) {
		this.ques2 = ques2;
	}
	public int getQues3() {
		return ques3;
	}
	public void setQues3(int ques3) {
		this.ques3 = ques3;
	}
	public int getQues4() {
		return ques4;
	}
	public void setQues4(int ques4) {
		this.ques4 = ques4;
	}
	public int getQues5() {
		return ques5;
	}
	public void setQues5(int ques5) {
		this.ques5 = ques5;
	}	
	
}
