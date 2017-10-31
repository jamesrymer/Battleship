
//state to setup the game
//where ships are placed on board
public class Player1SetupState implements State {
	public void start(BattleShip myShip){
		myShip.createPlayer1();
		//do stuff to place ships on player1 board here
		//$$$$$
		//then set wrapper class state to player2Setup when player 1 setup is done
		//consider adding a next button to automatically move to next state 
		myShip.setState(new Player2SetupState());
	}
}
