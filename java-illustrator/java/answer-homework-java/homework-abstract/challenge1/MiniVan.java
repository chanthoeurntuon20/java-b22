package homework_abstracts;

public class MiniVan {
	String plateID;
	float weight;
	int nbCustomers;
	 MiniVan(String plateID,float weight,int nbCustomers){
		this.plateID = plateID;
		this.weight = weight;
		this.nbCustomers = nbCustomers;
	}
	 int getMaximalSpeed(){
			int maximalSpeed = 130;
			int decreasedSpeed = 10;
			int	speedEachPassenger = maximalSpeed - (decreasedSpeed * nbCustomers);
			return speedEachPassenger;
		}
	public String toString() {
		return "MiniVan [plate id = " + plateID + ", weight = "+ weight;
	}
}
