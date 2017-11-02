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
    public SelfGrid(String name, PlayerData p, BattleShip myGame) {
        super(p);
        currentState = myGame.getState();
    }
    

    protected JPanel getCell(int i, int j)
    {
        JPanel panel = new JPanel();
        panel.setBackground(Color.black);
        panel.setBorder(BorderFactory.createLineBorder(Color.blue, 1));
        panel.setPreferredSize(new Dimension(50, 50)); // for demo purposes only
        System.out.println(player.getSelfGridContent(2, 2));
        if( player.getSelfGridContent(i, j)== 1 || player.getSelfGridContent(i, j)== 2 || player.getSelfGridContent(i, j)== 3 ){
        		//System.out.println("red tile marked for ship placement...");
        		panel.setBackground(Color.RED);
        		
        }
        if( player.getSelfGridContent(i, j)== 10 || player.getSelfGridContent(i, j)== 20 || player.getSelfGridContent(i, j)== 30 )
    		panel.setBackground(Color.ORANGE);
        if( player.getSelfGridContent(i, j)== 4)
    		panel.setBackground(Color.WHITE);
        else 
        	panel.setBackground(Color.BLACK);
        
        panel.addMouseListener(new MouseAdapter() { 
            public void mouseClicked(MouseEvent me) { 
            	if(currentState == "Player1SetupState" || currentState == "Player2SetupState"){
            		System.out.println("you clicked self cell"); 
            		player.assignShip(i,j);
            	}
              } 
            });
        return panel;
    }
}