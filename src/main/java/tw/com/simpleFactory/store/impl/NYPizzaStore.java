package tw.com.simpleFactory.store.impl;

import tw.com.simpleFactory.enumeration.PizzaType;
import tw.com.simpleFactory.food.Pizza;
import tw.com.simpleFactory.food.newYork.NYCheesePizza;
import tw.com.simpleFactory.food.newYork.NYGreekPizza;
import tw.com.simpleFactory.food.newYork.NYPepperoniPizza;
import tw.com.simpleFactory.store.PizzaStore;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(PizzaType type) {
		Pizza pizza = null;
		switch(type) {
		case CheesePizza:
			pizza = new NYCheesePizza();
			break;
		case GreekPizza:
			pizza = new NYGreekPizza();
			break;
		case PepperoniPizza:
			pizza = new NYPepperoniPizza();
			break;
		default:
			System.out.println("We don't have this type pizza.");
		}
		return pizza;
	}
}
