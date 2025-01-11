package com.tight.coupling;

public class UserDatabase {

	public String getUserDetails() {
		// database is accessed directly
		return "User Details returned from database";
	}
}
