package com.neuedu.thread;

public class TicketThread2 implements Runnable{
	private int num = 50;
	
	//###��###
	public void saleTicket(){
		synchronized(this) {//ͬ�����
		num--;
		String a = String.format("%03d", (50-num));
		System.out.println("[Ticket Number]:0"+Thread.currentThread().getName()+a);
		}
//		System.out.println("10�д���");
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(num>2)saleTicket();
	}
	
}
