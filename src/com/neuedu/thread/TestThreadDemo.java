package com.neuedu.thread;

public class TestThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo t1 = new ThreadDemo();
		t1.start();
		ThreadDemo t2 = new ThreadDemo();
		t2.start();
//		t1.run();
//		for(int i=0;i<20;i++) {
//			System.out.println("Main:"+i);
//		}
	}

}
