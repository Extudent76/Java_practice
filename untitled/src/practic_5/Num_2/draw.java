package practic_5.Num_2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class draw extends JFrame {

	public draw() {
		super("Draw GUI");
		setSize(650, 650);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(4, 5));

		Random random = new Random();
		for (int i = 0; i < 20; i++) {
			int x = random.nextInt(0, 3);
			if (x == 0)
				add(new сircle(new Point(random.nextInt(0, 100), random.nextInt(0, 100)),
						random.nextInt(50, 100),
						new Color(random.nextFloat(), random.nextFloat(), random.nextFloat()),
						random.nextInt(0, 10) > 5), JLayeredPane.POPUP_LAYER);
			else if (x == 1)
				add(new rectangle(new Point(random.nextInt(0, 100), random.nextInt(0, 100)),
						random.nextInt(50, 100), random.nextInt(50, 100),
						new Color(random.nextFloat(), random.nextFloat(), random.nextFloat()),
						random.nextInt(0, 10) > 5), JLayeredPane.POPUP_LAYER);
			else
				add(new square(new Point(random.nextInt(0, 100), random.nextInt(0, 100)),
						random.nextInt(50, 100),
						new Color(random.nextFloat(), random.nextFloat(), random.nextFloat()),
						random.nextInt(0, 10) > 5), JLayeredPane.POPUP_LAYER);
		}
		setVisible(true);
	}

}
