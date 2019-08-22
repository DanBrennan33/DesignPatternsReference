package prototype.pattern.demo;

public class PrototypePatternEx {
	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("***Prototype Pattern Demo***\n");
		
		BasicCar nano_base = new Nano("Green Nano");
		nano_base.price = 100000;
		
		BasicCar ford_basic = new Ford("Ford Yellow");
		ford_basic.price = 50000;
		
		BasicCar bc1;
		// Clone Nano Object
		bc1 = nano_base.clone();
		// Price will be more than 100000 for sure
		bc1.price = nano_base.price+BasicCar.setPrice();
		System.out.println("Car is: " + bc1.modelName + "  - $" + bc1.price);
		
		// Clone Ford Object
		bc1 = ford_basic.clone();
		// Price will be more than 50000 for sure
		bc1.price = ford_basic.price+BasicCar.setPrice();
		System.out.println("Car is: " + bc1.modelName + " - $" + bc1.price);
	}
}
