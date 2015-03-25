package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
			
			String car = "고속버스";
			int distance = 10;
			int charge;
			
			switch(car){
			case "고속버스":
				charge = 850;
				break;
				
			case "경차":
				charge = 300;
				break;
				
				default:
					charge = 600;
					break;
			}
			if(distance > 10){
				if(car == "고속버스"){
					charge = charge + (distance/10) * 300;
				}else{
					charge = charge + (distance/10) * 200;
				}
			}
			System.out.println("<< 고속도로 통행료 계산 >>");
			System.out.println("거리 : " + distance + "km");
			System.out.println("차종 : " + car);
			System.out.println("통행료 : " + charge + "원");
			
	}

}
