import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
//this is the player screen test comment to push to repo

public class PlayerScreen extends JFrame {
    public PlayerScreen(String name, boolean show) {
        super(name);
        this.setLayout(new BorderLayout());
        
        Container pane = new Container();
        pane.setLayout(new BoxLayout(pane,BoxLayout.Y_AXIS));
        JButton btnNumberOfShips = new JButton("Number of Own Ships");
        JButton btnShipsLeft= new JButton("Own ships sunk");
        JButton btnEnemySunk = new JButton("Number of Enemy Ships Sunk");
        pane.add(btnNumberOfShips);
        pane.add(btnShipsLeft);
        pane.add(btnEnemySunk);
        
        
        btnNumberOfShips.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent f){
                JLabel displayNumberOfShips = new JLabel("You have [] ships");
                pane.add(displayNumberOfShips);
            }
        });
        
        this.add(new SelfGrid(name), BorderLayout.EAST);
        this.add(new AttackGrid(name), BorderLayout.WEST);
        this.add(new JLabel(name), BorderLayout.NORTH);
        
        this.add(pane,BorderLayout.SOUTH);
        
        JButton next = new JButton("next");
        next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
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