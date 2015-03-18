package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		
		int Month = 1700000;
		int Worker = 3;
		int Store = 1500;
		
		long year = ((long) Month * (long) Worker * (long) Store)  * 12;
				
		
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 평균 급여 : " + String.format("%,d",Month) + "원");
		System.out.println("점포 내 직원 수 : " + String.format("%,d", Worker) + "명");
		System.out.println("점포 수 : " + String.format("%,d", 1500) + "개");
		
		System.out.println("연간 인건비 : " + String.format("%,d", year) + "원");
	}

}
