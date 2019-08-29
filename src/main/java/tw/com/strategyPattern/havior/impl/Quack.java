package tw.com.strategyPattern.havior.impl;

import tw.com.strategyPattern.havior.QuackBehavior;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quack");

	}

}
