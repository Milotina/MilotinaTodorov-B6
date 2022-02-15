package broken.abstraction2;

//this class should inerhit DoorDash && Healthy
//MUST IMPLEMENT ALL ABSTRACT METHODS OF BOTH INTERFACES
//should use implements, Doordash is misspelled, use comma
public class Chipotle implements Doordash, Healthy {

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
