package moment6;

import javax.swing.JFrame;
import resources.Color;

public class Test_Uppgift_8 {
	
	public static void main(String[] args) {
		
		Controller c = new Controller();
		UserInterface frame = new UserInterface( c , 15, 15, Color.CYAN);
		
		JFrame frame1 = new JFrame( "Test8" ); 
		frame1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); 
		frame1.setLocation(300, 300);
		frame1.add( frame ); 
		frame1.pack(); 
		frame1.setVisible( true ); 	
	}

}
