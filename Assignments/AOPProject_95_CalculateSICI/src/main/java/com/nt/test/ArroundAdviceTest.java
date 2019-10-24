package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankServiceProxy;

public class ArroundAdviceTest {

	public static void main(String[] args) {
       ApplicationContext ctx=null;
	   BankServiceProxy proxy=null;
       
	   //Create IOC container
       ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
       
       //Get Proxy class obj
       proxy=ctx.getBean("pfb",BankServiceProxy.class);
       
       //Invoke the methods
       System.out.println("SimpleIntrestAmount "+proxy.calcSimpleIntrestAmount(15000, 2, 12));
       
       System.out.println("--------------------------------------");
       
       System.out.println("CompoundIntrestAmount "+proxy.calcCompoundIntrestAmount(15000, 2, 12));
       
       //Close Container
       ((AbstractApplicationContext) ctx).close();
		
	}//main

}//class
