package com.capg.multithreading;

public class Test1 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
		System.out.println("Executed by "+Thread.currentThread().getName()+"===>"+i);
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
	public static void main(String[] args) {
		System.out.println("Main thread name is : "+Thread.currentThread().getName());
		 Test1 t1 = new Test1();
		 t1.setName("vipin"); 
		 t1.start();
	}

}
