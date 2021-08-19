package com.retailer.service.rewardsprogram.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.retailer.service.rewardsprogram.model.Customer;
import com.retailer.service.rewardsprogram.service.RewardsService;

@RestController
public class RewardsController {
	
	@Autowired
	private RewardsService rewardsService;
	
	@GetMapping("/allCustomers")
	public List<Customer> findCustomerAll() {
		return rewardsService.getCustomerAll();
	}
	
	@GetMapping("/customer")
	public ResponseEntity<Customer> getCustomer(@RequestParam("id") Integer id) {
		Customer customer = rewardsService.getCustomerById(id);
		if (customer == null) 
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
	
	@GetMapping("/customerByDate")
	public ResponseEntity<Customer> getCustomerByDate(@RequestParam("id") Integer id, @RequestParam("startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date startDate, @RequestParam("endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date endDate) {
		Customer customer = rewardsService.getCustomerByDate(id, startDate, endDate);
		if (customer == null) 
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
	
	
}

