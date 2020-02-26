package homework_abstracts.challenge3;

public class MiniVan extends Vehicle{
	int nbCustomers;
	 MiniVan(String plateID,float weight,int nbCustomers){
		super(plateID,weight);
		this.nbCustomers = nbCustomers;
	}
	public String toString() {
		return "MiniVan " + super.toString();
	}
	@Override
	int getMaximalSpeed() {
		int maximalSpeed = 130;
		int decreasedSpeed = 10;
		int	speedEachPassenger = maximalSpeed - (decreasedSpeed * nbCustomers);
		return speedEachPassenger;
	}
}
