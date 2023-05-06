// Linh Nguyen - Section 002
// Assignment 9: Objects
// Date: Tuesday, March 29th
// File: Test Fraction.java

package asm9;

public class FractionMain {

	public static void main(String[] args) {
		Fraction frac = new Fraction(15, 20);
		System.out.println(frac.toString());
		System.out.println(frac.equals(new Fraction(3, 4)));
		frac.setNum(1);
		frac.setDenom(2);
		System.out.println(frac.add(new Fraction(5, 6)));
	}
}
