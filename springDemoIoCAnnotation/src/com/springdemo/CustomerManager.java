package com.springdemo;

public class CustomerManager implements ICustomerService{
	
	private ICustomerDal customerDal;
	
	//constructor injection
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	

	public void add() {
		//is kuralları
		customerDal.add();
	}

}
