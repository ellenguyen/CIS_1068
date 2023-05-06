// Linh Nguyen - Section 002
// Assignment 10: Test Papers
// File: FillInTheBlankQuestion.java

package asm10;

public class FillInTheBlankQuestion extends ObjectiveQuestion {
	
	//constructor
	public FillInTheBlankQuestion(int points, int difficulty, int answerSpace, 
								String questionText, String type, String correctAnswer) {
		super(points, difficulty, answerSpace, questionText, type, correctAnswer);
	}
	
	//method to print questionText
	public String display() {
		return spaces() + questionText + "\n" + spacing();
	}
	
	//method to print correctAnswer
	public String answer() {
		return spaces() + questionText + "\nAnswer: " + "___" + correctAnswer + "___ " + questionText + "\n" + spacing();
	}
	
	//method to print spaces in 1 answer line
	public String spaces() {
		return "_".repeat(Math.max(0, answerSpace)) + " ";
	}
}