import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

/**
Represents the grid the player is attacking

*/
public class AttackGrid extends BattleGrid {
	String currentState;
	PlayerData opponentData;
	PlayerData selfData;
	BattleShip thisGame;
	Boolean shotUsed;  //boolean to record if player has used their one shot, if so no more shots allowed
	
	
    public AttackGrid(String name, PlayerData p, BattleShip myGame, boolean thisShotUsed) {
        super(p);
        currentState = myGame.getState();
        if(currentState == "Player1AttackState"){
        	opponentData = myGame.getData(2);
        	selfData = myGame.getData(1);
        }
        if(currentState == "Player2AttackState"){
        	opponentData = myGame.getData(1);
        	selfData = myGame.getData(2);
        }
        thisGame = myGame;
        shotUsed = thisShotUsed;
        
    }
    public AttackGrid(String name, PlayerData p, BattleShip myGame) {
        super(p);
        currentState = myGame.getState();
        if(currentState == "Player1AttackState"){
        	opponentData = myGame.getData(2);
        	selfData = myGame.getData(1);
        }
        if(currentState == "Player2AttackState"){
        	opponentData = myGame.getData(1);
        	selfData = myGame.getData(2);
        }
        thisGame = myGame;
        shotUsed = false;
        
    }
    
    /*public void processAttack(int i, int j){
    	System.out.println("inside process attack method with coordinates: " + i + j);
    	
    }*/

    @Override
    protected JPanel getCell(int i, int j)
    {
        JPanel panel = new JPanel();
        panel.setBackground(Color.white);
        panel.setBorder(BorderFactory.createLineBorder(Color.red, 1));
        panel.setPreferredSize(new Dimension(50, 50)); // for demo purposes only
        if(player.getAttackGridContent(i, j) == 1){
        	panel.setBackground(Color.red);
        } else if(player.getAttackGridContent(i,j) == 2){
        	panel.setBackground(Color.blue);
        }
        panel.addMouseListener(new MouseAdapter() { 
            public void mouseClicked(MouseEvent me) { 
            	if((currentState == "Player1AttackState" || currentState == "Player2AttackState") && shotUsed==false){
            		System.out.println("you clicked attack cell"); 
            		//put call here to destroy ship if it is on coords
            		if(opponentData.getSelfGridContent(i, j)==1){
            			//kill the ship there
            			System.out.println("ship detected at point of attack!");
            			//processAttack(i, j);
            			opponentData.recordAttack(i, j);
            			selfData.recordHit(i,j);
            		} else {
            			selfData.recordMiss(i,j);
            		}
            		thisGame.redrawScreenShotUsed(); //redraw the screen without the ability to attack again
            	}
              } 
            });
        return panel;
    }
}
