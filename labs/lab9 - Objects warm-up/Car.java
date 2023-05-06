// Linh Nguyen - Section 002
// Assignment 9: Warm up with objects
// Date: Tuesday, March 29th
// File: Test Car.java

package asm9;

import java.io.*;
import java.util.*;

public class Car {
	
	private String make, model;
	private int year;
	private double MPG, milesDriven, fuelCapacity, fuelRemaining;
	
	public Car(String name, String model, int year, double MPG,
			double milesDriven, double fuelCapacity, double fuelRemaining) {
		this.make = name;
		this.model = model;
		this.year = year;
		this.MPG = MPG;
		this.milesDriven = milesDriven;
		this.fuelCapacity = fuelCapacity;
		this.fuelRemaining = fuelRemaining;
	}

	public void fillTank(double g) {
		if ((this.fuelRemaining + g) <= this.fuelCapacity) {
			this.fuelRemaining += g;
		} else {
			this.fuelRemaining = this.fuelCapacity;
		}
	}
	
	public void drive(double m) {
		double fuel = m / this.MPG;
		if (fuel <= this.fuelCapacity) {
			this.milesDriven += m;
			this.fuelRemaining -= fuel;
		}
	}
	
	public String toString() {
		String info = String.format("Name: %s\nModel: %s\nYear: %d\n", this.make, this.model, this.year);
		String stats = String.format("MPG: %.2f m/g\n", this.MPG);
		String stats1 = String.format("Miles driven: %.2f m\n", this.milesDriven);
		String stats2 = String.format("Fuel capacity: %.2f gallon\n", this.fuelCapacity);
		String stats3 = String.format("Fuel remaining: %.2f gallon\n", this.fuelRemaining);
		return info + stats + stats1 + stats2 + stats3;
	}
	
	public double getFuelRemaining() {
		return this.fuelRemaining;
	}
}
