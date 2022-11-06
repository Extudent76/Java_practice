package practic_5.Num_2;

import javax.swing.*;
import java.awt.*;

public class shape extends JComponent {
	protected Color color;
	protected boolean filled;
	Point point;

	public shape(Point point, Color color, boolean filled) {
		this.point = point;
		this.color = color;
		this.filled = filled;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	@Override
	public void paint(Graphics g) {
		g.setColor(color);
	}
}
