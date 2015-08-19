package org.dimigo.inheritance;

public class FigureTest {

	public static void main(String[] args) {
			Circle c = new Circle(0, 0, 5);
			Rectangle r = new Rectangle(10, 10, 5, 8);
			Triangle t = new Triangle(20, 20, 5, 8);
			
			c.printCenter();
			r.printCenter();
			t.printCenter();
			
			System.out.println("-- x, y축으로 5만큼 이동");
			c.moveFigure(5, 5);
			r.moveFigure(5, 5);
			t.moveFigure(5, 5);
		
			c.printCenter();
			r.printCenter();
			t.printCenter();
	}
}
