package org.dimigo.oop;

public class Car {
	
		private String company = "현대자동차";
		private String model = "제네시스";
		private String color = "검정색";
		private int maxSpeed = 225;
		private int price = 50000000;
	
		
		public String getCompany(){
			return company;
		}
		
		public String getModel() {
			return model;
		}
		
		public String getColor() {
			return color;
		}
		
		public int getMaxSpeed() {
			return maxSpeed;
		}
		
		public int getPrice() { 
			return price;
		}
		
		public void setCompany(String company) { 
			this.company = company;
		}
		
		public void setModel(String model) {
			this.model = model;
		}
		
		public void setColor(String color) {
			this.color = color;
		}
		
		public void setMaxSpeed(int maxSpeed) {
			this.maxSpeed = maxSpeed;
		}
		
		public void setPrice(int price) {
			this.price = price;
		}
	}


