package abstract_interface1;

public class Bike extends Thing implements Validable{

	private int age;
	private boolean isFrontBreakWorking;
	private boolean isBackBreakWorking;
	Bike(String name,int age,boolean isFrontBreakWorking,boolean isBackBreakWorking){
		super(name);
		this.age = age;
		this.isBackBreakWorking = isBackBreakWorking;
		this.isFrontBreakWorking = isFrontBreakWorking;
	}
	@Override
	public boolean isValid() {
		boolean validate;
		if(age < 2 && isFrontBreakWorking || isBackBreakWorking) {
			validate = true;
		}else {
			validate = false;
		}
		return validate;
	}
}
