import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameOverScreen extends JFrame{
	public GameOverScreen(String name, boolean show, String winner){
		super("name");
		JPanel panel = new JPanel();
		
		JLabel label = new JLabel(winner);
		
		panel.add(label);
		this.setBounds(0, 0, 600, 600);
		this.setSize(600, 600);
		this.add(panel);
		 this.pack();
	        this.setVisible(show);
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
