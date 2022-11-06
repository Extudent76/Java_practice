package practic_5.Num_4;
import javax.swing.*;
import java.util.Objects;


class gif extends JFrame {
	private final ImageIcon[] imageIcon = new ImageIcon[]{
			new ImageIcon(Objects.requireNonNull(getClass().getResource("15.png"))),
			new ImageIcon(Objects.requireNonNull(getClass().getResource("14.png"))),
			new ImageIcon(Objects.requireNonNull(getClass().getResource("12.png"))),
			new ImageIcon(Objects.requireNonNull(getClass().getResource("13.png"))),
			new ImageIcon(Objects.requireNonNull(getClass().getResource("11.png"))),
			new ImageIcon(Objects.requireNonNull(getClass().getResource("0.png")))
	};
	JLabel image;
	int iter;

	gif() {
		super("Gif");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1000, 1100);
		getContentPane().add(image = new JLabel(imageIcon[iter]));
		Timer timer = new Timer(200, e -> showImages());
		timer.start();
		setVisible(true);

	}

	private void showImages() {
		image.setIcon(imageIcon[iter]);
		if (iter >= 3) iter = 0;
		else iter++;
	}

}
