package practic_5.Num_1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Dimension;
public class RealMadrid_Milan extends JFrame {
	private JPanel ButtonPanel;
	private JPanel labelpanel;
	private JButton MadridButton;
	private JButton MilanButton;
	private JLabel lastScorer;
	private JLabel result;
	private JLabel winner;
	 private int RealScore = 0;
	 private  int MilanScore = 0;
	public RealMadrid_Milan() {
		super("Real Madrid vs AC Milan");
		createGUI();
		}
	public void createGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 250);
		setVisible(true);
		add(ButtonPanel = new JPanel());
		add(labelpanel = new JPanel());
		setLayout(new GridLayout(2, 1));
		ButtonPanel.setPreferredSize(new Dimension(300, 300));
		ButtonPanel.add(MilanButton = new JButton("AC Milan"));
		ButtonPanel.add(MadridButton = new JButton("Real Madrid"));
		getContentPane().add(ButtonPanel);
		labelpanel.setLayout(new GridLayout(1, 3));
		labelpanel.add(lastScorer = new JLabel("Last Scorer:", JLabel.CENTER));
		labelpanel.add(result = new JLabel("Result 0X0", JLabel.CENTER));
		labelpanel.add(winner = new JLabel("Winner: DRAW", JLabel.CENTER));

		MadridButton.addActionListener (new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				RealScore++;
				updateScore();
				updateWinner();
				updateLast("Real Madrid");
			}});
		MilanButton.addActionListener(new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MilanScore++;
				updateScore();
				updateWinner();
				updateLast("AC Milan");
			}});
	}
	private void updateScore() {
		result.setText("Result: " + MilanScore + "X" + RealScore);
	}
	private void updateWinner() {
		if (MilanScore > RealScore) {
			winner.setText("Winner: AC Milan");
		} else if (MilanScore == RealScore) {
			winner.setText("Winner: Ничья");
		} else {
			winner.setText("Winner: Real Madrid");
		}
	}
	private void updateLast(String last) {
		lastScorer.setText("Last Scorer " + last);
	}
}

