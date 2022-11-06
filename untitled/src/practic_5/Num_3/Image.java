package practic_5.Num_3;
import javax.swing.*;
public class Image extends JFrame {
	public Image() {
		super();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JLabel jLabel = new JLabel();
		ImageIcon imageIcon = new ImageIcon("1.png");
		setSize(imageIcon.getIconWidth(), imageIcon.getIconHeight());
		jLabel.setIcon(imageIcon);
		add(jLabel);
		setVisible(true);
	}
}
