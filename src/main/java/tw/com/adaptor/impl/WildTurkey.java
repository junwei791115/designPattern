package tw.com.adaptor.impl;

import tw.com.adaptor.Turkey;

public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		System.out.println("Gobble Gobble");
	}

	@Override
	public void fly() {
		System.out.println("I'm flying short distance.");
	}

}
