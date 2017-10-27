
public class Player2SetupState implements State{
	public void start(BattleShip myShip){
		PlayerScreen player2 = new PlayerScreen("Player2", true);
		//do stuff to place ships on board here
		//then set wrapper class state to playingState
		myShip.setState(new Player1AttackState());
	}

}
