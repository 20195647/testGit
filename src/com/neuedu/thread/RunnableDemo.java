package com.neuedu.thread;

public class RunnableDemo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<20;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
	
}

/* 	定义线程类，实现Runnable接口
*	implements Runnable
*	重写父类的run方法
*	使用线程时，调用自己定义的线程类创建线程对象
*	然后，创建一个Thread对象，参数为创建的线程对象
*	调用Thread对象的start方法
*/