
public class PlayerData {
	private int attackGrid [][]; //= new int [10][10];
	private int selfGrid [][]; //= new int [10][10];
	
	
	private int numShips;
	private  int numSelfShipsSunk;
	private  int numEnemyShipsSunk;
	
	public PlayerData(int attackGrid [][] , int battleGrid [][], int numShips, int numSelfShipsSunk, int numEnemyShipsSunk ) {
		this.attackGrid = attackGrid;
		this.selfGrid = battleGrid;
		this.numShips = numShips;
		this.numSelfShipsSunk = numSelfShipsSunk;
		this.numEnemyShipsSunk = numEnemyShipsSunk;
	}
	
	public PlayerData() {
		this.attackGrid =  new int [10][10];
		this.selfGrid = new int [10][10];
		this.numShips = 5;  //each player starts with 5 ships per assignment instructions
		this.numSelfShipsSunk = 0;
		this.numEnemyShipsSunk = 0;
	}
	
	public int[][] getAttackGrid() {
		return attackGrid;
	}
	public void setAttackGrid(int[][] attackGrid) {
		this.attackGrid = attackGrid;
	}
	public int[][] getBattleGrid() {
		return selfGrid;
	}
	public void setBattleGrid(int[][] battleGrid) {
		this.selfGrid = battleGrid;
	}
	public int getNumShips() {
		return numShips;
	}
	public void setNumShips(int numShips) {
		this.numShips = numShips;
	}
	public int getNumSelfShipsSunk() {
		return numSelfShipsSunk;
	}
	public void setNumSelfShipsSunk(int numSelfShipsSunk) {
		this.numSelfShipsSunk = numSelfShipsSunk;
	}
	public int getNumEnemyShipsSunk() {
		return numEnemyShipsSunk;
	}
	public void setNumEnemyShipsSunk(int numEnemyShipsSunk) {
		this.numEnemyShipsSunk = numEnemyShipsSunk;
	}
	
}
