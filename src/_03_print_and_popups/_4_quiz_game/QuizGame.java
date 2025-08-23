package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		String input = JOptionPane.showInputDialog("are you breathing");
		
		if (input.equals("yes")) {
			JOptionPane.showMessageDialog(null,"aww dangit well atleast thats correct");
			score += 1;
		}
		else {
			JOptionPane.showMessageDialog(null,"you failed");
		}
		
		String input2 = JOptionPane.showInputDialog("are you alive");

		if (input2.equals("yes")) {
			JOptionPane.showMessageDialog(null,"aww dangit well atleast thats correct");
			score += 1;
		}
		else {
			JOptionPane.showMessageDialog(null,"you failed");
		}
		
		String input3 = JOptionPane.showInputDialog("are you dead");

		if (input3.equals("no")) {
			JOptionPane.showMessageDialog(null,"aww dangit well atleast thats correct");
			score += 1;
		}
		else {
			JOptionPane.showMessageDialog(null,"you failed");
		}
		
		JOptionPane.showMessageDialog(null,"you got " + score + " score");

				// 3.  Use an if statement to check if their answer is correct
				
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
