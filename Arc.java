import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Arc extends Shape{
	private int width;
	private int height;
	private int startAngle;
	private int arcAngle;

	public Arc(int startx, int starty, int width, int height, int startAngle, int arcAngle) {
		super(startx, starty);
		this.width = width;
		this.height = height;
		this.startAngle = startAngle;
		this.arcAngle = arcAngle;
	}
	
	public void draw(Graphics g) {
		g.drawArc(super.getX(), super.getY(), width, height, startAngle, arcAngle);
	}
}
