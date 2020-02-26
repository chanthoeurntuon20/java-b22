package homework_abstracts;

public class TucTuc extends Vehicle{
	int nbCustomers;
	 TucTuc(String plateID,float weight,int nbCustomers){
		 super(plateID,weight);
		 this.nbCustomers = nbCustomers;
	}
	
	@Override
	int getMaximalSpeed() {
		int maximalSpeed = 130;
		int decreasedSpeed = 5;
		int	speedEachPassenger = maximalSpeed - (decreasedSpeed * nbCustomers);
		return speedEachPassenger;
	}
	public String toString() {
		return "TucTuc " + super.toString();
	}
}
