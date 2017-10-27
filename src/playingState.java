
public class playingState implements State{
	/*
	public void setState(State state) {
		this.state = state;
	}
	public State getState() {
		return this.state;
	}
	*/
	public void start(BattleShip myShip){
		//do playing stuff you should do
		//then change program state
		myShip.setState(new setupState());
	}
	

}
