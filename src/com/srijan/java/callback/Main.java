package com.srijan.java.callback;


//In earlier days using C programming language, callback used to be done by a concept called 
//function pointer
//In OO languages like Java and C++, callback mechanism is done by using an interface
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caller caller = new Caller();
		
		caller.delegateTaskToCallee();
		
		caller.otherTasksOfCallee();

	}

}
