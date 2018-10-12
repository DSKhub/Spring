package com.scp.java.spring.autowire.bytype.abstractclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestByTypeAbstactClass {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/com/scp/java/spring/autowire/bytype/abstractclass/beanByTypeAbstract.xml");
		Person p1=(Person)ctx.getBean("personRef");
		Person p2=(Person)ctx.getBean("personRef");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1==p2);
		
		AdharCardCompsite ad1=p1.getAdhar();
		AdharCardCompsite ad2=p2.getAdhar();
		System.out.println(ad1);
		System.out.println(ad2);
		System.out.println(ad1==ad2);
		
		/*AdharImpl adImp=(AdharImpl) ctx.getBean("");
		AdharCardCompsite adm=adImp.getAdhar();
		System.out.println(ad1==adm);
		System.out.println(ad2==adm);*/
	}

}
