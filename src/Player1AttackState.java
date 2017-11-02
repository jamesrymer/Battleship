
public class Player1AttackState implements State{
	public String name = "Player1AttackState";
	public String toString(){
		return name;
	}
	public void start(BattleShip myShip){
		//do stuff to process the players attack
		//do stuff to determine the result
		//then set wrapper class state to player2attack if game is not over
		//myShip.setState(new Player2AttackState());
		myShip.player1Attack();
		System.out.println(myShip.getState());
	}
	public void nextState(BattleShip myShip){
		myShip.setState(new Player2AttackState());
		myShip.play();
	}
}
