import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuessGameGUI extends JFrame {
	private JTextField textGuess;
	private JLabel labelOutput;
	private int theNumber;
	
	public void checkGuess() {
		String userGuess = textGuess.getText();
		String message = "";
		int guess = Integer.parseInt(userGuess);
		
		if(guess < theNumber) {
            message = guess + " is too low. Try again.";
		} else if(guess > theNumber) {
            message = guess + " is too high. Try again.";
		} else {
            message = guess + " is correct. You win!";
		} labelOutput.setText(message);
	}
	
	public void newGame() {
		theNumber = (int)(Math.random() * 100 + 1);
	}
	
	public GuessGameGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Tuukka's Guessing Game");
		getContentPane().setLayout(null);
		
		JLabel lblTuukkasGuessingGame = new JLabel("Guess The Number");
		lblTuukkasGuessingGame.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTuukkasGuessingGame.setHorizontalAlignment(SwingConstants.CENTER);
		lblTuukkasGuessingGame.setBounds(117, 40, 215, 16);
		getContentPane().add(lblTuukkasGuessingGame);
		
		JLabel lblEnterANumber = new JLabel("Enter a number between 1 and 100:");
		lblEnterANumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterANumber.setBounds(64, 96, 236, 16);
		getContentPane().add(lblEnterANumber);
		
		textGuess = new JTextField();
		textGuess.setHorizontalAlignment(SwingConstants.RIGHT);
		textGuess.setBounds(300, 91, 50, 26);
		getContentPane().add(textGuess);
		textGuess.setColumns(10);
		
		JButton btnGuess = new JButton("Guess!");
		btnGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGuess();
			}
		});
		btnGuess.setBounds(166, 152, 117, 29);
		getContentPane().add(btnGuess);
		
		labelOutput = new JLabel("Enter a number above and click Guess!");
		labelOutput.setHorizontalAlignment(SwingConstants.CENTER);
		labelOutput.setBounds(81, 221, 291, 16);
		getContentPane().add(labelOutput);
	}

	public static void main(String[] args) {
		GuessGameGUI theGame = new GuessGameGUI();
		theGame.newGame();
		theGame.setSize(new Dimension(450,300));
		theGame.setVisible(true);

	}
}
