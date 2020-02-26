package homework_abstracts;

public abstract class Vehicle {
	String plateID;
	float weight;
	public Vehicle(String plateID, float weight) {
		this.plateID = plateID;
		this.weight = weight;
	}
	abstract int getMaximalSpeed();
	public String toString() {
		return " [plate id = " + this.plateID + ", weight = " + this.weight;
	}
}
