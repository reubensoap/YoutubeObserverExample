package observerFiles;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject{
	
	private List<Observer> observers = new ArrayList<Observer>();
	private String channelName;
	private String status;
	
	public Channel(String name) {
		this.channelName = name;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public void setStatus(String status) {
		this.status = this.channelName + " is currently " + status;
	}
	
	public void notifyObservers() {
		for(Observer ob : observers) {
			ob.update(this.status);
		}
	}
	
	public void registerObserver(Observer ob) {
		this.observers.add(ob);
	}
	
	public void removeObserver(Observer ob) {
		this.observers.remove(ob);
	}
	
}
