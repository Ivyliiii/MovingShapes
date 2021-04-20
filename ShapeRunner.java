import java.awt.Color;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;

public class ShapeRunner {
	ArrayList<Shape> shape_list;
	
	// this method should move all the shapes in the list
	public void moveShapes() {
		
		for(Shape s: shape_list) {
			
			s.move(5, 5);
		}
	}
	
	// fill in your shape list here
	public void setup() {
		shape_list = new ArrayList<Shape>();
		shape_list.add(new Shape(0, 0));
		shape_list.add(new Oval(40,50,100,200));
		shape_list.add(new Rect(100, 200, 180, 150));
		shape_list.add(new Arc(10, 30, 250, 420, 40, -20));
	}
	
	// DON'T TOUCH BELOW CODE
	
	public void run() {
		while (true ) {
			moveShapes();
			frame.repaint();
			try {
				Thread.sleep(75);
			} catch (Exception ex) {}
		}
	}
	
	public static void main(String[] args) {
		new ShapeRunner(); 
	}
	private JFrame frame;
	public ShapeRunner() {
		setup();
		frame = new JFrame() {
			public void paint(Graphics g) {
				g.setColor(Color.WHITE);
				g.fillRect(0, 0, 600, 600);
				
				for (Shape s: shape_list)
					s.draw(g);
			}
		};
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		run();
	}
}