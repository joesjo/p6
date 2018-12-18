package moment3;

import javax.swing.JFrame;

import moment2.Array7x7Input;
import resources.Array7x7;

public class Start_Uppgift_5 {
	public static void main( String[] args ) { 
		
		Controller cont = new Controller();
		Test2UI panel = new Test2UI(cont) ;		
		
		JFrame frame1 = new JFrame( "Test2UI" ); 
		frame1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); 
		frame1.setLocation(300, 300);
		frame1.add( panel ); 
		frame1.pack(); 
		frame1.setVisible( true ); 	
	}
}
