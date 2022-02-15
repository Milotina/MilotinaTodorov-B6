package broken.abstraction2;

public interface Healthy {

// variables in interface are public, static, final by default
// final variables must be initialized at declaration
	int amount = 10;
// variables in interface are public, static, final by default
// variables cannot be abstract, must be initialized at declaration
	String name = "John";

// interfaces CANNOT have constructors
//		public Healthy(int calorie) {
//			System.out.println("Calorie: " + calorie );
//		}

// interfaces CANNOT have constructors
//		public Healthy(int calorie, int amount) {
//			System.out.println("Amount: " + amount);
//			System.out.println("Calorie:" + calorie);
//		}

	// interface has only abstract methods -> NO BODY
	public abstract void getCalories(String type);

	// abstract is added by default in interface -> no need to use
	public abstract void setCalories();
}