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

/* 	�����߳��࣬ʵ��Runnable�ӿ�
*	implements Runnable
*	��д�����run����
*	ʹ���߳�ʱ�������Լ�������߳��ഴ���̶߳���
*	Ȼ�󣬴���һ��Thread���󣬲���Ϊ�������̶߳���
*	����Thread�����start����
*/