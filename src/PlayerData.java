
public class PlayerData {
	private int attackGrid [][] = new int [10][10];
	private int selfGrid [][] = new int [10][10];
	
	
	private int numShips = 0;
	private  int numSelfShipsSunk = 0;
	private  int numEnemyShipsSunk = 0;
	public PlayerData(int attackGrid [][] , int battleGrid [][], int numShips, int numSelfShipsSunk, int numEnemyShipsSunk ) {
		this.attackGrid = attackGrid;
		this.selfGrid = battleGrid;
		this.numShips = numShips;
		this.numSelfShipsSunk = numSelfShipsSunk;
		this.numEnemyShipsSunk = numEnemyShipsSunk;
	}
	
	public PlayerData() {
		this.attackGrid = attackGrid;
		this.selfGrid = battleGrid;
		this.numShips = numShips;
		this.numSelfShipsSunk = numSelfShipsSunk;
		this.numEnemyShipsSunk = numEnemyShipsSunk;
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
