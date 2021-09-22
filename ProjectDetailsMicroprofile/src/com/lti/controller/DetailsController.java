package com.lti.controller;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.metrics.annotation.Counted;


import com.lti.entity.Details;
import com.lti.service.DetailsServiceImpl;


@Path("/api/v1") // just a basic JAX-RS resource
@Counted // track the number of times this endpoint is invoked
@RequestScoped
public class DetailsController {
	
	@Inject
	private DetailsServiceImpl service;
	
	//http://localhost:8080/api/v1
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Details> getDetailsList()
	{
		return service.getDetails();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Details addDetail(Details d)
	{
		return service.addDetail(d);
	}
	
	
	@DELETE
	@Path("{id}")
	public String deleteFlights(@PathParam("id") int serialNo)
	{
		return service.deleteDetail(serialNo);
	}

	@PUT 
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    public boolean updateDetail(@PathParam("id") int serialNo,Details d) {  
        d.setSerialNo(serialNo);
        return service.updateDetail(d) ; 
    }  
	
	
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Details getDetailsById(@PathParam("id") int serialNo) {
		return service.getDetailById(serialNo);
	}
	

}
