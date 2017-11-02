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
	BattleShip myGame;
	int opponent;
	
    public AttackGrid(String name, PlayerData p, BattleShip myGame) {
        super(p);
        currentState = myGame.getState();
        this.myGame = myGame;
        if(currentState == "Player1AttackState"){
        	opponent = 2;
        }
        if(currentState == "Player2AttackState"){
        	opponent = 1;
        }
        
    }
    public void attack(int i, int j){
    	myGame.getData(0).processAttack(i, j);
    }
    @Override
    protected JPanel getCell(int i, int j)
    {
        JPanel panel = new JPanel();
        panel.setBackground(Color.white);
        panel.setBorder(BorderFactory.createLineBorder(Color.red, 1));
        panel.setPreferredSize(new Dimension(50, 50)); // for demo purposes only
        panel.addMouseListener(new MouseAdapter() { 
            public void mouseClicked(MouseEvent me) { 
            	if(currentState == "Player1AttackState" || currentState == "Player2AttackState"){
            		System.out.println("you clicked attack cell"); 
            		//put call here to destroy ship if it is on coords
            		if(opponentData.getSelfGridContent(i, j)==1 || opponentData.getSelfGridContent(i, j)==2 || opponentData.getSelfGridContent(i, j)==3){
            			//kill the ship segment located there
            			attack(i,j);
            			
            		}
            		else
            			System.out.println("miss detected...");
            	}
              } 
            });
        return panel;
    }
}
