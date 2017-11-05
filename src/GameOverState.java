
public class GameOverState implements State{
	public String name = "GameOverState";
	public String toString(){
		return name;
	}
	
	public void start(BattleShip myShip){
		System.out.println("GAME OVER BRO");
		
		//do game over stuff like display a special screen
		myShip.gameOver();
	}
	public void nextState(BattleShip myShip){
		myShip.setState(new Player1SetupState());
		myShip.play();
	}
}
