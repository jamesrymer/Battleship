//state machine should probably go in Battleship class...thats a good idea...
public class BattleShip {
	
	public State state;
	
	//player 1 data and player screen
	
	PlayerData player1Data;
	PlayerData player2Data;
	
	//player 2 data and player screen
	PlayerScreen player1Screen;
	PlayerScreen player2Screen;
	
	public void createPlayer1(){
		player1Data = new PlayerData();
		player1Screen = new PlayerScreen("Player1", true, this);
	}
	public void createPlayer2(){
		player2Data = new PlayerData();
		player2Screen = new PlayerScreen("Player2", true, this);
	}
	
	private BattleShip(State state){
		this.state = state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public String getState() {
		return this.state.toString();
	}
	public PlayerData getData(int i) {
		if(i==1){
	    	System.out.println("Player 1 data copied...");
			return player1Data;
		}
		if(i==2){
	    	System.out.println("Player 2 data copied...");
			return player2Data;
		}
		else return null;
	}
	public void play(){
		state.start(this);
	}
    public static void main(String[] args) {
        //PlayerScreen player1 = new PlayerScreen("Player1", true);
        //PlayerScreen player2 = new PlayerScreen("Player2", true);
    	State initialState = new Player1SetupState(); //construct initial game state
    	BattleShip myGame = new BattleShip(initialState);  //construct game and give it that initial game state
    	myGame.play();  //start the game doing setup stuff in the initial state, should run from there
    	System.out.println("testing state printer inside context method...");
    	System.out.println(myGame.getState());
    }
}
