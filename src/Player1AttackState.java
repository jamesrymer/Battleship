
public class Player1AttackState implements State{
	public void start(BattleShip myShip){
		PlayerScreen player1 = new PlayerScreen("Player1", true);
		//do stuff to place ships on player1 board here
		//then set wrapper class state to player2Setup
		myShip.setState(new Player2AttackState());
	}

}
