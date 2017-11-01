import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
//this is the player screen test comment to push to repo
//this is the second test comment 

public class PlayerScreen extends JFrame {
	
    public PlayerScreen(String name, boolean show, BattleShip thisGame) {
        super(name);
        PlayerData play1 = new PlayerData();   
	    
        this.setLayout(new BorderLayout());	
        Container paneWest = new Container();
        Container paneEast = new Container();
        paneWest.setLayout(new BoxLayout(paneWest,BoxLayout.Y_AXIS));
	    
        JLabel labelNumberShips = new JLabel("Number of Own Ships:");
        JLabel displayNumber = new JLabel(String.valueOf(play1.getNumShips()));
	    
        JLabel labelShips= new JLabel("Number of Own Ships Sunk:");
        JLabel displayShips = new JLabel(String.valueOf(play1.getNumSelfShipsSunk()));
	    
        JLabel labelSunk = new JLabel("Number of Enemy Ships Sunk:");
        JLabel displaySunk = new JLabel(String.valueOf(play1.getNumEnemyShipsSunk()));
	    
        JLabel stateLabel = new JLabel("Current State:");
        JLabel displayState = new JLabel(thisGame.getState());
        
        paneWest.add(labelNumberShips);
        paneWest.add(labelShips);
        paneWest.add(labelSunk);
        paneWest.add(stateLabel);
	    
        paneEast.add(displayNumber);
        paneEast.add(displayShips);
        paneEast.add(displaySunk);
        //paneEast.add(displayState);
        
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        
        
        /*btnNumberOfShips.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent f){
                JLabel displayNumberOfShips = new JLabel("You have");
                panel.add(displayNumberOfShips,BorderLayout.CENTER);
                        }
        });*/
            
        panel.add(paneWest,BorderLayout.WEST);
        panel.add(paneEast,BorderLayout.EAST);
        this.add(new SelfGrid(name), BorderLayout.EAST);
        this.add(new AttackGrid(name), BorderLayout.WEST);
        this.add(new JLabel(name), BorderLayout.NORTH);

        this.add(panel,BorderLayout.SOUTH);
        
        JButton next = new JButton("next");
        next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	thisGame.state.nextState(thisGame);
                hideScreen();
            }
        });
        this.add(next, BorderLayout.CENTER);
        this.pack();
        this.setVisible(show);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void hideScreen() {
        this.setVisible(false);
    }
    
    public void sys(String text) {
    	System.out.println(text);
    }
}
