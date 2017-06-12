package com.mycompany.app;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.validation.BindException;

import com.mycompany.model.Customer;

public class CustomerFieldSetMapper implements RowMapper<Customer> {


	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer customer = new Customer();
		customer.setCustId(rs.getInt("cust_id"));
		customer.setName(rs.getString("name"));
		customer.setAge(rs.getInt("age"));
		return customer;
	} 
}
