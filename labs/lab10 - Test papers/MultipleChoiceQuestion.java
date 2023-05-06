// Linh Nguyen - Section 002
// Assignment 10: Test Papers
// File: MultipleChoiceQuestion.java

package asm10;

public class MultipleChoiceQuestion extends Question {
	
	protected String correctAnswer;
	protected String possibleAnswers[];
	
	//constructor
	public MultipleChoiceQuestion(int points, int difficulty, int answerSpace, String questionText,
			String type, String correctAnswer, String possibleAnswers[]) {
		super(points, difficulty, answerSpace, questionText, type);
		this.correctAnswer = correctAnswer;
		this.possibleAnswers = possibleAnswers;
	}
	
	//method to print questionText
	public String display() {
		String displayText = super.display() + '\n';
		
		for (int i = 0; i < possibleAnswers.length; i++) {
			displayText = displayText + (i + 1) + ". " + possibleAnswers[i] + '\n';
		}
		return displayText;
	}
	
	//method to print answer
	public String answer() {
		String displayText = super.display() + '\n';
		
		for (int i = 0; i < possibleAnswers.length; i++) {
			if (possibleAnswers[i].equals(this.correctAnswer)) {
				displayText = displayText + (i + 1) + ". **** " + possibleAnswers[i] + " ****" + '\n';
			} else {
				displayText = displayText + (i + 1) + ". " + possibleAnswers[i] + '\n';
			}
		}
		return displayText;
	}
}
