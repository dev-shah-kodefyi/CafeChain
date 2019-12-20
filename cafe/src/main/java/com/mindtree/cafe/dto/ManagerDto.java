package com.mindtree.cafe.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class ManagerDto implements Serializable {

	private static final long serialVersionUID = -6431168011471334362L;
	private int mid;
	private String name;
	private int salary;
	@JsonIgnoreProperties(value= {"manager"})
	 List<CafeDto> cafelist=new ArrayList<>();
	public ManagerDto() {
		super();
		
	}
	public ManagerDto(int mid, String name, int salary, List<CafeDto> cafelist) {
		super();
		this.mid = mid;
		this.name = name;
		this.salary = salary;
		this.cafelist = cafelist;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public List<CafeDto> getCafelist() {
		return cafelist;
	}
	public void setCafelist(List<CafeDto> cafelist) {
		this.cafelist = cafelist;
	}
	

}
