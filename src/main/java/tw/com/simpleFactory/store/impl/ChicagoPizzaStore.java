package tw.com.simpleFactory.store.impl;

import tw.com.simpleFactory.enumeration.PizzaType;
import tw.com.simpleFactory.food.Pizza;
import tw.com.simpleFactory.food.chicago.ChicagoCheesePizza;
import tw.com.simpleFactory.food.chicago.ChicagoGreekPizza;
import tw.com.simpleFactory.food.chicago.ChicagoPepperoniPizza;
import tw.com.simpleFactory.store.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(PizzaType type) {
		Pizza pizza = null;
		switch(type) {
		case CheesePizza:
			pizza = new ChicagoCheesePizza();
			break;
		case GreekPizza:
			pizza = new ChicagoGreekPizza();
			break;
		case PepperoniPizza:
			pizza = new ChicagoPepperoniPizza();
			break;
		default:
			System.out.println("We don't have this type pizza.");
		}
		return pizza;
	}

}
