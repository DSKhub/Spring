package com.scp.java.spring.scopeofspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/scp/java/spring/scopeofspring/beanscope.xml");
		
		Product p1 = (Product) context.getBean("ProdRef");
		Vendor v1=p1.getVendorob();
		Vendor v11=(Vendor)context.getBean("VendRef");
		System.out.println(p1);
		System.out.println(v1);
		System.out.println(v11);
		
		Product p2 = (Product) context.getBean("ProdRef");
		Vendor v2=p2.getVendorob();
		Vendor v12=(Vendor)context.getBean("VendRef");
		System.out.println(p2);
		System.out.println(v2);
		System.out.println(v12);
		
		
		System.out.println(p1==p2);
		System.out.println(v1==v2);
		System.out.println(v11==v12);
		
		Product p3=(Product)context.getBean("ProdRef1");
		Vendor v3=p3.getVendorob();
		System.out.println(p3);
		
		System.out.println(p3==p2);
		System.out.println(v3==v2);
		System.out.println((p1==p2) && (p1==p3));
		
		Product p4=(Product)context.getBean("ProdRef2");
		Vendor v4=p4.getVendorob();
		System.out.println(p4);
	}

}
