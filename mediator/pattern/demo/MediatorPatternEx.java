package mediator.pattern.demo;

public class MediatorPatternEx {
	public static void main(String[] args) {
		System.out.println("***Mediator Pattern Demo***\n");
		ConcreteMediator m = new ConcreteMediator();
		
		Friend1 Ron = new Friend1(m,"Ron");
		Friend2 Jon = new Friend2(m,"Jon");
		Boss Don = new Boss(m,"Don");
		
		m.setFriend1(Ron);
		m.setFriend2(Jon);
		m.setBoss(Don);
		
		Ron.Send("[Ron here]Good Morrning. Can we discuss the mediator pattern?");
		Jon.Send("[Jon here]Good Morning.Yes, we can discuss now.");
		Don.Send("\n[Don here]:Please get back to work quickly");
	}
}
