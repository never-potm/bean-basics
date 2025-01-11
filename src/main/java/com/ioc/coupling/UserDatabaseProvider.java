package com.ioc.coupling;

public class UserDatabaseProvider implements IUserDataProvider {

	@Override
	public String getUserDetails() {
		return "User details fetched from database";
	}
}
