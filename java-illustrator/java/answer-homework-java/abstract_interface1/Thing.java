package abstract_interface1;

public abstract class Thing implements Validable {
	private String name;
	Thing(String name){
		this.setName(name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
