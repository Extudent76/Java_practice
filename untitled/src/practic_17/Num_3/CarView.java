package practic_17.Num_3;

import javax.swing.*;
import java.awt.*;

public class CarView extends JFrame {
	private final JLabel labelbrend= new JLabel("Введите текст");
	private final JLabel labelmodel= new JLabel();
	private final JTextField textbrend = new JTextField("Марка авто", 16);
	private final JTextField textmodel = new JTextField("Модель авто", 16);
	private final JButton button  = new JButton("CLICK ME");
	JPanel[] panel;

	public CarView() {
		super("Draw GUI");
		setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(5, 1));

		panel = new JPanel[5];
		for (int i = 0; i < panel.length; i++) {
			add(panel[i] = new JPanel());
		}
		panel[0].add(labelbrend, JLabel.CENTER);
		panel[1].add(labelmodel, JLabel.CENTER);
		panel[2].add(textbrend, JLabel.CENTER);
		panel[3].add(textmodel, JLabel.CENTER);
		panel[4].add(button, JLabel.CENTER);
		setVisible(true);
	}

	public void setLabelTextbrend(String str) {
		labelbrend.setText(str);
	}

	public String getInputTextbrend() {
		return textbrend.getText();
	}

	public void setLabelTextmodel(String str) {
		labelmodel.setText(str);
	}

	public String getInputTextmodel() {
		return textmodel.getText();
	}

	public void addActionListener(AbstractAction e) {
		button.addActionListener(e);
	}

}
