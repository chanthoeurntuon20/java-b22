package homework_abstracts;

public class BatMobile extends Vehicle{

	boolean isBatmanHere = false;
	BatMobile(String plateID,float weight,boolean isBatmanHere){
		super(plateID,weight);
		this.isBatmanHere = isBatmanHere;
	}
	
	
	public String toString() {
		return "BatMobile " + super.toString();
	}


	@Override
	int getMaximalSpeed() {
		int speed;
		if(isBatmanHere) {
			speed = 500;
		}else {
			speed = 110;
		}
		return speed;
		
	}
}
