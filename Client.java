package com.business;

public class Client 
{

	BusinessDelegate bd;
	public Client(BusinessDelegate bd)//constructor
	
	{
		this.bd = bd;
	}
	public void dotask()
	{
		bd.dotask();
	}
}
