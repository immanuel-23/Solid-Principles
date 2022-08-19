package com.aurionpro.model;

public class Manager implements IWorker {

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("Manager has started work");

	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("Manager has stoped work");


	}

	@Override
	public void startEat() {
		// TODO Auto-generated method stub
		System.out.println("Manager has started eating");


	}

	@Override
	public void stopEat() {
		// TODO Auto-generated method stub
		System.out.println("Manager has stoped eating");


	}

}
