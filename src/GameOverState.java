
public class GameOverState implements State{
	public void start(BattleShip myShip){
		System.out.println("GAME OVER BRO");
		
		//do game over stuff like display a special screen
		myShip.gameOver();
		//then set wrapper class state to player1Setup to begin again
		//myShip.setState(new Player1SetupState());
	}
	public void nextState(BattleShip myShip){
		myShip.setState(new Player1SetupState());
		myShip.play();
	}

}
