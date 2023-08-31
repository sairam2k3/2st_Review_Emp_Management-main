package com.example.demo.modelproject;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class SeatModel {
	@Id
	private long empaltermobnum;
	private String state;
	private String city;
	@JsonFormat(pattern = "HH:mm:ss")
	private Date intime;
	@JsonFormat(pattern = "HH:mm:ss")
	private Date outtime;
	public long getEmpaltermobnum() {
		return empaltermobnum;
	}
	public void setEmpaltermobnum(long empaltermobnum) {
		this.empaltermobnum = empaltermobnum;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Date getIntime() {
		return intime;
	}
	public void setIntime(Date intime) {
		this.intime = intime;
	}
	public Date getOuttime() {
		return outtime;
	}
	public void setOuttime(Date outtime) {
		this.outtime = outtime;
	}
	public SeatModel(long empaltermobnum, String state, String city, Date intime, Date outtime) {
		super();
		this.empaltermobnum = empaltermobnum;
		this.state = state;
		this.city = city;
		this.intime = intime;
		this.outtime = outtime;
	}
	public SeatModel() {
		super();
		// TODO Auto-generated constructor stub
	}

}
