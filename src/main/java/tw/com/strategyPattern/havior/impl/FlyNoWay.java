package tw.com.strategyPattern.havior.impl;

import tw.com.strategyPattern.havior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I can't fly !!");
	}

}
