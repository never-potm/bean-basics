package com.tight.coupling;

/*
* UserManager is tightly coupled with UserDatabase.
* So, if our application wants to evolve then changing the database will require a lot of efforts
* */
public class TightCouplingExample {
	public static void main(String[] args) {
		UserManager userManager = new UserManager();
		System.out.println(userManager.getUserInfo());
	}
}
