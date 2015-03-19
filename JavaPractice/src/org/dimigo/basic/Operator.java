package org.dimigo.basic;

public class Operator {
	public static void main(String[] args){
		int a1 = 9, b1 = 10;
		double	h1 = 5.8;
		double r1 = ((a1+b1)*h1)/2;
		
		int a2 = 9;
		double h2 = 5.4;
		double r2 = a2*h2;
		
		double r3 = r1 - r2;
		
		System.out.println("<<도형 넓이 비교>>");
		System.out.println("사다리꼴의 넓이 : " + r1);
		System.out.println("평행사변형 넓이 : " + r2);
		System.out.println(" ");
		System.out.println("사다리꼴이 평행사변형 보다 " + r3 + "더 큽니다.");
		
}
}