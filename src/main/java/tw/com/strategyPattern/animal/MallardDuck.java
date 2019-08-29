package tw.com.strategyPattern.animal;

import tw.com.strategyPattern.havior.impl.FlyWithWings;
import tw.com.strategyPattern.havior.impl.Quack;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior= new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
	
	public static void main(String[] args) {
		Duck MallardDuck = new MallardDuck();
		MallardDuck.performQuack();
		MallardDuck.performFly();
	}

}
