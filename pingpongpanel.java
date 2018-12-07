import java.io.*;
import java.awt.*; 
import javax.swing.*; 
import javax.imageio.*; 
import java.awt.image.*;

public class pingpongpanel extends JPanel{ 
	//Properties 
	int intX = 615;  
	int intY = 295; 
	int intYL = 270;
	int intYR = 270;
	boolean blnDownL = false; 
	boolean blnUpL = false; 
	boolean blnDownR = false; 
	boolean blnUpR = false; 
	boolean blnU = true; //Up  
	boolean blnD = false; //Down
	boolean blnL = true; //Left 
	boolean blnR = false; //Right 
	boolean blnHit = false; 
	
	//Methods 
	public void paintComponent(Graphics x){ 
		x.setColor(Color.WHITE); 
		x.fillRect(0,0,1280,720); 
	
		x.setColor(Color.GREEN); 
		x.fillRect(0,intYL,10,100);
		x.fillRect(1270,intYR,10,100);
		
		x.setColor(Color.BLACK); 
		x.fillOval(intX,intY,25,25);
		
		if(intX == 0 && intY >= intYL && intY <= intYL+100){
			blnHit = true; 
		}
		else if(intX == 1280 && intY >= intYR && intY <= intYR+100){  
			blnHit = true; 
		}
		else if(intX > 0 && intX < 1280){
			blnHit = false; 
		}

		//Up & Down 	
		if(intY < 0){ 
			blnU = false; 
			blnD = true;
		}
		else if(intY > 640){ 
			blnU = true; 
			blnD = false; 
		}
		
		//Left & Right
		if(blnHit == true){	
			if(intX < 0){ 
				blnL = false; 
				blnR = true;
			}
			else if(intX > 1280){ 
				blnL = true; 
				blnR = false; 
			}	
		}	
				
		//Moving The Ball		
		if(blnU == true){ 
			intY = intY - 5; 
		}
		else if(blnD == true){ 
			intY = intY + 5; 
		}
		
		if(blnR == true){ 
			intX = intX + 5; 
		}
		else if(blnL == true){
			intX = intX - 5; 
		}
		
		//Paddles 
		if(blnDownL == true){ 
			intYL += 10; 
		}
		if(blnUpL == true){ 
			intYL -= 10; 
		}
		if(blnDownR == true){ 
			intYR += 10; 
		}
		if(blnUpR == true){ 
			intYR -= 10; 
		}
	}
		
	//Constructor 
	public pingpongpanel(){ 
		super();
	}
}
