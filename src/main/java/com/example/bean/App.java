package com.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		// Spring container loads spring context from application file
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");

		// We are getting the bean from application context which is identified by identifier myBean
		MyBean myBean = (MyBean) context.getBean("myBean");

		System.out.println(myBean);

	}
}
