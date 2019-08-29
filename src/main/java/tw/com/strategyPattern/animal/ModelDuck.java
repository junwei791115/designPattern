package tw.com.strategyPattern.animal;

import tw.com.strategyPattern.havior.impl.FlyNoWay;
import tw.com.strategyPattern.havior.impl.FlyRocketPowered;
import tw.com.strategyPattern.havior.impl.Quack;

public class ModelDuck extends Duck {
	
	

	public ModelDuck() {
		quackBehavior = new Quack();
		flyBehavior= new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("I'm a real Model duck");
	}
	
	public static void main(String[] args) {
		Duck ModelDuck = new ModelDuck();
		ModelDuck.performFly();
		ModelDuck.setFlyBehavior(new FlyRocketPowered());
		ModelDuck.performFly();
	}

}
