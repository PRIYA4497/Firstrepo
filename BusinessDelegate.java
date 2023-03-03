package com.business;

public class BusinessDelegate 
{
    private  LookupService ls = new LookupService();  //object of lookup service
    private BusinessService bs;  //instance of interface
    private String servicetype;
    
    public void setservicetype(String servicetype)
    {
    	this.servicetype = servicetype;
    }
    public void dotask() //method
    {
    bs = ls.getBusinessService(servicetype);
    bs.doProcessing();
    }
}
