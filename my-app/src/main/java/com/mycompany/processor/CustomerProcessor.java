package com.mycompany.processor;

import org.springframework.batch.item.ItemProcessor;

import com.mycompany.model.Customer;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

	@Override
	public Customer process(Customer customer) throws Exception {
		System.out.println("Processing result :"+customer);
		 
        /*
         * Only return results which are equal or more than 80%
         *
         */
        if(customer.getAge() < 25){
            return null;
        }
 
        return customer;
	}

}
