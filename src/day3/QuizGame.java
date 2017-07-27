package day3;

import javax.swing.JOptionPane;

public class QuizGame {
public static void main(String[] args) {
	int score = 0;
	String Muselk = JOptionPane.showInputDialog("What is the name of the console sony owns?");
	if(Muselk.equals("PS4")){
	JOptionPane.showMessageDialog(null,"Correct!");
	score++;
	}
	else{ JOptionPane.showMessageDialog(null,"Wrong");}
	
	String Drake = JOptionPane.showInputDialog("True or False= Sony's music group includes Famous Rapper Future.");
	if(Drake.equals("True")){
		JOptionPane.showMessageDialog(null,"Correct!");
		score++;
	}
	else{ JOptionPane.showMessageDialog(null,"Wrong");}
	String Money = JOptionPane.showInputDialog("How many playstation units as Sony sold?");
	if(Money.equals("60 Million")){
		JOptionPane.showMessageDialog(null,"Correct!");
		score+=3;
	}
	else{ JOptionPane.showMessageDialog(null,"Wrong! SOny has sold 60 million Playstations, where as Microsoft has sold 26 million xBox ones's.");}
	
	String CD = JOptionPane.showInputDialog("Did sony create Blu-Ray?");
	if(CD.equals("Yes")){
		JOptionPane.showMessageDialog(null,"Correct!");
		score++;
	}
	else{ JOptionPane.showMessageDialog(null,"Wrong");
	
	JOptionPane.showMessageDialog(null,"your score is "+score);
}
}
}
