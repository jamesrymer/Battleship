import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

/**
Represents the player's own grid
*/
public class SelfGrid extends BattleGrid {
    public SelfGrid(String name) {
        super();
        
    }

    @Override
    protected JPanel getCell()
    {
        JPanel panel = new JPanel();
        panel.setBackground(Color.black);
        panel.setBorder(BorderFactory.createLineBorder(Color.blue, 5));
        panel.setPreferredSize(new Dimension(20, 20)); // for demo purposes only

        return panel;
    }
}