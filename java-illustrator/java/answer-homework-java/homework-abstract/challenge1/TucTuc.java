package homework_abstracts;

public class TucTuc {
	String plateID;
	float weight;
	int nbCustomers;
	 TucTuc(String plateID,float weight,int nbCustomers){
			this.plateID = plateID;
			this.weight = weight;
			this.nbCustomers = nbCustomers;
	}
	 int getMaximalSpeed(){
			int maximalSpeed = 130;
			int decreasedSpeed = 5;
			int	speedEachPassenger = maximalSpeed - (decreasedSpeed * nbCustomers);
			return speedEachPassenger;
		}
	public String toString() {
		return "TucTuc [plate id = " + plateID + ", weight = "+ weight;
	}
}
