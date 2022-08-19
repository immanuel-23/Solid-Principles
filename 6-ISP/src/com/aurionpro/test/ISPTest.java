package com.aurionpro.test;

import com.aurionpro.model.IWorker;
import com.aurionpro.model.Manager;
import com.aurionpro.model.Robot;

public class ISPTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager();
		atTheWorkStation(manager);
		atIeatable(manager);
		Robot robot = new Robot();
		atTheWorkStation(robot);

	}

	private static void atIeatable(Manager manager) {
		manager.startEat();
		manager.stopEat();

	}

	private static void atTheWorkStation(IWorker worker) {
		// TODO Auto-generated method stub
		worker.startWork();
		worker.stopWork();

	}

}
