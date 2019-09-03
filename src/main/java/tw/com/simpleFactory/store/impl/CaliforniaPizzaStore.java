package tw.com.simpleFactory.store.impl;

import tw.com.simpleFactory.enumeration.PizzaType;
import tw.com.simpleFactory.food.Pizza;
import tw.com.simpleFactory.food.california.CaliforniaCheesePizza;
import tw.com.simpleFactory.food.california.CaliforniaGreekPizza;
import tw.com.simpleFactory.food.california.CaliforniaPepperoniPizza;
import tw.com.simpleFactory.store.PizzaStore;

public class CaliforniaPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(PizzaType type) {
		Pizza pizza = null;
		switch(type) {
		case CheesePizza:
			pizza = new CaliforniaCheesePizza();
			break;
		case GreekPizza:
			pizza = new CaliforniaGreekPizza();
			break;
		case PepperoniPizza:
			pizza = new CaliforniaPepperoniPizza();
			break;
		default:
			System.out.println("We don't have this type pizza.");
		}
		return pizza;
	}

}
