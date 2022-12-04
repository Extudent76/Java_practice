package Practic_15.Num_3;

import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {
	JTextField jta1 = new JTextField();
	JPanel panelButton1 = new JPanel();
	JPanel panelButton2 = new JPanel();
	JPanel panelTextArea = new JPanel();
	JButton button1 = new JButton("Button 1");
	JButton button2 = new JButton("Button 2");
	JMenuBar menuBar = new JMenuBar();
	JMenu menuFile = new JMenu("File");
	JMenu menuEdit = new JMenu("Edit");
	JMenu menuHelp = new JMenu("Help");
	JMenuItem itemSave = new JMenuItem("Save");
	JMenuItem itemExit = new JMenuItem("Exit");
	JMenuItem itemCopy = new JMenuItem("Copy");
	JMenuItem itemCut = new JMenuItem("Cut");
	JMenuItem itemPaste = new JMenuItem("Paste");
	Menu() {
		super("Меню");
		setSize(300, 300);
		setLayout(new GridLayout(2, 3));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(panelButton1);
		add(panelButton2);
		add(panelTextArea);
		panelButton1.add(button1);
		panelButton2.add(button2);
		panelTextArea.add(jta1);
		setJMenuBar(menuBar);
		menuBar.add(menuFile).add(itemSave);
		menuFile.add(itemExit);
		menuBar.add(menuEdit).add(itemCopy);
		menuEdit.add(itemCut);
		menuEdit.add(itemPaste);
		menuBar.add(menuHelp);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Menu();
	}
}
