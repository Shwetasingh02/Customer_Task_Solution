package com.Cus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.model.Customer;

public class SortByName {
	public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
           
            customerList.add(new Customer(1, "Shweta", "Jamshedpur", 93567.55,sdf.parse("1998-02-17")));
            customerList.add(new Customer(2, "Rahul", "Delhi", 50234.75,sdf.parse("1995-08-12")));
            customerList.add(new Customer(3, "Sneha", "Mumbai", 85000.00,sdf.parse("1993-11-30")));
            customerList.add(new Customer(4, "Amit", "Kolkata", 76000.85,sdf.parse("1990-05-21")));
            customerList.add(new Customer(5, "Pooja", "Bangalore", 89000.95,sdf.parse("1996-09-15")));
            customerList.add(new Customer(6, "Vikas", "Chennai", 74200.50, sdf.parse("1992-03-10")));
            customerList.add(new Customer(7, "Kiran", "Hyderabad", 78000.65, sdf.parse("1991-07-25")));
            customerList.add(new Customer(8, "Megha", "Pune", 61000.20, sdf.parse("1994-04-18")));
            customerList.add(new Customer(9, "Suresh", "Ahmedabad", 53000.00, sdf.parse("1997-12-22")));
            customerList.add(new Customer(10, "Rina", "Gurgaon", 92000.30, sdf.parse("1999-10-05")));
        } catch (ParseException e) {
            e.printStackTrace();
        }
	
    Collections.sort(customerList,(c1,c2)->{
    	return c1.getCustName().compareTo(c2.getCustName());
    });
    customerList.forEach(x->{
    	System.out.println(x);
    });
	}
}
