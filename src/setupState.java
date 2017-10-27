
//state to setup the game
//where ships are placed on board
public class setupState implements State {
	public State state;
	/*private setupState(State state) { //ctor
		this.state = state;
	}*/
	public void setState(State state) {
		this.state = state;
	}
	public State getState() {
		return this.state;
	}
	public void start(BattleShip myShip){
		PlayerScreen player1 = new PlayerScreen("Player1", true);
		PlayerScreen player2 = new PlayerScreen("Player2", true);
		//do stuff to place ships on board here
		//then set wrapper class state to playingState
		BattleShip.setState(new playingState());
	}
}
