package com.srijan.java.callback;

public class Caller implements Callback{
	
	Callee callee;
	
	public Caller(){
		callee = new Callee(this);
	}

	@Override
	public void notifyCaller() {
		// TODO Auto-generated method stub
		
		//Here caller will take the result of the doTask method of callee
		//and do theappropriate action
		
		System.out.println("Thank you callee for executing the task...");
		
	}
	
	public void delegateTaskToCallee(){
		
		callee.doTask();
		
	}
	
	public void otherTasksOfCallee(){
		
		for (int i = 0; i < 20; i++){
			System.out.println("Caller is busy with his own task...");
		}
	
	}

}
