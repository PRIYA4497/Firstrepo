package com.business;

public class JMSservice  implements BusinessService 
{   

@Override
public void doProcessing() {
System.out.println("JMS service");	
}
}