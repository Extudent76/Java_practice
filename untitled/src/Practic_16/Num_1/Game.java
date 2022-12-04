package Practic_16.Num_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class Game extends JFrame {
	private final int number;
	private int health = 3;
	JPanel[] panel = new JPanel[4];
	JButton answerButton = new JButton("Отправить ответ");
	JTextField textField = new JTextField(4);
	JLabel labelAsk = new JLabel("Угадайте число между 0-20 ");
	JLabel labelCounterAttemps = new JLabel("У вас  осталось попыток 3 ");

	Game() {
		super("Угадайка");
		number = new Random().nextInt(0, 21);
		setLayout(new GridLayout(4, 1));
		setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for (int i = 0; i < 4; i++) {
			add(panel[i] = new JPanel());
		}
		panel[0].add(labelAsk);
		panel[1].add(textField);
		panel[2].add(answerButton);
		panel[3].add(labelCounterAttemps);
		answerButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				health--;
				if (textField.getText().equals(String.valueOf(number))) {
					labelCounterAttemps.setText("Верно. Вы победили. Игра окончена ");
					JOptionPane.showMessageDialog(null, "Верно. Вы победили. Игра окончена.");
				} else if (health > 0) {
					labelCounterAttemps.setText("У вас  осталось попыток " + health);
					if (Integer.parseInt(textField.getText()) < number) labelAsk.setText("Искомое число больше.");
					else labelAsk.setText("Искомое число меньше ");
				} else {
					labelCounterAttemps.setText("У вас не осталось попыток. Игра окончена ");
					JOptionPane.showMessageDialog(null, "У вас не осталось попыток. Игра окончена. Искомое число: " + number);
				}
			}
		});
		setVisible(true);
	}

	public static void main(String[] args) {
		new Game();
	}
}


