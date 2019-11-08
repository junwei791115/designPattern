package tw.com.adaptor;

import tw.com.adaptor.impl.MallardDuck;
import tw.com.adaptor.impl.WildTurkey;

public class DuckTestDriven {

	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		
		Turkey wildTurkey = new WildTurkey();
		Duck turkeyAdator = new TurkeyAdator(wildTurkey);
		
		System.out.println("The wildTurkey says...");
		wildTurkey.gobble();
		wildTurkey.fly();
		
		System.out.println("The duck says...");
		mallardDuck.quack();
		mallardDuck.fly();

		System.out.println("The turkeyadaptor says...");
		turkeyAdator.quack();
		turkeyAdator.fly();
	}

}
