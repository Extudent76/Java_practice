package practic_5.Num_2;
import java.awt.*;
import java.util.Random;
public class rectangle extends shape{
	protected int width;
	protected int length;
	public rectangle(Point point, int width, int length, Color color, boolean filled) {
		super(point, color, filled);
		this.width = width;
		this.length = length;
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Random random = new Random();
		if (filled)
			g.fillRect(random.nextInt(0, 40), random.nextInt(0, 40), width, length);
		else
			g.drawRect(random.nextInt(0, 40), random.nextInt(0, 40), width, length);
	}
}
