package chainofresponsibility.pattern.demo;

public class EmailErrorHandler implements IReceiver  {
	private IReceiver _nextReceiver;
	
	public EmailErrorHandler(IReceiver nextReceiver) {
		_nextReceiver = nextReceiver;
	}
	
	public Boolean processMessage(Message msg) {
		if (msg.text.contains("Email")) {
			System.out.println("EmailErrorHandler processed " + msg.priority + " priority issue: " + msg.text);
		} else {
			if (_nextReceiver != null) {
				_nextReceiver.processMessage(msg);
			}
		}
		return false;
	}
}
