package com.neuedu.thread;

public class TestTicketThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketThread tt = new TicketThread();
		Thread t1 = new Thread(tt,"1");
		Thread t2 = new Thread(tt,"2");
		Thread t3 = new Thread(tt,"3");
		t1.start();
		t2.start();
		t3.start();
	}

}
