package observerFiles;

public class ObserverFilesApp {

	public static void main(String args[]) {
		
		Follower fol1 = new Follower("Jimmy");
		Follower fol2 = new Follower("MrSoap");
		Follower fol3 = new Follower("CarlJr");
		
		Channel GameGrumps = new Channel("GameGrumps");
		
		GameGrumps.registerObserver(fol1);
		GameGrumps.registerObserver(fol2);
		GameGrumps.registerObserver(fol3);
		
		GameGrumps.setStatus("About to play Mario 64 grumpies!");
		
		GameGrumps.notifyObservers();
		
		GameGrumps.removeObserver(fol2);
		
		GameGrumps.notifyObservers();
		
	}
	
}
