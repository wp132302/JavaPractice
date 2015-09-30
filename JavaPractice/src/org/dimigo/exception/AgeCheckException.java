package org.dimigo.exception;

public class AgeCheckException extends Exception {

	public AgeCheckException(){
		super();
	}
	
	public AgeCheckException(Movie movie ) {
		System.out.println(movie.getTitle() + "은" + movie.getLimitAge() + "세 이상 관람가능입니다.");
	}
}
