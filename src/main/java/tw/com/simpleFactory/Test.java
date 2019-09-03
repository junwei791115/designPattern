package tw.com.simpleFactory;

import tw.com.simpleFactory.enumeration.PizzaType;
import tw.com.simpleFactory.store.PizzaStore;
import tw.com.simpleFactory.store.impl.CaliforniaPizzaStore;
import tw.com.simpleFactory.store.impl.NYPizzaStore;

public class Test {
	public static void main(String[] args) {
		PizzaStore pizzaStore = new NYPizzaStore();
		pizzaStore.orderPizza(PizzaType.PepperoniPizza);
		
		pizzaStore = new CaliforniaPizzaStore();
		pizzaStore.orderPizza(PizzaType.PepperoniPizza);
	}
}
