package com.samik.resource;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.samik.dao.CustomerRepository;
import com.samik.model.Customer;

@RestController
@RequestMapping(value = "/rest/customers")
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerResource {
	
	@Autowired
	CustomerRepository customerRepository;

	@GetMapping(value = "/all")
	public List<Customer> getAll() {
		return customerRepository.findAll();
	}

	@GetMapping(value = "/all/{id}")
	public Customer getCustomerById(@PathVariable("id") Integer id) {
		return customerRepository.getCustomerById(id);
	}

	@PostMapping(value = "/load")
	public void persist(@RequestBody final Customer customer) {
		Customer customerSaved = customerRepository.saveAndFlush(customer);
		System.out.println(customerSaved.getDate());
	}

	@DeleteMapping(value = "/delete/{id}")
	public void deleteCustomer(@PathVariable("id") Integer id) {
		customerRepository.delete(id);
	}
}
