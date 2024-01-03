package com.springcore.SetterDep;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String configs = "com/springcore/SetterDep/beans.xml";
		ApplicationContext con = new ClassPathXmlApplicationContext(configs);
		Stud obj =(Stud) con.getBean("StuID");
		obj.Show();
		
		

	}

}
