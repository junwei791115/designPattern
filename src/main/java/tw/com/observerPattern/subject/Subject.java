package tw.com.observerPattern.subject;

import tw.com.observerPattern.observer.Observer;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObderver(Observer o);
	public void notifyObderver();
}
