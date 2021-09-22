package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;


import com.lti.entity.Details;


public class DetailsDaoImpl implements DetailsDao{

	@PersistenceContext
	private EntityManager em;
	
	//@Autowired
	//DetailsDao dao;
	
	@Override
	public List<Details> getDetails() {
		String sql= "SELECT d FROM Details d order by d.serialNo";
		Query q = em.createQuery(sql);
		List <Details> detailsList = q.getResultList();
		return detailsList;
		
		//return dao.findAll();
		
		
	}

	
	@Override
	public Details addDetail(Details d) {
		// TODO Auto-generated method stub
		em.persist(d);
		return d;
		
		//dao.save(d);
		//return d;
	}

	
	@Override
	public String deleteDetail(int serialNo) {
		
		String sql = "SELECT d FROM Details d where d.serialNo= :serialNo";
		TypedQuery<Details> tq = em.createQuery(sql, Details.class);
		tq.setParameter("serialNo", serialNo);
		List<Details> Details = tq.getResultList();
		
		
			Details details=tq.getSingleResult();
			em.remove(details);
			
		
		return "Record Deleted";
		
		//Details details=dao.findById(serialNo).get();
		//dao.delete(details);
		//return "Record Deleted";
	}

	
	@Override
	public boolean updateDetail(Details d) {
		// TODO Auto-generated method stub
		boolean status=false;  
		em.merge(d);
		status=true;
		return status;
		
		//boolean status=false;
		//Details details=dao.findById(d.getSerialNo());
		//details=d;
		//dao.save(details);
		//status=true;
		//return status;
	}

	@Override
	public Details getDetailById(int serialNo) {
		// TODO Auto-generated method stub
		String sql = "SELECT d FROM Details d where d.serialNo= :serialNo";
		TypedQuery<Details> tq = em.createQuery(sql, Details.class);
		tq.setParameter("serialNo", serialNo );
			Details d=tq.getSingleResult();
			return d;
			
			//return dao.findById(serialNo).get();
		
	}
	


}
