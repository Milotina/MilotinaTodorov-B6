package broken.abstraction2;

public class DoorDashDemo {

// missing main method
	public static void main(String[] args) {

// cannot instantiate an interface
//			DoorDash obj1 = new DoorDash("John", 123);

// cannot instantiate an interface
//			Healthy obj2 = new Healthy();

		// create object of Subway
		// pass parameters
		Subway obj3 = new Subway("John", 123);
		obj3.setPrice(22.22);

		// Chipotle is NOT extending Subway
		// create a constructor of Chipotle
		Chipotle obj4 = new Chipotle();
		obj4.fee();

		// MyChoice extends Subway
		// pass parameters, change name of duplicate object name
		Subway obj6 = new MyChoice("John", 123);
		obj6.setPrice(33.33); // pass parameter

// already called on line 17 with parameters -> obj3
//			Subway obj5 = new Subway();

// final variables cannot be reassigned
//			obj5.amount = 22;
//			obj5.name = "MD";

		// static -> to static -> interfaceName.variableName
		System.out.println(Healthy.amount);
		System.out.println(Healthy.name);

	}
}