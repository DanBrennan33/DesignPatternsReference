package chainofresponsibility.pattern.demo;

public interface IReceiver {
	Boolean processMessage(Message msg);
}
