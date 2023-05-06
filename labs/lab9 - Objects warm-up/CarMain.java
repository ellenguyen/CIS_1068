// Linh Nguyen - Section 002
// Assignment 9: Objects
// Date: Tuesday, March 29th
// File: Test Car.java

package asm9;

public class CarMain {

	public static void main(String[] args) {
		Car oldJunker = new Car("Ford", "Pinto", 1972, 17.5, 132480, 12, 8);
		oldJunker.drive(5); // drive the car 5 miles
		oldJunker.fillTank(1); // put in 1 gallon
		System.out.println(oldJunker.getFuelRemaining()); // amount of fuel left
		System.out.println(oldJunker); // attributes
	}
}
