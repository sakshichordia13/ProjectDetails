package com.lti.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import com.lti.dao.DetailsDao;
import com.lti.entity.Details;

@ApplicationScoped
public class DetailsServiceImpl implements DetailsService{

	@Inject
	private DetailsDao dao;

	@Override
	public List<Details> getDetails() {
		// TODO Auto-generated method stub
		return dao.getDetails();
	}

	@Override
	public Details addDetail(Details d) {
		// TODO Auto-generated method stub
		return dao.addDetail(d);
	}

	@Override
	public String deleteDetail(int serialNo) {
		// TODO Auto-generated method stub
		return dao.deleteDetail(serialNo);
	}

	@Override
	public boolean updateDetail(Details d) {
		// TODO Auto-generated method stub
		return dao.updateDetail(d);
	}

	@Override
	public Details getDetailById(int serialNo) {
		// TODO Auto-generated method stub
		return dao.getDetailById(serialNo);
	}
}
