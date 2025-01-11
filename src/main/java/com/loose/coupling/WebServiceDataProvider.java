package com.loose.coupling;

public class WebServiceDataProvider implements IUserDataProvider{

	@Override
	public String getUserDetails() {
		return "User details fetched from web service";
	}
}
