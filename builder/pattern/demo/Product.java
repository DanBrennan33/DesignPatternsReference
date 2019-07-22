package builder.pattern.demo;

import java.util.LinkedList;

public class Product {
	private LinkedList<String> parts;
	public Product() {
		parts = new LinkedList<String>();
	}
	
	public void Add(String part) {
		// Adding parts
		parts.addLast(part);
	}
	
	public void Show() {
		System.out.println("\n Product completed as below : ");
		for (String part : parts) {
			System.out.println(part);
		}
	}
}
