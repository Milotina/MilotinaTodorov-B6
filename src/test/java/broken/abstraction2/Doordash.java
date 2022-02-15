package broken.abstraction2;

public interface Doordash {

// interfaces CANNOT have constructors
//		public Doordash(String name, int duration) {	
//			System.out.println("Name:" + name);
//			System.out.println("Duration:" + duration);
//		}

	// abstract is added by default in interface -> no need to use
	public abstract void delivery();

	// abstract is added by default in interface -> no need to use
	public abstract void fee();

	// abstract should not be used in default
	// method should have a body
	default void pickUp() {
		System.out.println("Pick Up");
	}

	// return type should be void if not returning any value
	default void getLocation() {
		System.out.println("Rest Town Center");
	}

	// if returning value-> String
	public static String setLocation(String location) {
		location = "Reston";
		System.out.println(location);
		return location;
	}
}