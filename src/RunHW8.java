import java.util.Random;

public class RunHW8 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PublisherImplementation pub = new PublisherImplementation();
		Observer sO = new SubcriberOdds();
		Observer sE = new SubcriberEvens();
		Observer sT = new SubcriberThrees();
		
		pub.registerObserver(sO);
		pub.registerObserver(sE);
		pub.registerObserver(sT);
		
		pub.runSimulation();
	}

}
