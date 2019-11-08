package tw.com.adaptor;

public class TurkeyAdator implements Duck {
	
	private Turkey turkey;

	public TurkeyAdator(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		for(int i=0; i<=5;i++) {
			turkey.fly();
		}
	}

}
