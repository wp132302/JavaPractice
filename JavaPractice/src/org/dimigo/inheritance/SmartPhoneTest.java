package org.dimigo.inheritance;

public class SmartPhoneTest extends SmartPhone {

	public static void main(String[] args) {
			SmartPhone[ ] phones = {
					new IPhone("iphone 6", "애플", 700000),
					new Galaxy("갤럭시 S6", "삼성", 650000)
			};
			
			for(SmartPhone phone : phones) {
				System.out.println(phone);
				phone.turnon();
				phone.pay();
				
				phone.useSpecialFunction();
				
				phone.turnoff();
				System.out.println();
			}

	}

}
