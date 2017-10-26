import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

/**
Represents the grid the player is attacking

*/
public class AttackGrid extends BattleGrid {
    public AttackGrid(String name) {
        super();
        
    }

    @Override
    protected JPanel getCell()
    {
        JPanel panel = new JPanel();
        panel.setBackground(Color.white);
        panel.setBorder(BorderFactory.createLineBorder(Color.red, 5));
        panel.setPreferredSize(new Dimension(20, 20)); // for demo purposes only
        panel.addMouseListener(new MouseAdapter() { 
            public void mouseClicked(MouseEvent me) { 
                System.out.println("you clicked attack cell"); 
              } 
            });
        return panel;
    }
}
