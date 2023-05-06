// Linh Nguyen - Section 002
// Assignment 10: Test Papers
// File: ObjectiveQuestion.java

package asm10;

public class ObjectiveQuestion extends Question {
	
	protected String correctAnswer;
	
	//constructor
	public ObjectiveQuestion(int points, int difficulty, int answerSpace, 
							String questionText, String type, String correctAnswer) {
		super(points, difficulty, answerSpace, questionText, type);
		this.correctAnswer = correctAnswer;
	}
	
	//method to print correctAnswer
	public String answer() {
		return questionText + "\nAnswer: " + correctAnswer + "\n" + spacing();
	}
}