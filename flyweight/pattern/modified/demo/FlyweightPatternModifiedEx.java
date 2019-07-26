package flyweight.pattern.modified.demo;

import java.util.Random;

public class FlyweightPatternModifiedEx {
	public static void main(String[] args) throws Exception {
		RobotFactory myFactory = new RobotFactory();
		System.out.println("***Flyweight Pattern Modified Example***\n");
		Robot shape;
		
		for (int i = 0; i < 3; i++) {
			shape = (Robot) myFactory.GetRobotFromFactory("King");
			shape.setColor(getRandomColor());
			shape.Print();
		}
		
		for (int i = 0; i < 3; i++) {
			shape = (Robot) myFactory.GetRobotFromFactory("Queen");
			shape.setColor(getRandomColor());
			shape.Print();
		}
		
		int NumOfDistinctRobots = myFactory.TotalObjectsCreated();
		System.out.println("\nFinal no of Distinct Robot objects created = " + NumOfDistinctRobots);
	}
	
	static String getRandomColor() {
		Random r = new Random();
		int random = r.nextInt(20);
		if (random % 2 == 0) {
			return "purple";
		} else {
			return "fushcia";
		}
	}
}
