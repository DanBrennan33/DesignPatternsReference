package mediator.pattern.demo;

abstract class Friend {
	protected Mediator mediator;
	public String name;
	
	public Friend(Mediator _mediator) {
		mediator = _mediator;
	}
}
