package com.institute.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity (name="student_vacancies")

public class StudentVacancies {
	@Id
	@Column(name = "Dept_ID")
	private int Dept_ID;
	@Column (name="StudentVacancies")
	private int StudentVacancies ;
	@Column (name="Cutoff")
	private int Cutoff;
	
	public int getDeptid() {
		return Dept_ID;
	}
	public void setDeptid(int Dept_ID) {
		this.Dept_ID = Dept_ID;
	}
	public int getStudentVacancies() {
		return StudentVacancies;
	}
	public void setStudentVacancies(int StudentVacancies) {
		this.StudentVacancies = StudentVacancies;
	}
	public int getCutoff() {
		return Cutoff;
	}
	public void setCutoff(int Cutoff) {
		this.Cutoff = Cutoff;
	}
}
