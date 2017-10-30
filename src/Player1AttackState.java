
public class Player1AttackState implements State{
	public void start(BattleShip myShip){
		//do stuff to process the players attack
		//do stuff to determine the result
		//then set wrapper class state to player2attack if game is not over
		myShip.setState(new Player2AttackState());
	}

}
