package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		
	
		String name = "아이유";		
		boolean gender = false;
		
		int i1 = 23;
		double d1 = 161.8;
		float f1 = (float) 44.3;
		char ch1 = 'A';
		
		System.out.println("<<아이유 프로필>>");
		System.out.println("");
		System.out.println("이름 : 아이유");
		
		if(!gender) {
			System.out.println("성별 : " + "여자");
		} else{
			System.out.println("성별 : " + "남자");
		}	
		
		System.out.println("혈액형 : " + i1 + "세");
		System.out.println("나이 : " + d1 + "cm");
		System.out.println("몸무게 : "+ f1 + "kg");
		System.out.println("혈액형 : " + ch1 + "형");
	}

}
