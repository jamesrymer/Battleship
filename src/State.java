
public interface State {
	//method to change state
	public void start(BattleShip myShip);

	public void nextState(BattleShip myShip);
}
