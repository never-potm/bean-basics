package com.loose.coupling;

/**
 * To promote loose coupling, we make use of an interface or an abstract class
 *
 */
public class LooseCouplingExample {
	public static void main(String[] args) {
		IUserDataProvider userDataProvider = new UserDatabaseProvider();
		UserManager userManagerWithDB = new UserManager(userDataProvider);
		System.out.println(userManagerWithDB.getUserInfo());

		IUserDataProvider userDataProvider2 = new WebServiceDataProvider();
		UserManager userManagerWithWS = new UserManager(userDataProvider2);
		System.out.println(userManagerWithWS.getUserInfo());
	}
}
