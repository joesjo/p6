package moment4;

import javax.swing.JComponent;
import javax.swing.JOptionPane;

import p6_colors.*;
import resources.Array7;
import resources.Array7x7;

public class Test_Uppgift_6 {
	
	private ColorDisplay disp = new ColorDisplay(1,1);
	
	public Test_Uppgift_6() {
		
		int[][] array7x7 = {
			{Color.CYAN,Color.BLUE,Color.BLACK,Color.BLUE,Color.GRAY,Color.GREEN,Color.MAGENTA},
			{Color.CYAN,Color.BLUE,Color.BLACK,Color.BLUE,Color.GRAY,Color.GREEN,Color.MAGENTA},
			{Color.CYAN,Color.BLUE,Color.BLACK,Color.BLUE,Color.GRAY,Color.GREEN,Color.MAGENTA},
			{Color.CYAN,Color.BLUE,Color.BLACK,Color.BLUE,Color.GRAY,Color.GREEN,Color.MAGENTA},
			{Color.CYAN,Color.BLUE,Color.BLACK,Color.BLUE,Color.GRAY,Color.GREEN,Color.MAGENTA},
			{Color.CYAN,Color.BLUE,Color.BLACK,Color.BLUE,Color.GRAY,Color.GREEN,Color.MAGENTA},
			{Color.CYAN,Color.BLUE,Color.BLACK,Color.BLUE,Color.GRAY,Color.GREEN,Color.MAGENTA}};
		
		Array7x7 array = new Array7x7(array7x7);

		Array7 colorRED =  new Array7 (new int[] 
				{Color.RED, Color.RED, Color.RED, Color.RED, Color.RED, Color.RED, Color.RED});
		
		disp.setDisplay(array.toIntArray());
		disp.updateDisplay();
		JOptionPane.showMessageDialog(null, disp);
		
		array.shiftLeft(colorRED);
		disp.setDisplay(array.toIntArray());
		disp.updateDisplay();
		JOptionPane.showMessageDialog(null, disp);
		
		array.shiftLeft(colorRED);
		disp.setDisplay(array.toIntArray());
		disp.updateDisplay();
		JOptionPane.showMessageDialog(null, disp);
	}
	
	public static void main(String[] args) {
		new Test_Uppgift_6();
		
	}
}
