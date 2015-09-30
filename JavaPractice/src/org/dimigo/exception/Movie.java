package org.dimigo.exception;

public class Movie {


	private String title;
	private int limitAge;
	
	Movie(String title, int limitAge) {
		super();
		this.title = title;
		this.limitAge = limitAge;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public int getLimitAge() {
		return this.limitAge;
	}
	
	
}
