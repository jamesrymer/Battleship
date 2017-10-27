
public class Player2AttackState implements State{
	public void start(BattleShip myShip){
		PlayerScreen player1 = new PlayerScreen("Player1", true);
		//do attack stuf here
		//then set wrapper class state to player2Attack if game is not over
		myShip.setState(new Player1AttackState());
	}
}
