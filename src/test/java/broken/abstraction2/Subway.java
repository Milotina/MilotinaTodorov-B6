package broken.abstraction2;

//this class should inerhit DoorDash && Healthy
//MUST IMPLEMENT ALL ABSTRACT METHODS OF BOTH INTERFACES
//should use implements, Doordash is misspelled, use comma
public class Subway implements Doordash, Healthy {

	public Subway(String name, int duration) {

//interfaces CANNOT have constructors-> cannot call with super
//		super(name, duration);

		System.out.println("name:" + name);
		System.out.println("duration: " + duration);
	}

	public void setPrice(double price) {
		System.out.println("Price: " + price);
	}
	
//MUST IMPLEMENT ALL ABSTRACT METHODS OF BOTH INTERFACES
	public void delivery() {
		System.out.println("Delivery");
	}

	public void fee() {
		System.out.println("Fee");
	}

	public void getCalories(String type) {
		System.out.println("Type: " + type);
	}

	public void setCalories() {
		System.out.println("Calories");
	}
}
