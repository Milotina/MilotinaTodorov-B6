package broken.abstraction2;

//This class should inerhit Subway
//class extends another class -> use extends
public class MyChoice extends Subway {

//if parent class has a parameterized constructor,
//child class must explicitly add constructor
	public MyChoice(String name, int duration) {
		super(name, duration);
	}

//child class method cannot have less visibility-> change to public, same parameter
	@Override
	public void setPrice(double price) {
		System.out.println("New : " + price);
	}

}