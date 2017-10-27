//state machine should probably go in Battleship class...
public class BattleShip {
	public State state;
	
	private BattleShip(State state){
		this.state = state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public State getState() {
		return this.state;
	}
	
    public static void main(String[] args) {

        PlayerScreen player1 = new PlayerScreen("Player1", true);
        PlayerScreen player2 = new PlayerScreen("Player2", true);
    }
}