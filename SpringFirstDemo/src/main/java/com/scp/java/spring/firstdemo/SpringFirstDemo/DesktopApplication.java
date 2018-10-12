package com.scp.java.spring.firstdemo.SpringFirstDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class DesktopApplication {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/com/scp/java/spring/firstdemo/SpringFirstDemo/bean.xml");
		Employee empobj1=(Employee) ctx.getBean("EmpRef");
		Address add1=empobj1.geteAdd();
		System.out.println("Employee 1:"+empobj1);
		System.out.println("Address 1:"+add1);
		
		Employee empobj2=(Employee) ctx.getBean("EmpRef");
		Address add2=empobj2.geteAdd();
		System.out.println("Employee Context 2 :"+empobj2);
		System.out.println("Address 2:"+add2);
		
		System.out.println(empobj1==empobj2);
		System.out.println(add1==add2);
		
		
		
		
		/*BeanFactory bContext=new XmlBeanFactory(new ClassPathResource("/com/scp/java/spring/firstdemo/SpringFirstDemo/bean.xml"));
		Employee empobj2=(Employee) bContext.getBean("EmpRef");
		System.out.println("Object Using BeanFactory :"+empobj2);*/
	}

}

