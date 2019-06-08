package com.poorna.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poorna.model.Department;
import com.poorna.model.Departments;


public interface DepartmentRepository extends JpaRepository<Department, Long> {

	List<Departments> findByOrganizationId(Long organizationId);



	
	
	
	
	
	
}
