package memento.pattern.demo;

public class Memento {
	private String state;
	
	public Memento(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
}
