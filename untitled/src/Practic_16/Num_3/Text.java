package Practic_16.Num_3;

import javax.swing.*;
import java.awt.*;

public class Text extends JFrame {
	 JTextArea textArea = new JTextArea();

	 JMenuBar jMenuBar = new JMenuBar();
	 JMenu jMenuColors = new JMenu("Цвет");
	 JMenu jMenuFonts = new JMenu("Шрифт");

	 JMenuItem jMenuItemBlue = new JMenuItem("Blue");
	 JMenuItem jMenuItemRed = new JMenuItem("Red");
	 JMenuItem jMenuItemBlack = new JMenuItem("Black");

	 JMenuItem jMenuItemTimes = new JMenuItem("Times New Roman");
	 JMenuItem jMenuItemSans = new JMenuItem("MS Sans Serif");
	 JMenuItem jMenuItemCourier = new JMenuItem("Courier New");

	Text(){
		super("Редактор");
		setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		add(textArea);
		setJMenuBar(jMenuBar);

		jMenuBar.add(jMenuColors);
		jMenuBar.add(jMenuFonts);

		jMenuColors.add(jMenuItemBlue);
		jMenuColors.add(jMenuItemRed);
		jMenuColors.add(jMenuItemBlack);

		jMenuFonts.add(jMenuItemTimes);
		jMenuFonts.add(jMenuItemSans);
		jMenuFonts.add(jMenuItemCourier);

		jMenuItemRed.addActionListener(e -> textArea.setForeground(Color.RED));
		jMenuItemBlue.addActionListener(e -> textArea.setForeground(Color.blue));
		jMenuItemBlack.addActionListener(e -> textArea.setForeground(Color.black));
		jMenuItemTimes.addActionListener(e -> textArea.setFont(new Font(jMenuItemTimes.getText(), Font.BOLD, 14)));
		jMenuItemCourier.addActionListener(e -> textArea.setFont(new Font(jMenuItemCourier.getText(), Font.BOLD, 14)));
		jMenuItemSans.addActionListener(e -> textArea.setFont(new Font(jMenuItemSans.getText(), Font.BOLD, 14)));

		setVisible(true);
	}

	public static void main(String[] args) {
		new Text();
	}
}
