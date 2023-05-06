package lab;

import java.util.*;

public class IntArrayWrapper {
	
	private int[] A;
	private static final int CAPACITY = 10;
	private int numItems;

	public IntArrayWrapper() {
		A = new int[CAPACITY];
	    numItems = 0;
	}

	public int get(int index) {
		return A[index];
	}

	public boolean append(int newItem) {
		if (numItems >= A.length) {
			return false;
	    }
	    
	    A[numItems] = newItem;
	    numItems++;
	    return true;
	}

	public void clear() {
	    numItems = 0;
	}

	public String toString() {
	    if (numItems == 0) {
	    	return "[ ]";
	    }

	    String s = "[" + A[0];
	    for (int i = 1; i < numItems; i++) {
	    	s += ", " + A[i];
	    }
	    return s + "]";
	}
	  
	public boolean equals(IntArrayWrapper o) {
	    if (this.numItems != o.numItems) {
	    	return false;
	    }
	    
	    for (int i = 0; i < o.numItems; i++) {
	    	if (this.A[i] != o.A[i]) {
	    		return false;
	    	}
	    }
	    return true;
	}
	
	public static void main(String[] args) {
		IntArrayWrapper new1 = new IntArrayWrapper();
        new1.append(5);
        new1.append(8);
        new1.append(3);
        System.out.println(new1.get(2));
        System.out.println(new1.toString());

        IntArrayWrapper new2 = new IntArrayWrapper();
        new2.append(5);
        new2.append(6);
        new2.append(3);

        System.out.println(new1.equals(new2));

        new1.clear();
        System.out.println(new1.toString());
	}
}