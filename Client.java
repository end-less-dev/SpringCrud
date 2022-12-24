package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class Client {

	public static void main(String... args) {
		Emp e = new Emp();
		e.setName("java");
		e.setCompnay("Arete");
		e.setId(13);
		System.out.println(e);
		
		//Spriny way / IOC
		Resource resource = new ClassPathResource("employee.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Emp e1 = (Emp)factory.getBean("emp1");
		Emp e2 = factory.getBean("emp2",Emp.class);
		
		System.out.println("emp1 details "+e1);
		System.out.println("emp2 details "+e2);
		
		
		

	}

}
