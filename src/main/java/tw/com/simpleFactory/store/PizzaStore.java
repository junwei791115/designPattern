package tw.com.simpleFactory.store;

import tw.com.simpleFactory.enumeration.PizzaType;
import tw.com.simpleFactory.food.Pizza;

public abstract class PizzaStore {

	public Pizza orderPizza(PizzaType type) {
		Pizza pizza = this.createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	public abstract Pizza createPizza(PizzaType type);
}
