package com.bootcamp.service;

import java.util.List;

import com.bootcamp.model.Lead;

public interface LeadService {
	boolean saveLead(Lead lead);

	List<Lead> getLeads();


}
