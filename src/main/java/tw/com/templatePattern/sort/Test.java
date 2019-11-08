package tw.com.templatePattern.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
//		List<Duck> ducks = new ArrayList<Duck>();
//		ducks.add(new Duck("A", 10));
//		ducks.add(new Duck("B", 11));
//		ducks.add(new Duck("C", 10));
//		ducks.add(new Duck("D", 9));
//		ducks.add(new Duck("F", 20));
		
		Duck[] ducks = {
				new Duck("A", 10),
				new Duck("B", 11),
				new Duck("C", 10),
				new Duck("D", 9),
				new Duck("F", 20)
		};
		
		Arrays.sort(ducks);
		display(ducks);
	}

	public static void display(Duck[] ducks ) {
		for (Duck duck : ducks) {
			System.out.println(duck.toString());
		}
	}
}
