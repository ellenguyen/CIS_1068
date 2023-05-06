// Linh Nguyen - Section 002
// Assignment 10: Test Papers
// File: Test.java

package asm10;

public class Test {
	
	Question questions[];
	int totalPoints;
	
	//constructor
	public Test(Question[] questions, int totalPoints) {
		
		this.questions = questions;
		this.totalPoints = totalPoints;
		
		for (int i = 0; i < questions.length; i++) {
			totalPoints += questions[i].getPoints();
		}
	}
	
	//method to print out test and answer keys
	public String toString() {
		String displayText = "------------This is your test------------\n\nPlease answer the following questions:\n\n";
		
		for (int i = 0; i < questions.length; i++) {
			String type = questions[i].getType();
			
			if (type.equals("ObjectiveQuestion")) {
				displayText = displayText + ((ObjectiveQuestion)questions[i]).display() + '\n';
			} else if (type.equals("MultipleChoiceQuestion")) {
				displayText = displayText + ((MultipleChoiceQuestion)questions[i]).display() + '\n';
			} else if (type.equals("FillInTheBlankQuestion")) {
				displayText = displayText + ((FillInTheBlankQuestion)questions[i]).display() + '\n';
			}
		}
		
		displayText += "------------Following are answer keys------------\n\n";
		
		for (int i = 0; i < questions.length; i++) {
			String type = questions[i].getType();
			
			if (type.equals("ObjectiveQuestion")) {
				displayText = displayText + ((ObjectiveQuestion)questions[i]).answer() + '\n';
			} else if (type.equals("MultipleChoiceQuestion")) {
				displayText = displayText + ((MultipleChoiceQuestion)questions[i]).answer() + '\n';
			} else if (type.equals("FillInTheBlankQuestion")) {
				displayText = displayText + ((FillInTheBlankQuestion)questions[i]).answer() + '\n';
			}
		}
		
		return displayText;
	}
}