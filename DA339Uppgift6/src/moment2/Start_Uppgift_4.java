package moment2;

import javax.swing.JFrame;

import resources.Array7x7;

public class Start_Uppgift_4 {
	public static void main( String[] args ) { 
		
		Array7x7 array = new Array7x7();
		Array7x7Viewer viewer = new Array7x7Viewer();
		Controller controller = new Controller( viewer, array ); 
		Array7x7Input input = new Array7x7Input( controller, array);
		
		JFrame Array7x7Viewer = new JFrame( "Array7x7Viewer" ); 
		Array7x7Viewer.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); 
		Array7x7Viewer.setLocation(300, 300);
		Array7x7Viewer.add( viewer ); 
		Array7x7Viewer.pack(); 
		Array7x7Viewer.setVisible( true ); 
		
		JFrame Array7x7Input = new JFrame( "Array7x7Input" ); 
		Array7x7Input.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); 
		Array7x7Input.setLocation(800, 300);
		Array7x7Input.add( input ); 
		Array7x7Input.pack(); 
		Array7x7Input.setVisible( true );	
	}
}
