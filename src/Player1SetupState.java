
//state to setup the game
//where ships are placed on board
public class Player1SetupState implements State {
	public void start(BattleShip myShip){
		PlayerScreen player1 = new PlayerScreen("Player1", true);
		//do stuff to place ships on player1 board here
		//$$$$$
		//then set wrapper class state to player2Setup when player 1 setup is done
		myShip.setState(new Player2SetupState());
	}
}
