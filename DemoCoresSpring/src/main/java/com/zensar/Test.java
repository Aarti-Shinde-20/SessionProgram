package com.zensar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("springconfig2.xml");
		
		Student ob=(Student) container.getBean("s1");
		System.out.println(ob);
		 

	}
}

