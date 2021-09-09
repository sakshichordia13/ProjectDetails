package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.DetailsDao;
import com.lti.entity.Details;

@Service("projectDetails")
public class DetailsServiceImpl implements DetailsService{

	@Autowired
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
