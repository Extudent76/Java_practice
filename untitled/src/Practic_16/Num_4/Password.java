package Practic_16.Num_4;

import javax.swing.*;
import java.awt.*;

public class Password extends JFrame {
	JLabel labelService = new JLabel("Service: ");
	JTextField textFieldService = new JTextField(16);
	JLabel labelUserName = new JLabel("User name: ");
	JTextField textFieldUserName = new JTextField(16);
	JLabel labelPassword = new JLabel("Password: ");
	JTextField textPassword = new JTextField(16);
	JPanel[] panel = new JPanel[3];

	Password() {
		super("CheckingPassword");
		setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(3, 1));

		panel = new JPanel[3];
		for (int i = 0; i < 3; i++) {
			add(panel[i] = new JPanel());
		}
		panel[0].add(labelService);
		panel[0].add(textFieldService);

		panel[1].add(labelUserName);
		panel[1].add(textFieldUserName);

		panel[2].add(labelPassword);
		panel[2].add(textPassword);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Password();
	}
}
