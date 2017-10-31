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
	public void play(){
		state.start(this);
	}
    public static void main(String[] args) {
        //PlayerScreen player1 = new PlayerScreen("Player1", true);
        //PlayerScreen player2 = new PlayerScreen("Player2", true);
    	State initialState = new Player1SetupState(); //construct initial game state
    	BattleShip myGame = new BattleShip(initialState);  //construct game and give it that initial game state
    	myGame.state.start(myGame);  //start the game doing setup stuff in the initial state, should run from there
    }
}
