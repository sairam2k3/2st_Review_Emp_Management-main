package com.example.demo.modelproject;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="employeedetails")
public class ModelSeat {
	@Id
	private int empid;
	private String empname;
	private int age;
	private long salary;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="fk")
	private List<SeatModel>empadddetails;
	public List<SeatModel> getempadddetails(){
		return empadddetails;
	}
	public void setempadddetails (List<SeatModel>empadddetails) {
		this.empadddetails=empadddetails;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public ModelSeat(int empid, String empname, int age, long salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.age = age;
		this.salary = salary;
	}
	public ModelSeat() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}