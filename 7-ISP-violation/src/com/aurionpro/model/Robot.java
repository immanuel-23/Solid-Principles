package com.aurionpro.model;

public class Robot implements IWorker {

	@Override
	public void startWork() {
		System.out.println("Robot has started working");

	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("Robot has stoped working");


	}

	@Override
	public void startEat()  {
		// TODO Auto-generated method stub
		//System.out.println("Robot has started Eating");
		throw new RuntimeException("Robot cant eat");

	}

	@Override
	public void stopEat() {
		// TODO Auto-generated method stub
		//System.out.println("Robot has stoped eating");
		throw new RuntimeException("Robot cant eat");



	}

}
