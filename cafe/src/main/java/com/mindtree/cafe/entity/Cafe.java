package com.mindtree.cafe.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Cafe {
@Id
	private int id;
	private String name;
	private int revenue;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="Manager_id")
     private Manager manager;


	public Cafe() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Cafe(int id, String name, int revenue, Manager manager) {
		super();
		this.id = id;
		this.name = name;
		this.revenue = revenue;
		this.manager = manager;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRevenue() {
		return revenue;
	}


	public void setRevenue(int revenue) {
		this.revenue = revenue;
	}


	public Manager getManager() {
		return manager;
	}


	public void setManager(Manager manager) {
		this.manager = manager;
	}


}