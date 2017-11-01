
public class Player2SetupState implements State{
	public String name = "Player2SetupState";
	
	public String toString(){
		return name;
	}
	public void start(BattleShip myShip){
		myShip.createPlayer2();
		System.out.println(myShip.getState());
		//do stuff to place ships on board here

	}
	public void nextState(BattleShip myShip){
		myShip.setState(new Player1AttackState());
		myShip.play();
	}

}
