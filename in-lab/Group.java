package group;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Group {
	
	// Step 5
	public static void main(String[] args) throws FileNotFoundException {
		System.out.print("Please enter the file's name: ");
		Scanner grab = new Scanner(System.in);
		String FileName = grab.nextLine();
		System.out.println(ConsonantWord(FileName));
	}
	
	// Step 1 - check for vowels
	public static Boolean isVowel(Character c) {
		char c1 = Character.toLowerCase(c);
		if (c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u') {
			return true;
		}
		return false;
	}
	
	// Step 2 - check for consonants
	public static Boolean isConsonant(Character c) {
		if (!isVowel(c)) {
			return true;
		}
		return false;
	}
	
	// Step 3 - count number of consonants
	public static int numConsonant(String word) {
		int count = 0;
		
		for (int i = 0; i < word.length(); i++) {
			if (isConsonant(word.charAt(i))) {
				count++;
			}
		}
		return count;
	}
	
	// Step 4 - return the word with the most number of consonants
	public static String ConsonantWord(String FileName) throws FileNotFoundException {
		Scanner input = new Scanner(FileName);
		
        String mostConsonantWord = "NO CONSONANTS"; 
        
        int mostNumConsonant = 0;
        
        while (input.hasNextLine()) {
        	
            String line = input.nextLine();
            
            Scanner lineScanner = new Scanner(line);
            
            while (lineScanner.hasNext()) {
                String word = lineScanner.next();
                
                int numConsonant = numConsonant(word);  
                
                if(numConsonant > mostNumConsonant) {
                	mostConsonantWord = word;
                	mostNumConsonant = numConsonant;
                }
            }
        }
        return mostConsonantWord;
	}
}
