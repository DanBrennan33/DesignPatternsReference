package chainofresponsibility.pattern.demo;

public class FaxErrorHandler implements IReceiver {
	private IReceiver _nextReceiver;

	public FaxErrorHandler(IReceiver nextReceiver) {
		_nextReceiver = nextReceiver;
	}
	
	public Boolean processMessage(Message msg) {
		if (msg.text.contains("Fax")) {
			System.out.println("FaxErrorHandler processed " + msg.priority + " priority issue: " + msg.text);
		} else {
			if (_nextReceiver != null) {
				_nextReceiver.processMessage(msg);
			}
		}
		return false;
	}
}
