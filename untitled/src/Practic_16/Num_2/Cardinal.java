package Practic_16.Num_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Cardinal extends JFrame {
	 JPanel center= new JPanel();
 	 JPanel west= new JPanel();
	 JPanel east= new JPanel();
	 JPanel south= new JPanel();
	 JPanel north= new JPanel();

	Cardinal() {
		super("Стороны");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		add(center,BorderLayout.CENTER);
		add(west, BorderLayout.WEST);
		add(east, BorderLayout.EAST);
		add(south, BorderLayout.SOUTH);
		add(north, BorderLayout.NORTH);

		center.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent event) {

				JOptionPane.showMessageDialog(getContentPane(), "Добро пожаловать в ЦАО", "Добро пожаловать в ЦАО", JOptionPane.PLAIN_MESSAGE);
			}
		});
		west.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent event) {

				JOptionPane.showMessageDialog(getContentPane(), "Добро пожаловать в ВАО", "Добро пожаловать в ВАО", JOptionPane.PLAIN_MESSAGE);

			}
		});

		south.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent event) {

				JOptionPane.showMessageDialog(getContentPane(), "Добро пожаловать в ЮАО", "Добро пожаловать в ЮАО", JOptionPane.PLAIN_MESSAGE);

			}
		});
		north.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent event) {
				JOptionPane.showMessageDialog(getContentPane(), "Добро пожаловать в САО", "Добро пожаловать в САО", JOptionPane.PLAIN_MESSAGE);
			}
		});
		east.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent event) {
				JOptionPane.showMessageDialog(getContentPane(), "Добро пожаловать в ЗАО", "Добро пожаловать в ЗАО", JOptionPane.PLAIN_MESSAGE);
			}
		});
		setVisible(true);
	}

	public static void main(String[] args) {
		new Cardinal();
	}
}
