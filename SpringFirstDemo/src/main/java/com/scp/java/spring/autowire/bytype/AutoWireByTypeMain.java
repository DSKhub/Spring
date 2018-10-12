package com.scp.java.spring.autowire.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireByTypeMain {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/scp/java/spring/autowire/bytype/beanByType.xml");
		Student stud1=(Student)context.getBean("studRef");
		System.out.println(stud1);
		
		Student stud2=(Student)context.getBean("studRef");
		System.out.println(stud2);
		
		System.out.println(stud1==stud2);
		
	}

}
