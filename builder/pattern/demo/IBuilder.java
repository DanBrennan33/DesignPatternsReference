package builder.pattern.demo;

public interface IBuilder {
	void BuildBody();
	void InsertWheels();
	void AddHeadlights();
	Product GetVehicle();
}
