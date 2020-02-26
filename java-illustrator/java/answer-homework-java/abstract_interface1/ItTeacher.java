package abstract_interface1;

public class ItTeacher extends Thing implements Validable{
	
	private int yearOfExperience;
	ItTeacher(String name,int yearOfExperience){
		super(name);
		this.yearOfExperience = yearOfExperience;
	}

	@Override
	public boolean isValid() {
		boolean validate;
		if(yearOfExperience > 2) {
			validate = true;	
		}else{
			validate = false;	
		}
		return validate;
	}
}
