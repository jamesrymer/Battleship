
public class battleshipState implements State {
	private State state;
	
	private battleshipState(State state) { //ctor
		this.state = state;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public State getState() {
		return this.state;
	}
	
}
