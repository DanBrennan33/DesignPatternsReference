package builder.pattern.demo;

public class Car implements IBuilder {
	private Product product = new Product();
	
	@Override
	public void BuildBody() {
		product.Add("This is a body of a Car");
	}
	
	@Override 
	public void InsertWheels() {
		product.Add("4 wheels are addded");
	}
	
	@Override
	public void AddHeadlights() {
		product.Add("2 headlights are added");
	}
	
	@Override
	public Product GetVehicle() {
		return product;
	}
}
