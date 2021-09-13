package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Details;

@Repository("detailsDao")
@EnableTransactionManagement
public class DetailsDaoImpl implements DetailsDao{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Details> getDetails() {
		String sql= "SELECT d FROM Details d order by d.serialNo";
		Query q = em.createQuery(sql);
		List <Details> detailsList = q.getResultList();
		return detailsList;
	}

	@Transactional
	@Override
	public Details addDetail(Details d) {
		// TODO Auto-generated method stub
		em.persist(d);
		return d;
	}

	@Transactional
	@Override
	public String deleteDetail(int serialNo) {
		
		String sql = "SELECT d FROM Details d where d.serialNo= :serialNo";
		TypedQuery<Details> tq = em.createQuery(sql, Details.class);
		tq.setParameter("serialNo", serialNo);
		List<Details> Details = tq.getResultList();
		
		
			Details details=tq.getSingleResult();
			em.remove(details);
			
		
		return "Record Deleted";
	}

	@Transactional
	@Override
	public boolean updateDetail(Details d) {
		// TODO Auto-generated method stub
		boolean status=false;  
		em.merge(d);
		status=true;
		return status;
	}

	@Override
	public Details getDetailById(int serialNo) {
		// TODO Auto-generated method stub
		String sql = "SELECT d FROM Details d where d.serialNo= :serialNo";
		TypedQuery<Details> tq = em.createQuery(sql, Details.class);
		tq.setParameter("serialNo", serialNo );
			Details d=tq.getSingleResult();
			return d;
		
	}
	


}
