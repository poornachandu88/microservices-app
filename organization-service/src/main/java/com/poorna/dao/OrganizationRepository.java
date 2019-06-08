package com.poorna.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poorna.model.Organization;
import com.poorna.model.Organizations;


public interface OrganizationRepository extends JpaRepository<Organization, Long> {

	Organizations save(Organizations organization);

	
	
}
