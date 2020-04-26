package observerFiles;

public class Follower implements Observer{
	
	private String followerName;
	
	public Follower(String name) {
		this.followerName = name;
	}
	
	public void update(String status) {
		System.out.println(this.followerName + " received update.");
	}
	
	public void play() {
		System.out.println(this.followerName + " is playing video.");
	}

}
