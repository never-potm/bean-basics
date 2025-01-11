package com.ioc.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * To promote loose coupling, we make use of an interface or an abstract class
 */
public class IOCExample {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationIoCLooseCoupling.xml");


//		IUserDataProvider userDataProvider = new UserDatabaseProvider();
		UserManager userManagerWithDB = (UserManager) context.getBean("userManagerWithUserDatabaseProvider");
		System.out.println(userManagerWithDB.getUserInfo());

//		IUserDataProvider userDataProvider2 = new WebServiceDataProvider();
		UserManager userManagerWithWS = (UserManager) context.getBean("userManagerWithWebServiceDataProvider");
		System.out.println(userManagerWithWS.getUserInfo());
	}
}
