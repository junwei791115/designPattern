package tw.com.strategyPattern.havior.impl;

import tw.com.strategyPattern.havior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm flying with a rocket !");
	}

}
