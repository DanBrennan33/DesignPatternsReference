package flyweight.pattern.demo;

public class FlyweightPatternEx {
	public static void main(String[] args) throws Exception {
		RobotFactory myFactory = new RobotFactory();
		System.out.println("***Flyweight Pattern Example***\n");
		
		IRobot shape = myFactory.GetRobotFromFactory("small");
		shape.Print();
		
		for (int i = 0; i < 2; i++) {
			shape = myFactory.GetRobotFromFactory("small");
			shape.Print();
		}
		
		int NumOfDistinctRobots = myFactory.TotalObjectsCreated();
		System.out.println("\nDistrict Robot objects created till now = " + NumOfDistinctRobots);
		
		for (int i = 0; i < 5; i++) {
			shape = myFactory.GetRobotFromFactory("large");
			shape.Print();
		}
		
		NumOfDistinctRobots = myFactory.TotalObjectsCreated();
		System.out.println("\n Finally no of Distinct Robot objects created = " + NumOfDistinctRobots);
	}
}
