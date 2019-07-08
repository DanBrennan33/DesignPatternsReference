package memento.pattern.demo;

public class MementoPatternEx {
	public static void main(String[] args) {
		System.out.println("***Memento Pattern Demo***\n");
		Originator o = new Originator();
		o.setState("First State");
		
		// Hold old state
		Caretaker c = new Caretaker();
		c.SaveMemento(o.OriginatorMemento());
		
		// Change state
		o.setState("Second State");
		
		// Restore state
		o.Revert(c.RetrieveMemento());
	}
}
