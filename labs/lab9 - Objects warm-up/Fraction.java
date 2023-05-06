// Linh Nguyen - Section 002
// Assignment 9: Objects
// Date: Tuesday, March 29th
// File: Fraction.java

package asm9;

import java.io.*;
import java.util.*;

public class Fraction {
	private int n, d;
	
	public Fraction(int n, int d) {
		if (d == 0) {
			throw new ArithmeticException();
		}
		int gcd = gcd(n, d);
		this.n = n / gcd;
		this.d = d / gcd;
	}
	
	public int getNum() {
		return this.n;
	}
	
	public int getDenom() {
		return this.d;
	}
	
	public void setNum(int n) {
		int gcd = gcd(n, this.d);
		this.n = n / gcd;
	}
	
	public void setDenom(int d) {
		if (d == 0) {
			throw new ArithmeticException();
		}
		int gcd = gcd(this.n, d);
		this.d = d / gcd;
		
	}
	
	public Fraction add(Fraction a) {
		return new Fraction((this.n * a.d + a.n * this.d), (this.d * a.d));
	}
	
	public boolean equals(Fraction a) {
		if ((this.n == a.n) & (this.d == a.d)) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return String.format("%d/%d", this.n, this.d);
	}
	
	public int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
}
