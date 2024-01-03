package com.springcore.springcore1;

//Driver.java
public class Driver {
 private Car car;

 // IoC: Dependency is injected through constructor
 public Driver(Car car) {
     this.car = car;
 }

 public void drive() {
     System.out.println("Driving a " + car.getBrand() + " car");
 }
}

