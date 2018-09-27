import javax.swing.JOptionPane;

public class U1L04GuessingGame {

	public static void main(String[] args) {
		int  answer = 1;
		int guess = 0;
		
		do {
			//Ask for input
			String input = JOptionPane.showInputDialog("Take a guess between 1 and 100: ");
			double num = Double.parseDouble(input);
			guess = (int) num;
		} while (guess != answer || guess != -1);
			//Check input for the right answer or the negative 1
			//Add to number of guesses
			//Print a score at the end (i.e. how many guess)
			//Implement a l
	}

}
