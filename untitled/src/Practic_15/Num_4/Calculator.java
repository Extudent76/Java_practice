package Practic_15.Num_4;

import javax.swing.*;

public class Calculator extends JFrame {
	JButton buttonZero = new JButton("0");
	 JButton buttonOne= new JButton("1");
	JButton buttonTwo= new JButton("2");
	JButton buttonThree= new JButton("3");
	 JButton buttonFour= new JButton("4");
	 JButton buttonFive= new JButton("5");
	 JButton buttonSix= new JButton("6");
	JButton buttonSeven= new JButton("7");
	 JButton buttonEight= new JButton("8");
	 JButton buttonNine= new JButton("9");
	 JButton buttonAdd= new JButton("+");
	 JButton buttonSub= new JButton("-");
	 JButton buttonDiv= new JButton("/");
	JButton buttonMul= new JButton("*");
	JPanel panelMain= new JPanel();
	JTextField textField = new JTextField(16);
	JButton buttonResult = new JButton("=");
	JButton buttonClear = new JButton("C");
	final double[] first = {0};
	final double[] second = {0};
	final String[] sign = {""};

	Calculator(){
		super("Калькулятор");
		setSize(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		add(panelMain);
		panelMain.add(textField);
		panelMain.add(buttonAdd);
		panelMain.add(buttonOne);
		panelMain.add(buttonOne);
		panelMain.add(buttonTwo);
		panelMain.add(buttonThree);
		panelMain.add(buttonSub);
		panelMain.add(buttonFour);
		panelMain.add(buttonFive);
		panelMain.add(buttonSix);
		panelMain.add(buttonMul);
		panelMain.add(buttonSeven);
		panelMain.add(buttonEight);
		panelMain.add(buttonNine);
		panelMain.add(buttonDiv);
		panelMain.add(buttonZero);
		panelMain.add(buttonClear);
		panelMain.add(buttonResult);

		buttonZero.addActionListener(e -> {
			textField.setText(textField.getText() + 0);
			if (first[0] == 0) {
				first[0] = Double.parseDouble(textField.getText());
			} else {
				second[0] = Double.parseDouble(textField.getText());
			}
		});
		buttonOne.addActionListener(e -> {
			textField.setText(textField.getText() + 1);
			if (first[0] == 0) {
				first[0] = Double.parseDouble(textField.getText());
			} else {
				second[0] = Double.parseDouble(textField.getText());
			}
		});

		buttonTwo.addActionListener(e -> {
			textField.setText(textField.getText() + 2);
			if (first[0] == 0) {
				first[0] = Double.parseDouble(textField.getText());
			} else {
				second[0] = Double.parseDouble(textField.getText());
			}
		});

		buttonThree.addActionListener(e -> {
			textField.setText(textField.getText() + 3);
			if (first[0] == 0) {
				first[0] = Double.parseDouble(textField.getText());
			} else {
				second[0] = Double.parseDouble(textField.getText());
			}
		});

		buttonFour.addActionListener(e -> {
			textField.setText(textField.getText() + 4);
			if (first[0] == 0) {
				first[0] = Double.parseDouble(textField.getText());
			} else {
				second[0] = Double.parseDouble(textField.getText());
			}
		});

		buttonFive.addActionListener(e -> {
			textField.setText(textField.getText() + 5);
			if (first[0] == 0) {
				first[0] = Double.parseDouble(textField.getText());
			} else {
				second[0] = Double.parseDouble(textField.getText());
			}
		});

		buttonSix.addActionListener(e -> {
			textField.setText(textField.getText() + 6);
			if (first[0] == 0) {
				first[0] = Double.parseDouble(textField.getText());
			} else {
				second[0] = Double.parseDouble(textField.getText());
			}
		});

		buttonSeven.addActionListener(e -> {
			textField.setText(textField.getText() + 7);
			if (first[0] == 0) {
				first[0] = Double.parseDouble(textField.getText());
			} else {
				second[0] = Double.parseDouble(textField.getText());
			}
		});

		buttonEight.addActionListener(e -> {
			textField.setText(textField.getText() + 8);
			if (first[0] == 0) {
				first[0] = Double.parseDouble(textField.getText());
			} else {
				second[0] = Double.parseDouble(textField.getText());
			}
		});

		buttonNine.addActionListener(e -> {
			textField.setText(textField.getText() + 9);
			if (first[0] == 0) {
				first[0] = Double.parseDouble(textField.getText());
			} else {
				second[0] = Double.parseDouble(textField.getText());
			}
		});
		buttonAdd.addActionListener(e -> {
			first[0] = Double.parseDouble(textField.getText());
			textField.setText("");
			sign[0] = "+";
		});

		buttonSub.addActionListener(e -> {
			first[0] = Double.parseDouble(textField.getText());
			textField.setText("");
			sign[0] = "-";
		});

		buttonMul.addActionListener(e -> {
			first[0] = Double.parseDouble(textField.getText());
			textField.setText("");
			sign[0] = "*";
		});

		buttonDiv.addActionListener(e -> {
			first[0] = Double.parseDouble(textField.getText());
			textField.setText("");
			sign[0] = "/";
		});

		buttonResult.addActionListener(e -> {
			switch (sign[0]) {
				case "+" -> first[0] += second[0];
				case "-" -> first[0] -= second[0];
				case "*" -> first[0] *= second[0];
				case "/" -> first[0] /= second[0];
				default -> first[0] = 0;
			}
			textField.setText(String.valueOf(first[0]));
		});
		buttonClear.addActionListener(e -> {
			first[0] = 0;
			second[0] = 0;
			textField.setText("");
		});
		setVisible(true);
	}
	public static void main(String[] args) {
		new Calculator();
	}
}
