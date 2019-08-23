package com.srijan.java.callback;

public class Callee {
	
	private Callback cb;
	
	public Callee(Callback cb){
		this.cb = cb;
	}
	
	public void doTask(){
		System.out.println("Task has started");
		
		
		//This is just the simulation that the task is happening
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		for(long i = 0; i < 1000000000; i++){
			
		}*/
		
		
		System.out.println("Task finished");
		cb.notifyCaller();
		
		/*
		//Asynchronous callback
		System.out.println("Task has started");
		Thread thread = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				try {
					Thread.sleep(50000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("Task finished");
				cb.notifyCaller();
				
				
			}
			
			
		});
		
		
		thread.start();*/
	}

}
