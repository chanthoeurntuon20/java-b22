package homework_abstracts.challenge3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class VehicleConvoy{
	public List<Vehicle> convoy = new ArrayList<>();
	public void addVehicle(Vehicle vehicle) {
		convoy.add(vehicle);//add object to arraylist
	}
	public int getMaximalSpeed() {
		//int iminSpeed = vihecles.get(0).getMaximalSpeed();
		// for(int i = 1; i < vihecles.size; i++){
		//int 
		//}
		List lowestSpeed = new ArrayList<>();//store speed
		
		for(Vehicle vihicle : convoy) {
			lowestSpeed.add(vihicle.getMaximalSpeed());//add speed to array list lowestSpeed
		}
		int lowest = 0;
		for (int counter = 0; counter < lowestSpeed.size(); counter++) { 		      
	          lowest = (int) Collections.min(lowestSpeed); //search lowest speed
	    }   
		
		return lowest;
	}
	
}
