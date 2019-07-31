package mediator.pattern.demo;

class Friend2 extends Friend {
	public Friend2(Mediator mediator, String name) {
		super(mediator);
		this.name = name;
	}
	
	public void Send(String msg) {
		mediator.Send(this, msg);
	}
	
	public void Notify(String msg) {
		System.out.println("Jon gets message: " + msg);
	}
}
