package com.lti.service;

import java.util.List;

import com.lti.entity.Details;


public interface DetailsService {

	public List<Details> getDetails();
	public Details addDetail(Details d);
	public String deleteDetail(int serialNo);
	public boolean updateDetail(Details d);
	public Details getDetailById(int serialNo);

}
