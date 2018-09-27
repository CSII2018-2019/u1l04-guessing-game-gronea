import javax.swing.JOptionPane;

public class U1L04GuessingGame {

	public static void main(String[] args) {
		int answer = (int) (Math.random() * 100) + 1;
		System.out.println("answer: " + answer);
		int guess = 0;
		int count = 0;
		
		do {
			//Ask for input
			String input = JOptionPane.showInputDialog("Take a guess between 1 and 100: ");
			guess = Integer.parseInt(input);
			System.out.println(guess);
			if (guess != answer) {
				if (answer > guess - 10 && answer < guess + 10) {
					if (guess > answer) {
						JOptionPane.showMessageDialog(null,"You are within ten of of the "
								+ "right answer. Hint: your guess was too high.");
					}
					if (answer > guess) {
						JOptionPane.showMessageDialog(null,"You are within ten of of the "
								+ "right answer. Hint: your answer was too low.");
					}
				}
				count ++;
			}


		} while (guess != -1 && guess != answer );
			//Check input for the right answer or the negative 1
		
		if (guess == answer){
			//Print a score at the end (i.e. how many guess)
			JOptionPane.showMessageDialog(null,"The answer was " + answer + "! It took "
			+ (count) + " guesses to get the right answer.");
			//Implement a l
		}
		else {
			JOptionPane.showMessageDialog(null,"End of game. Thanks for playing!");
		}
	}
}


