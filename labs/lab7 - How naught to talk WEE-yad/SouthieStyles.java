// Linh Nguyen - Section 002
// Date: Fri, March 11
// Assignment 7: Southie Styles
/* Summary: 
 * - 5 method for 5 rules
 * - Import jaws.txt and output new_jaws.txt
 * - Complete every extra credit part as below:
 * 1. Create 8 test cases in JUnit testing
 * 2. Preserve capitalization
 * 3. Perserve spacing
 * 4. Change quotes only from another text on Project Gutenberg
 * -> Link for the plain text: https://www.gutenberg.org/ebooks/67628
 */

package southie;

import java.io.*; // for File
import java.util.*; // for Scanner

public class SouthieStyles {

	public static void main(String[] args) throws FileNotFoundException {
		
		// Translate file jaws.txt
//		File file = new File("jaws.txt");
//		
//		PrintStream p = null;
//		
//		try (Scanner scan = new Scanner(file)) {
//			p = new PrintStream(new File("new_jaws.txt"));
//
//			while (scan.hasNextLine()) {
//				p.println(conversion(scan.nextLine()));
//			}
//			p.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		// Extra credit for changing quotes only
		
		// Translate file youth.txt within quotes only
		File file2 = new File("youth.txt");
		
		PrintStream p2 = null;
		
		try (Scanner scan = new Scanner(file2)) {
			p2 = new PrintStream(new File("new_youth.txt"));
			
			while (scan.hasNextLine()) {
				String word = scan.nextLine();
				if (!quote(word)) {
					p2.println((word.replaceAll("\"[^\"]*\"", conversion(word))));
				} else {
					p2.println(word);
				}
			}
			p2.close();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
	}
	
	// check if a string starts and ends with a quotation mark
	public static Boolean quote(String word) {
		if (word.startsWith("\"") && word.endsWith("\"")) {
			return true;
		}
		return false;
	}
	
	// check for upper case characters in a string
	public static Boolean upper(Character c) {
		if (!Character.isUpperCase(c)) {
			return false;
		}
		return true;
	}
	
	// check for vowels "aeiou"
	public static Boolean is_vowel(Character c) {
		char c1 = Character.toLowerCase(c);
		
		if (c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u') {
			return true;
		}
		return false;
	}
	
	// Basic rule 1: 'r' following a vowel -> replace with 'h'
	// car -> cah
	public static String Rule1(String word) {
        String w = word.toLowerCase();
        if (word.length() < 1){
            return word;
        }
        String new_word = "" + word.charAt(0);

        for (int i = 1; i < word.length(); i++) {
        	
            if (w.charAt(i) == 'r' && is_vowel(word.charAt(i - 1))) {
                if (upper(word.charAt(i - 1))) {
                    new_word += 'H';
                } else {
                    new_word += 'h';
                }
            } else {
                new_word += word.charAt(i);
            }
        }
        return new_word;
    }
	
	// Basic rule 2: end in 'a' -> append 'r' but not the word "a"
	// a tuna -> a tunar
	public static String Rule2(String word) {
		String w = word.toLowerCase();
		
		String new_word = "";
		
		if (word.length() != 1) {
			if (w.endsWith("a")) {
				if (upper(word.charAt(word.length() - 1))) {
					new_word = word + "R";
				} else {
					new_word = word + "r";
				}
			} else {
				new_word = word;
			}
			return new_word;
		}
		return word;
	}
	
	// Basic rule 3: "very" -> "wicked"
	// very hard -> wicked hard 
	public static String Rule3(String word) {
		String w = word.toLowerCase();
		
		String new_word = "";
		
		if (w.equals("very")) {
			new_word = "wicked";
			
			if (word.equals("Very")) {
				new_word = "Wicked";
				
			} else if (word.equals("VERY")) {
				new_word = "WICKED";
			}
			return new_word;
		}
		return word;
	}
	
	// Exception 1: end in 'r' & preceed by "ee" or 'i' -> replace 'r' to "yah"
	// deer -> deeyah but veneers -> veneehs
	public static String Exception1(String word) {
		String new_word = "";
		
		if (word.length() != 0) {
			new_word = word.substring(0, word.length() - 1);
			
			if (word.endsWith("eer") || word.endsWith(("ir"))) {
				new_word += "yah";
				
			} else if (word.endsWith("EER") || (word.endsWith("IR"))) {
				new_word += "YAH";
				
			} else {
				new_word = word;
			}
			
		} else {
			new_word = word;
		}
		return new_word;
	}
	
	// Exception 2: end in 'r' & preceed by "oo" -> replace 'r' to "wah"
	// door -> doowah but "doors" -> "doohs"
	public static String Exception2(String word) {
		String new_word = "";
		
		if (word.length() != 0) {
			new_word = word.substring(0, word.length() - 1);
			
			if (word.endsWith("oor")) {
				new_word += "wah";
				
			} else if (word.endsWith("OOR")) {
				new_word += "WAH";
				
			} else {
				new_word = word;
			}
			
		} else {
			new_word = word;
		}
		return new_word;
	}
	
	// Complete translation
	public static String conversion(String word) {
		word = Rule3(word);
		word = Exception1(word);
		word = Exception2(word);
		word = Rule1(word);
		word = Rule2(word);
	    return word;
	}
}