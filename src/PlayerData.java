import java.awt.Color;

public class PlayerData {

	public int attackGrid [][] = new int [10][10];

	public int selfGrid [][] = new int [10][10];


	private int numShips;
	private  int numSelfShipsSunk;
	private  int numEnemyShipsSunk;
	/*public PlayerData(int attackGrid [][] , int battleGrid [][], int numShips, int numSelfShipsSunk, int numEnemyShipsSunk ) {
		this.attackGrid = attackGrid;
		this.selfGrid = battleGrid;
		this.numShips = numShips;
		this.numSelfShipsSunk = numSelfShipsSunk;
		this.numEnemyShipsSunk = numEnemyShipsSunk;
	}*/
	public PlayerData(){
		for(int i = 0; i < 10; i++)
			for(int j = 0; j < 10; j++)
				attackGrid[i][j] = 0;
		for(int k = 0; k < 10; k++)
			for(int m = 0; m < 10; m++)
				if (k == m)
					selfGrid[k][m] = 0;
				else
					selfGrid[k][m] = 0; 
		numShips = 5;
		numSelfShipsSunk = 0;
		numEnemyShipsSunk = 0;
	}
	//  public void setShip(int i, int j){

		//}
	public void assignShip(int i, int j){
		if(j == 8 && selfGrid[i][j] != 1 && selfGrid[i][j-1] != 1 &&  selfGrid[i][j+1] != 1 ){
			selfGrid[i][j] = 1;
			selfGrid[i][j-1] = 1;
			selfGrid[i][j+1] = 1;
			System.out.println("ship assigned...");
			//panel.setBackground(Color.RED);
		}
		if(j == 9 && selfGrid[i][j] != 1 && selfGrid[i][j-1] != 1 &&  selfGrid[i][j-2] != 1 ){
			selfGrid[i][j] = 1;
			selfGrid[i][j-1] = 1;
			selfGrid[i][j-2] = 1;
			System.out.println("ship assigned...");

		}
		if(selfGrid[i][j] != 1 && selfGrid[i][j+1] != 1 &&  selfGrid[i][j+2] != 1  ){
			selfGrid[i][j] = 1;
			selfGrid[i][j+1] = 1;
			selfGrid[i][j+2] = 1;
			System.out.println("ship assigned...");

		}
	}
	public int getSelfGridContent(int i, int j){
		return this.selfGrid[i][j];
	}
	public int getAttackGridContent(int i, int j){
		return this.attackGrid[i][j];
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
	public void addShip() {
		this.numShips++;
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


