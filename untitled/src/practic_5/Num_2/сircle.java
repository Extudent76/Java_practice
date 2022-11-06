package practic_5.Num_2;
import java.awt.*;
import java.util.Random;
public class сircle extends shape {
	protected int radius;
	public сircle(Point point, int radius, Color color, boolean filled) {
		super(point, color, filled);
		this.radius = radius;
	}
	@Override
	public void paint(Graphics g) {
		Random random = new Random();
		super.paint(g);
		if (filled)
			g.fillOval(random.nextInt(0, 40), random.nextInt(0, 40), radius, radius);
		else
			g.drawOval(random.nextInt(0, 40), random.nextInt(0, 40), radius, radius);
	}
}
