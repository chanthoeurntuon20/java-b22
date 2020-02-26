package abstract_interface1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Thing> allThings = new ArrayList<>();
		Bike bikeValid = new Bike("bike1",1,true,true);
		Bike bikeInvalid = new Bike("bike2",3,false,false);
		allThings.add(bikeValid);
		allThings.add(bikeInvalid);
		
		ItTeacher teacherValid = new ItTeacher("Channak",4);
		ItTeacher teacherInvalid = new ItTeacher("Ronnan",2);
		allThings.add(teacherValid);
		allThings.add(teacherInvalid);
		
		RiceCooker ricecookerValid = new RiceCooker("ricecooker1",3);
		RiceCooker ricecookerInvalid = new RiceCooker("ricecooker2",6);
		allThings.add(ricecookerValid);
		allThings.add(ricecookerInvalid);
		
		
		
		
		for(Thing thing : allThings) {
			
			if(thing.isValid()) {
				System.out.println(thing.getName() + ": Valid");
			}else {
				System.out.println(thing.getName() + ": Invalid");
			}
		}
		
		
	}

}
