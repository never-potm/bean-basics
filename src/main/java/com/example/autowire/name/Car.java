package com.example.autowire.name;

public class Car {

	// Autowire by name will try to find a bean by name = "specification"
	private Specification specification;

	// constructor wont be needed as it wont be used. The initialisation would be done by a setter.
	//	public Car(Specification specification) {
	//		this.specification = specification;
	//	}

	public void setSpecification(Specification specification) {
		this.specification = specification;
	}

	public void displayDetails() {
		System.out.println("Car details: " + specification.toString());
	}
}
