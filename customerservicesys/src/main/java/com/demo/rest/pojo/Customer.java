package com.demo.rest.pojo;

//@XmlRootElement


//@Document(collection="Customers")
public class Customer{
	//@Id
	//private ObjectId _id;
	private int customerId;
	private String customerName;
	private long contactNumber;
	/*
	 * private String emailId; private String dateOfBirth;
	 */
//	private Address billingAddress;
//	private Address permanentAddress;
//	private String nationality;
//	private String gender;

	/*
	 * private static int custId;
	 * 
	 * static { custId = 200; }
	 */

	public Customer(int customerId, String customerName, long contactNumber) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
	}

	public Customer() {

	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", contactNumber="
				+ contactNumber + "]";
	}

}
