package com.retailer.service.rewardsprogram.service;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retailer.service.rewardsprogram.model.Customer;
import com.retailer.service.rewardsprogram.model.MyTransaction;

@Service
public class RewardsService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	
	public List<Customer> getCustomerAll() {
		return customerRepository.findAll();
	}
	
	public Customer getCustomerById(Integer customerId) {
		return customerRepository.findById(customerId).orElse(null);
	}
	
	public Customer getCustomerByDate(Integer customerId, Date startDate, Date endDate) {
		Customer cust = customerRepository.findById(customerId).orElse(null);
		Set<MyTransaction> transactions = cust.getTransactions();
		cust.setTransactions(transactions.stream()
        .filter(trans -> (trans.getSaveDate().after(startDate) && trans.getSaveDate().before(endDate)))
        .collect(Collectors.toCollection(HashSet::new)));
		return cust;
	}

}
