
public class Player2SetupState implements State{
	public String name = "Player2SetupState";
	
	public String toString(){
		return name;
	}
	public void start(BattleShip myShip){
		//myShip.createPlayer2();
		//do stuff to place ships on board here
		//$$$$$
		//then set wrapper class state to Player1 attack state
		//myShip.setState(new Player1AttackState());
	}
	public void nextState(BattleShip myShip){
		myShip.setState(new Player1AttackState());

	}

}
