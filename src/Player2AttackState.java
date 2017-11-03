
public class Player2AttackState implements State{
	public String name = "Player2AttackState";	
	public String toString(){
		return name;
	}
	public void start(BattleShip myShip){
		//do attack stuff here
		//then set wrapper class state to player1Attack if game is not over
		//myShip.setState(new Player1AttackState());
		System.out.println(myShip.getState());
		myShip.player2Attack();
	}
	public void nextState(BattleShip myShip){
		if(myShip.player1Data.checkGameOver()==false)
			myShip.setState(new Player1AttackState());
		else myShip.setState(new GameOverState());
		myShip.play();
	}
}
