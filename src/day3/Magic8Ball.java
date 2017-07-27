package day3;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
		int ran=0;

			// 2. Make a variable that will hold a random number and put a
			// random number into this variable using "new Random().nextInt(4)"
			ran = new Random().nextInt(4);
			// 3. Print out this variable
			// 4. Get the user to enter a question for the 8 ball
			String Fail = JOptionPane.showInputDialog("Give me a question");

		// 5. If the random number is 0
		if (ran == 0) {
			// -- tell the user "Yes
			JOptionPane.showMessageDialog(null, "Yes");
		}
		// 6. If the random number is 1
		if (ran == 1) {
			// -- tell the user "No"
			JOptionPane.showMessageDialog(null, "No");
		}
		// 7. If the random number is 2
		if (ran == 2) {
			// -- tell the user "Maybe you should ask Google?"
			JOptionPane.showMessageDialog(null, "Ask Google");
		}
		// 8. If the random number is 3
		if (ran == 3) {
			// -- write your own answer
			JOptionPane.showMessageDialog(null, "Ask siri");
		}

		if (ran == 4) {
			JOptionPane.showMessageDialog(null, "Maybe");
		}

		if (ran == 5) {
			JOptionPane.showMessageDialog(null, "Ask your parents");
		}

		if (ran == 6) {
			JOptionPane.showMessageDialog(null, "Im not answering that");
		}
	}
}
