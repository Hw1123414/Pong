import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

public class pingpong implements ActionListener, KeyListener, MouseMotionListener{ 
	//Properties
	pingpongpanel panel;
	 
	JFrame frame; 
	Timer timer;  
	
	//Methods
	public void actionPerformed(ActionEvent x){ 
		if(x.getSource() == timer){ 
			panel.repaint(); 
		}
	} 
	public void keyReleased(KeyEvent x){ 
		if(x.getKeyCode() == 87){ 
			panel.blnUpL = false; 
		} 
		else if(x.getKeyCode() == 83){ 
			panel.blnDownL = false; 
		} 
		if(x.getKeyCode() == 38){ 
			panel.blnUpR = false; 
		} 
		else if(x.getKeyCode() == 40){ 
			panel.blnDownR = false; 
		} 
	}
	public void keyPressed(KeyEvent x){
		if(x.getKeyCode() == 87){ 
			panel.blnUpL = true; 
		} 
		else if(x.getKeyCode() == 83){ 
			panel.blnDownL = true; 
		} 
		if(x.getKeyCode() == 38){ 
			panel.blnUpR = true; 
		} 
		else if(x.getKeyCode() == 40){ 
			panel.blnDownR = true; 
		} 
	}
	public void keyTyped(KeyEvent x){
		 
	}
	public void mouseMoved(MouseEvent x){ 
	
	}  
	public void mouseDragged(MouseEvent x){ 
	
	}
	
	//Constructor
	public pingpong(){
		frame = new JFrame("Ping Pong"); 
		panel = new pingpongpanel(); 
	
		timer = new Timer(1000/60, this); 
		timer.start(); 
	
		frame.addKeyListener(this); 
		panel.addMouseMotionListener(this); 
	
		panel.setPreferredSize(new Dimension(1280,640)); 
		panel.setLayout(null); 
		
		frame.setContentPane(panel);	
		frame.pack(); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setVisible(true); 
	}

	//Main Program
	public static void main(String[] args){ 
		new pingpong(); 
	} 
}
