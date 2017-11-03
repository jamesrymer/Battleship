import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

/**
Represents the player's own grid
*/
public class SelfGrid extends BattleGrid {
	String currentState;
	BattleShip thisGame;
    public SelfGrid(String name, PlayerData p, BattleShip myGame) {
        super(p);
        currentState = myGame.getState();
        thisGame = myGame;
    }
    

    protected JPanel getCell(int i, int j)
    {
        JPanel panel = new JPanel();
        panel.setBackground(Color.black);
        panel.setBorder(BorderFactory.createLineBorder(Color.blue, 1));
        panel.setPreferredSize(new Dimension(50, 50)); // for demo purposes only

        if( player.getSelfGridContent(i, j)== 1)
        		panel.setBackground(Color.RED);
        else 
        	panel.setBackground(Color.black);
        
        panel.addMouseListener(new MouseAdapter() { 
            public void mouseClicked(MouseEvent me) { 
            	if(currentState == "Player1SetupState" || currentState == "Player2SetupState"){
            		System.out.println("you clicked self cell"); 
            		player.assignShip(i,j);
            		player.addShip();
            		//call screen ctor again
            		
            		thisGame.redrawScreen();
            		
            	}
              } 
            });
        return panel;
    }
}