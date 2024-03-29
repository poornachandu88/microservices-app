package com.poorna.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/*@Entity
@Table*/
public class Organizations {

	//@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)

	private Long id;
	private String name;
	private String address;
	

	//@OneToMany(cascade = CascadeType.ALL,
	//        mappedBy = "organization", orphanRemoval = true)
	private List<Department> departments = new ArrayList<>();
//	@OneToMany(cascade = CascadeType.ALL,
	//        mappedBy = "organization", orphanRemoval = true)
	private List<Employee> employees = new ArrayList<>();

	public Organizations() {

	}
	
	public Organizations(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Organization [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
