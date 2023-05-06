// Linh Nguyen - Section 002
// Assignment 10: Test Papers
// File: Main.java (Driver program with extra credit about files)

package asm10;

import java.io.*;
import java.util.*;

public class Main {
	
	static final int MIN_DIFFICULTY = 1;
	static final int MAX_DIFFICULTY = 10;
	
	public static void main(String[] args) throws FileNotFoundException {
		
		ObjectiveQuestion Q1 = new ObjectiveQuestion(50, 5, 2, 
									"How many states in US?", 
									"ObjectiveQuestion", 
									"50 States");
		
		FillInTheBlankQuestion Q2 = new FillInTheBlankQuestion(50, 3, 2, 
									"is the old capital of US.",
									"FillInTheBlankQuestion", 
									"Philadelphia");
		
		String possibleAnswers[] = {"Bill Gates", "Elon Musk", "Jeff Bezos", "Larry Page"};
		
		MultipleChoiceQuestion Q3 = new MultipleChoiceQuestion(50, 5, 2, 
									"Who is the richest people in the world?",
									"MultipleChoiceQuestion", 
									"Elon Musk",
									possibleAnswers);
		
		Question questionList[] = new Question[3];
		
		questionList[0] = Q1;
		questionList[1] = Q2;
		questionList[2] = Q3;
		
		//print test and answer keys to console
		Test quiz = new Test(questionList, 0);
		System.out.println(quiz.toString());
		
		//-----Extra credit-----
		
		//create Scanner to send test and answer keys to other files
		Scanner grab = new Scanner(System.in);
		
        System.out.print("Choose your file name with .txt extension, for example: [insert the file name here].txt \n");
        
        PrintStream p = new PrintStream(new File(grab.next()));
        
        p.println(quiz.toString());
        
        p.close(); //done with writing to a file
	}
}
