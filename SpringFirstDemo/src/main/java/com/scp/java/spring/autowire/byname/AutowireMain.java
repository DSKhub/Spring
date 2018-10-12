package com.scp.java.spring.autowire.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireMain {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/scp/java/spring/autowire/byname/beanAutowire.xml");
		Laptop lap1=(Laptop)context.getBean("LaptopRef");
		//VendorLaptop vedLap1=lap1.getVedlap();
		
		System.out.println(lap1);
	}

}
