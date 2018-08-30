package com.demo.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerWebsiteController {

	@RequestMapping("/home")
	public String home() {
		System.out.println("home");
		return "home";
	}
	
/*	@RequestMapping("/error")
	public String error() {
		System.out.println("error");
		return "error";
	}*/

	/*@RequestMapping(value = "/customer/add", method = RequestMethod.POST)
	public String addCustomer(@RequestBody Customer customer) {
		RestTemplate restTemplate = new RestTemplate();
		Customer cust = restTemplate.getForObject("http://localhost:8080/customer/add", Customer.class, 2);
		return "addCustomer";

	}
	
	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public String viewAllCustomers() {
		RestTemplate restTemplate = new RestTemplate();
		List<Customer> cust = restTemplate.getForObject("http://localhost:8080/customers", ArrayList.class, 2);
		return "viewAllCustomers";

	}
	
	@RequestMapping(value = "/customers/{start}/{count}", method = RequestMethod.GET)
	public String viewAllCustomersBetween(@PathVariable("start") int start, @PathVariable("count") int count) {
		RestTemplate restTemplate = new RestTemplate();
		Resources cust = restTemplate.getForObject("http://localhost:8080/customers/{start}/{count}", Resources.class, 2);
		return "viewAllCustomersBetween";

	}
	
	@RequestMapping(value = "/customer/update", method = RequestMethod.PUT)
	public String updateCustomer(@PathVariable("start") int start, @PathVariable("count") int count) {
		RestTemplate restTemplate = new RestTemplate();
		Resources cust = restTemplate.getForObject("http://localhost:8080/customer/update", Resources.class, 2);
		return "viewAllCustomersBetween";

	}
	*/

	
	/*@RequestMapping(value = "/customers/{start}/{count}", method = RequestMethod.GET)
	public String viewAllCustomersBetween(@PathVariable("start") int start, @PathVariable("count") int count) {
		RestTemplate restTemplate = new RestTemplate();
		Resources cust = restTemplate.getForObject("http://localhost:8080/customers/{start}/{count}", Resources.class, 2);
		return "viewAllCustomersBetween";

	}
	
	@RequestMapping(value = "/customers/{start}/{count}", method = RequestMethod.GET)
	public String viewAllCustomersBetween(@PathVariable("start") int start, @PathVariable("count") int count) {
		RestTemplate restTemplate = new RestTemplate();
		Resources cust = restTemplate.getForObject("http://localhost:8080/customers/{start}/{count}", Resources.class, 2);
		return "viewAllCustomersBetween";

	}*/
}
