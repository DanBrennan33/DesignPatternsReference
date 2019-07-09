package state.pattern.demo;

abstract class RemoteControl {
	public abstract void pressSwitch(TV context);
}

class Off extends RemoteControl {
	@Override
	public void pressSwitch(TV context) {
		System.out.println("Currently Off. Switching to be On now.");
		context.setState(new On());
	}
}

class On extends RemoteControl {
	@Override 
	public void pressSwitch(TV context) {
		System.out.println("Currently On. Switching to be Off now.");
		context.setState(new Off());
	}
}

class TV {
	private RemoteControl state;
	
	public RemoteControl getState() {
		return state;
	}
	
	public void setState(RemoteControl state) {
		this.state = state;
	}
	
	public TV(RemoteControl state) {
		this.state = state;
	}
	
	public void pressButton() {
		state.pressSwitch(this);
	}
}

public class StatePatternEx {
	public static void main(String[] args) {
		System.out.println("***State Pattern Demo***\n");
		
		// Initially TV is Off
		Off initialState = new Off();
		TV tv = new TV(initialState);
		
		// First press
		tv.pressButton();
		
		// Second press
		tv.pressButton();
		
		// Third press
		tv.pressButton();
		
		// Fourth press
		tv.pressButton();

		// Fifth press
		tv.pressButton();
				
	}
}
