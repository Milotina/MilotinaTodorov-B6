package broken.abstraction1;

//both are classes-> use extends
public class FastFood extends Restaurant {

	// added constructor in child class
	// added two parameters to child class constructor-> check RestaurantDemo
	public FastFood(String name, int luckynumber) {
		super("John Cena", 15, 30);
	}

	// cannot reduce the visibility of an inherited method
	// changed to public
	public void location() {
		System.out.println("Reston VA");
	}

	// static method cannot be overridden in Restaurant class
	@Override // override starts with capital O
	public void setOperationTime() {
		System.out.println("24/7");
	}

	// overridden method in Restaurant has no parameters
	// cannot reduce the visibility of an inherited method -> changed to public
	@Override
	public void lunchMenu() {
		System.out.println("Time: " + waitTime); // variable is waitTime
	}

	// cannot reduce the visibility of an inherited method -> changed to public
	// corrected method name + should have matching return type
	@Override
	public void breakfastMenu() {
		System.out.println("Not serving...");
	}

	// corrected method name + added void
	@Override
	public void dinnerMenu() {
		System.out.println("7PM-10PM");
	}

	public void display() {

		// final variables cannot be reassigned
		// DISCOUNT = 30.00;

		// cannot convert from double to integer
		luckyNumber = 22;

		// cannot convert from integer to String
		waitTime = 0;

		// rating() is an abstract method-> needs to be overridden
		// System.out.println(rating());
	}

	void rating() {
		System.out.println("Rating");
	}

	// no abstract methods in concrete class-> removed abstract
	public void getInfo() {
		System.out.println("This is info");
	}

	// no abstract methods in concrete class-> removed abstract
	public void setInfo() {
	}

}