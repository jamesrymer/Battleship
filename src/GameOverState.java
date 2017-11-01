
public class GameOverState implements State{
	public void start(BattleShip myShip){
		//do game over stuff
		//then set wrapper class state to player1Setup to begin again
		//myShip.setState(new Player1SetupState());
	}
	public void nextState(BattleShip myShip){
		myShip.setState(new Player1SetupState());
		myShip.play();
	}

}
