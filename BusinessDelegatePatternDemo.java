package com.business;

public class BusinessDelegatePatternDemo {

	public static void main(String[] args) 
	{
		BusinessDelegate bd = new BusinessDelegate();
		bd.setservicetype("EJB");
		
		Client c = new Client(bd);
		c.dotask();
		
		bd.setservicetype("Jms");
		c.dotask();
	
	}

}
