package com.springcore.springcore1;
	// MainProgram.java
	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class MainProgram {
	    public static void main(String[] args) {
	        // Load the Spring configuration file
	        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

	        // Retrieve the Driver bean from the container
	        Driver driver = (Driver) context.getBean("driver");

	        // Use the Driver bean
	        driver.drive();
	    }
	}
