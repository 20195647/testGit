package com.neuedu.thread;

public class ThreadDemo extends Thread{

	@Override
	public void run() {
		// �߳�
		for(int i=0;i<20;i++) {
			String a = Integer.toString(i);
			Thread.currentThread().setName("����ʱ:"+i);
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

/* 	�����߳��࣬ͨ���̳�Thread����ʵ��
*	extends Thread
*	��д�����е�run����
*	ʹ���߳�ʱ�������Լ�������߳��ഴ���̶߳���
*	�����̶߳����start����
*/