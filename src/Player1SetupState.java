
//state to setup the game
//where ships are placed on board
public class Player1SetupState implements State {
	public String name = "Player1SetupState";
	
	public String toString(){
		return name;
	}
	public void start(BattleShip myShip){
		myShip.createPlayer1();
		//do stuff to detect mouse clicks and place ships on player1 board here
		System.out.println(myShip.getState());

		
	}
	public void nextState(BattleShip myShip){
		myShip.setState(new Player2SetupState());
		myShip.play();
	}
}
