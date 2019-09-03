package tw.com.simpleFactory.food;

public abstract class Pizza {
	
	protected String name;
	
	protected String dough;
	
	protected String sauce;
	
	
	public void prepare() {
		System.out.println("Prepare Pizza");
	};
	
	public void bake() {
		System.out.println("Bake Pizza");
	};

	public void cut() {
		System.out.println("Cut Pizza");
	};
	
	public void box() {
		System.out.println("Box Pizza");
	};

}
