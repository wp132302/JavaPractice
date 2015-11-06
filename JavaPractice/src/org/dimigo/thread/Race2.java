package org.dimigo.thread;

public class Race2 {

	public static void main(String[] args) {	
		
		System.out.println("main thread starts!!");
		
		Thread t1 = new  Thread(new Runner2("홍길순"));
		Thread t2 = new Thread (new Runner2("홍길동"));
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		
		System.out.println("main thread end");
		
		
	}
}
