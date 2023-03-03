package com.business;

public class LookupService 
{
public BusinessService getBusinessService(String servicetype)
{
	if(servicetype.equalsIgnoreCase("EJB"))
	{
		return new EJBservice();
	}
	else
	{
		return new JMSservice();
	}
}
}
