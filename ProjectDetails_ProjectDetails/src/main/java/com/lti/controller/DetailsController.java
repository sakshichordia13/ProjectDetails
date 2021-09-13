package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.Details;
import com.lti.service.DetailsServiceImpl;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
public class DetailsController {
	
	@Autowired
	private DetailsServiceImpl service;
	
	//http://localhost:8090/api/v1/details
	@GetMapping("/details")
	public List<Details> getDetailsList()
	{
		return service.getDetails();
	}
	
	//http://localhost:8090/api/v1/addDetail
	@PostMapping("/addDetail")
	public Details addDetail(@RequestBody Details d)
	{
		return service.addDetail(d);
	}
	
	//http://localhost:8090/api/v1/deleteDetail/{id}
	@DeleteMapping("/deleteDetail/{id}")
	public String deleteFlights(@PathVariable(value="id") int serialNo)
	{
		return service.deleteDetail(serialNo);
	}
	
	//http://localhost:8090/api/v1/updateDetail/{id}
	@PutMapping("updateDetail/{id}")  
    public boolean updateDetail(@PathVariable("id") int serialNo,@RequestBody Details d) {  
        d.setSerialNo(serialNo);
        return service.updateDetail(d) ; 
    }  
	
	//http://localhost:8090/api/v1/getDetail/{id}
	@GetMapping("/getDetail/{id}")
	public Details getDetailsById(@PathVariable(value="id") int serialNo) {
		return service.getDetailById(serialNo);
	}

}
