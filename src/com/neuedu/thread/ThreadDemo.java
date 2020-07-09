package com.neuedu.thread;

public class ThreadDemo extends Thread{

	@Override
	public void run() {
		// 线程
		for(int i=0;i<20;i++) {
			String a = Integer.toString(i);
			Thread.currentThread().setName("已用时:"+i);
			System.out.println(Thread.currentThread().getName()+":"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

/* 	定义线程类，通过继承Thread父类实现
*	extends Thread
*	重写父类中的run方法
*	使用线程时，调用自己定义的线程类创建线程对象
*	调用线程对象的start方法
*/