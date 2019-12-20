package com.mindtree.cafe.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;

@JsonIgnoreType
@Entity
public class Manager {
@Id
	private int mid;
	private String name;
	private int salary;
	@JsonIgnoreProperties(value= {"manager"})
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy="manager")
	 List<Cafe> cafelist=new ArrayList<>();

	public Manager() {
		super();
		
	}

	public Manager(int mid, String name, int salary, List<Cafe> cafelist) {
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

	public List<Cafe> getCafelist() {
		return cafelist;
	}

	public void setCafelist(List<Cafe> cafelist) {
		this.cafelist = cafelist;
	}
	
	
}