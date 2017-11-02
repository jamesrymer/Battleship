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
	
	
    public AttackGrid(String name, PlayerData p, BattleShip myGame) {
        super(p);
        currentState = myGame.getState();
        if(currentState == "Player1AttackState"){
        	opponentData = myGame.getData(2);
        }
        if(currentState == "Player2AttackState"){
        	opponentData = myGame.getData(1);
        }
        
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
            		if(opponentData.getSelfGridContent(i, j)==1){
            			//kill the ship there
            		}
            	}
              } 
            });
        return panel;
    }
}
