// Linh Nguyen - Section 002
// Assignment 10: Test Papers
// File: Question.java

package asm10;

public class Question {
	
	protected final int MIN_DIFFICULTY = 1;
	protected final int MAX_DIFFICULTY = 10;
	
	protected int points;
	protected int difficulty;
	protected int answerSpace;
	protected String questionText;
	protected String type;
	
	public Question(int points, int difficulty, int answerSpace, String questionText, String type) {
		this.points = points;
		this.difficulty = checkRange(difficulty);
		this.answerSpace = answerSpace;
		this.questionText = questionText;
		this.type = type;
	}
	
	//method to print questionText
	public String display() {
		return questionText + spacing();
	}
	
	//method to get points
	public int getPoints() {
		return this.points;
	}
	
	//method to get question type
	public String getType() {
		return type;
	}
	
	//method to check difficulty within range
	public int checkRange(int difficulty) {
		if (difficulty < MIN_DIFFICULTY) {
			return MIN_DIFFICULTY;
		} else if (difficulty > MAX_DIFFICULTY) {
			return MAX_DIFFICULTY;
		} else {
			return difficulty;
		}
	}
	
	//method to print answerSpace
	public String spacing() {
		return "\n".repeat(Math.max(0, answerSpace));
	}
}
