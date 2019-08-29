package tw.com.strategyPattern.havior.impl;

import tw.com.strategyPattern.havior.QuackBehavior;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squeak");

	}

}
