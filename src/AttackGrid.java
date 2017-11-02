import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

/**
Represents the grid the player is attacking

*/
public class AttackGrid extends BattleGrid {
    public AttackGrid(String name, PlayerData p) {
        super(p);
        
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
                System.out.println("you clicked attack cell"); 
              } 
            });
        return panel;
    }
}
