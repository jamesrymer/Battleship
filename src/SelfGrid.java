import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

/**
Represents the player's own grid
*/
public class SelfGrid extends BattleGrid {
    public SelfGrid(String name, PlayerData p) {
        super(p);
        
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
                System.out.println("you clicked self cell"); 
                player.assignShip(i,j);
              } 
            });
        return panel;
    }
}