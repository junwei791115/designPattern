package tw.com.strategyPattern.animal;

import tw.com.strategyPattern.havior.FlyBehavior;
import tw.com.strategyPattern.havior.QuackBehavior;

public abstract class Duck {
	QuackBehavior quackBehavior;
	
	FlyBehavior flyBehavior;
	
	
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void swim() {
		System.out.println("All duck float, entn decoys");
	}
	
	public abstract void display();
	
	
	
}
