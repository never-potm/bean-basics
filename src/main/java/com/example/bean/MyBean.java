package com.example.bean;

public class MyBean {

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Message is " + message);
	}

	@Override
	public String toString() {
		return "MyBean{" +
				"message='" + message + '\'' +
				'}';
	}
}
