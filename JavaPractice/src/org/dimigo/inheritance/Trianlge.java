package org.dimigo.inheritance;

public class Trianlge extends Figure{
	private int width;
	private int height;
	
	public Trianlge(int width, int height) {
		super(0, 0);
		this.width = width;
		this.height = height;
	}
	
	public Trianlge(int centerX, int centerY, int width, int height) {
		super(centerX, centerY);
		this.width = width;
		this.height = height;
	}
	
	protected double calcArea(int width, int height) {
		return(width * height) / 2;
	}
	
	protected void printCenter() {
		System.out.print("삼각형 ");
		super.printCenter();
	}
}
	