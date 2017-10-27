
public interface State {
	//method to change state
	public void setState(State state);
	public State getState();
	public void start(BattleShip myShip);
}
