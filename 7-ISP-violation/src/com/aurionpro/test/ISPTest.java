package com.aurionpro.test;

import com.aurionpro.model.IWorker;
import com.aurionpro.model.Manager;
import com.aurionpro.model.Robot;

public class ISPTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager();
		Robot robot = new Robot();
		atWorkStation(manager);
		System.out.println("_____________________________________");
		atWorkStation(robot);

	}

	private static void atWorkStation(IWorker worker) {
		// TODO Auto-generated method stub
		worker.startWork();
		worker.stopWork();
		worker.startEat();
		worker.stopEat();
		
	}

}
