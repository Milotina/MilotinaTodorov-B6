package broken.abstraction1;

public class RestaurantDemo {

	// String should start with capital letter; removed semicolon
	public static void main(String[] args) {

//cannot instantiate an abstract class-> but can child class
//Restaurant was misspelled; use Upcasting;
		Restaurant obj1 = new FastFood("John C", 12);
		obj1.location();
		System.out.println(obj1.DISCOUNT);

		// create object of child class
		FastFood obj2 = new FastFood("John D", 15);
		obj2.getInfo(); // getInfo doesn't take any arguments
		obj2.setInfo();

		// FastFood was misspelled
		// added two parameters to child class constructor
		Restaurant obj3 = new FastFood("John Cena", 12);

		// final variables cannot be reassigned
		// obj3.DISCOUNT = 44.44;

		// don't use System.out.println
		obj3.dinnerMenu();
		obj3.lunchMenu();

	}

}