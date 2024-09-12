package com.tnsif.sm.store;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity

public class Store {
   
	private Integer storeid;
	private String name;
	private String category;
	private String contactInfo;
	private String location;
	private String operatingHours;
	
	//Constructor
	public Store()
	{
		
	}
	
	public Store(Integer storeid, String name, String category, String contactInfo, String location,
			String operatingHours) {
		
		this.storeid = storeid;
		this.name = name;
		this.category = category;
		this.contactInfo = contactInfo;
		this.location = location;
		this.operatingHours = operatingHours;
	}

	//Getters and setters
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getStoreid() {
		return storeid;
	}

	public void setStoreid(Integer storeid) {
		this.storeid = storeid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getOperatingHours() {
		return operatingHours;
	}

	public void setOperatingHours(String operatingHours) {
		this.operatingHours = operatingHours;
	}
	
	
	
	
	
	
}

