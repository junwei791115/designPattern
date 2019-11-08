package tw.com.templatePattern.sort;

public class Duck implements Comparable<Duck> {

	private String name;
	private Integer weight;

	public Duck(String name, Integer weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Duck [name=" + name + ", weight=" + weight + "]";
	}

	@Override
	public int compareTo(Duck duck) {
		System.out.println("Sort");
		if (this.weight < duck.weight) {
			return 1;
		} else if (this.weight == duck.weight) {
			return 0;
		} else {
			return -1;
		}
	}

}
