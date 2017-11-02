import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public abstract class BattleGrid extends JPanel {
	PlayerData player;
    public BattleGrid(PlayerData p) {
    	player = p;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JPanel self = new JPanel();
        self.setLayout(new GridLayout(0,10));
        System.out.println("==============================================================================");
        for (int i = 0; i < 10; i++) {
            for(int j =0; j < 10; j++) {
            	System.out.println("printing cells");
                self.add(getCell(i, j));
                //System.out.println(self.add(getCell(i,j)));            
             }
        }
        this.add(self);
    }
    public BattleGrid(){
    	
    }
    
    protected abstract JPanel getCell(int i, int j);
}