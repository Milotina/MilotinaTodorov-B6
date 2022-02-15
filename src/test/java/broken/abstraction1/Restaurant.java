package broken.abstraction1;

public abstract class Restaurant {

	public final double DISCOUNT = 20.00;
	public int luckyNumber = 12;
	public int waitTime = 20;
	public String name;

	public Restaurant(String name, int luckyNumber, int waitTime) {

//added this keyword to differentiate between instance variables & parameters
		this.name = name;
		this.luckyNumber = luckyNumber;
		this.waitTime = waitTime;

		System.out.println(this.name);
		System.out.println(this.waitTime);
		System.out.println(this.luckyNumber);
	}

	// abstract and static keywords CANNOT be used together
	// removed static
	public abstract void location();

	// static method cannot be overridden -> remove static
	public void setOperationTime() {
		System.out.println("Monday-Friday");
	}

	// this method requires a body instead of a semicolon
	public final void specialMenu() {
		System.out.println("Special Menu");
	}

	abstract void rating();

	// abstract method - NO BODY -> removed it
	public abstract void breakfastMenu();

	public abstract void lunchMenu();

	public abstract void dinnerMenu();

}
