package com.neuedu.thread;

public class TicketThread implements Runnable{
	private int num = 50;
	
	//###��###
	public synchronized void saleTicket(){//ͬ������
		num--;
		String a = String.format("%03d", (50-num));
		System.out.println("[Ticket Number]:0"+Thread.currentThread().getName()+a);
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(num>2)saleTicket();
	}
	
}
