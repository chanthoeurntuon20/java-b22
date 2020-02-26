package abstract_interface1;

public class RiceCooker extends Thing implements Validable{

	private int age;
	private int numberOfUse;
	
	RiceCooker(String name,int age) {
		super(name);
		this.age = age;
		this.numberOfUse = numberOfUse;
	}

	@Override
	public boolean isValid() {
		boolean validate;
		if(age < 5 && numberOfUse < 500) {
			validate = true;
		}else {
			validate = false;
		}
		return validate;
	}
}
