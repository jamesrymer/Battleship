import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
//this is the player screen test comment to push to repo
//this is the second test comment 

public class PlayerScreen extends JFrame {
    public PlayerScreen(String name, boolean show) {
        super(name);
        this.setLayout(new BorderLayout());
        
        
        this.add(new SelfGrid(name), BorderLayout.EAST);
        this.add(new AttackGrid(name), BorderLayout.WEST);
        this.add(new JLabel(name), BorderLayout.NORTH);
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