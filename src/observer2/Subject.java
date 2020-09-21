package observer2;

public interface Subject {
	
	public void addObserver(Observer observer);
	public void removeOberserver(Observer observer);
	public void notifyObservers();

}
