package com.mindtree.cafe.dto;

import java.io.Serializable;

public class CafeDto implements Serializable {

	private int id;
	private String name;
	private int revenue;
	private ManagerDto manager;
	public CafeDto() {
		super();
		
	}
	public CafeDto(int id, String name, int revenue, ManagerDto manager) {
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
	public ManagerDto getManager() {
		return manager;
	}
	public void setManager(ManagerDto manager) {
		this.manager = manager;
	}
			
}
