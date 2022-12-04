package Practic_15.Num_1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame {
	JTextField jta1 = new JTextField(10);
	JTextField jta2 = new JTextField(10);
	JButton buttonadd = new JButton("Сложить числа");
	JButton buttonsub = new JButton("Вычисть числа");

	JButton buttondiv = new JButton("Поделить числа");

	JButton buttonmul = new JButton("Умножить числа");
	Font fnt = new Font("Times new roman",Font.BOLD,20);
	Calculator(){
		super("Калькулятор");
		setLayout(new FlowLayout());
		setSize(500,150);
		add(new JLabel("1 число"));
		add(jta1);
		add(new JLabel("2 число"));
		add(jta2);
		add(buttonadd);
		add(buttonsub);
		add(buttondiv);
		add(buttonmul);

		buttonadd.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e){
				try{

					double x1 = Double.parseDouble(jta1.getText().trim());
					double x2 = Double.parseDouble(jta2.getText().trim());

					JOptionPane.showMessageDialog(null, "Результат = "+(x1+x2),"Alert",JOptionPane.INFORMATION_MESSAGE);
				}catch(Exception e1){
					JOptionPane.showMessageDialog( null, "Error in Numbers !","alert" , JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		//================================
		buttonsub.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e){
				try{

					double x1 = Double.parseDouble(jta1.getText().trim());
					double x2 = Double.parseDouble(jta2.getText().trim());

					JOptionPane.showMessageDialog(null, "Результат = "+(x1-x2),"Alert",JOptionPane.INFORMATION_MESSAGE);
				}catch(Exception e1){
					JOptionPane.showMessageDialog( null, "Error in Numbers !","alert" , JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		//================================
		buttondiv.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e){
				try{

					double x1 = Double.parseDouble(jta1.getText().trim());
					double x2 = Double.parseDouble(jta2.getText().trim());

					JOptionPane.showMessageDialog(null, "Результат = "+(x1/x2),"Alert",JOptionPane.INFORMATION_MESSAGE);
				}catch(Exception e1){
					JOptionPane.showMessageDialog( null, "Error in Numbers !","alert" , JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		//================================
		buttonmul.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e){
				try{

					double x1 = Double.parseDouble(jta1.getText().trim());
					double x2 = Double.parseDouble(jta2.getText().trim());

					JOptionPane.showMessageDialog(null, "Результат = "+(x1*x2),"Alert",JOptionPane.INFORMATION_MESSAGE);
				}catch(Exception e1){
					JOptionPane.showMessageDialog( null, "Error in Numbers !","alert" , JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		setVisible(true);
	}
	public static void main(String[]args){
		new Calculator();
	}
}