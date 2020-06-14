package com.demo;

public class ThreadTest {

	public static void main(String[] args) {
		Mythread thread1 = new Mythread();
		Thread thread2 = new Thread(new AnotherThread());
		Thread thread3 = new Thread(new Runnable() {

			@Override
			public void run() {
				
				System.out.println("third thread");
				
				
			}
			
		});
		Thread thread4 = new Thread(()->System.out.println("fourth thread"));
		
		thread1.start();
		try {
			thread1.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread2.start();

	}

}

class Mythread extends Thread {
	@Override
	public void run() {

		System.out.println("inside mythread");
		for (int i = 0; i < 50; i++) {
			System.out.println("i is " + i);
		}
	}
}

class AnotherThread implements Runnable {

	@Override
	public void run() {

		System.out.println("in another thread");
		for (int i = 51; i < 100; i++) {
			System.out.println("i is " + i);
		}

	}

}
