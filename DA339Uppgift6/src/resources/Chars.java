package resources;

import javax.swing.JOptionPane;

import p6_colors.Color;
import p6_colors.ColorDisplay;

public class Chars {
	
	private static int[][] charA = { 
			{0,0,1,1,1,0,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,1,1,1,1,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0}};
	
	private static int[][] charB = { 
			{0,1,1,1,1,0,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,1,1,1,0,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,1,1,1,0,0}};
	
	private static int[][] charC = { 
			{0,0,1,1,1,0,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,0,0},
			{0,1,0,0,0,0,0},
			{0,1,0,0,0,0,0},
			{0,1,0,0,0,1,0},
			{0,0,1,1,1,0,0}};
	
	private static int[][] charD = { 
			{0,1,1,1,1,0,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,1,1,1,0,0}};
	
	private static int[][] charE = { 
			{0,1,1,1,1,1,0},
			{0,1,0,0,0,0,0},
			{0,1,0,0,0,0,0},
			{0,1,1,1,1,0,0},
			{0,1,0,0,0,0,0},
			{0,1,0,0,0,0,0},
			{0,1,1,1,1,1,0}};
	
	private static int[][] charF = { 
			{0,1,1,1,1,1,0},
			{0,1,0,0,0,0,0},
			{0,1,0,0,0,0,0},
			{0,1,1,1,1,0,0},
			{0,1,0,0,0,0,0},
			{0,1,0,0,0,0,0},
			{0,1,0,0,0,0,0}};
	
	private static int[][] charG = { 
			{0,0,1,1,1,0,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,0,0},
			{0,1,0,1,1,1,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,0,1,1,1,1,0}};
	
	private static int[][] charH = { 
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,1,1,1,1,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0}};
	
	private static int[][] charI = { 
			{0,0,1,1,1,0,0},
			{0,0,0,1,0,0,0},
			{0,0,0,1,0,0,0},
			{0,0,0,1,0,0,0},
			{0,0,0,1,0,0,0},
			{0,0,0,1,0,0,0},
			{0,0,1,1,1,0,0}};
	
	private static int[][] charJ = { 
			{0,0,0,0,0,1,0},
			{0,0,0,0,0,1,0},
			{0,0,0,0,0,1,0},
			{0,0,0,0,0,1,0},
			{0,0,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,1,1,1,1,0}};
	
	private static int[][] charK = { 
			{0,1,0,0,0,1,0},
			{0,1,0,0,1,0,0},
			{0,1,0,1,0,0,0},
			{0,1,1,0,0,0,0},
			{0,1,0,1,0,0,0},
			{0,1,0,0,1,0,0},
			{0,1,0,0,0,1,0}};
	
	private static int[][] charL = { 
			{0,1,0,0,0,0,0},
			{0,1,0,0,0,0,0},
			{0,1,0,0,0,0,0},
			{0,1,0,0,0,0,0},
			{0,1,0,0,0,0,0},
			{0,1,0,0,0,0,0},
			{0,1,1,1,1,1,0}};
	
	private static int[][] charM = { 
			{1,0,0,0,0,0,1},
			{1,1,0,0,0,1,1},
			{1,0,1,0,1,0,1},
			{1,0,0,1,0,0,1},
			{1,0,0,0,0,0,1},
			{1,0,0,0,0,0,1},
			{1,0,0,0,0,0,1}};
	
	private static int[][] charN = { 
			{0,1,0,0,0,1,0},
			{0,1,1,0,0,1,0},
			{0,1,1,0,0,1,0},
			{0,1,0,1,0,1,0},
			{0,1,0,1,0,1,0},
			{0,1,0,0,1,1,0},
			{0,1,0,0,1,1,0}};
	
	private static int[][] charO = { 
			{0,0,1,1,1,0,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,0,1,1,1,0,0}};
	
	private static int[][] charP = { 
			{0,1,1,1,1,0,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,1,1,1,0,0},
			{0,1,0,0,0,0,0},
			{0,1,0,0,0,0,0},
			{0,1,0,0,0,0,0}};
	
	private static int[][] charQ = { 
			{0,0,1,1,1,0,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,0,1,1,1,0,0},
			{0,0,0,0,0,1,0}};
	
	private static int[][] charR = { 
			{0,1,1,1,1,0,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,1,1,1,0,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0}};
	
	private static int[][] EMPTY = { 
			{0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0}};
	
	public static Array7x7 getChar(char chr) { Array7x7 res;
	switch(chr) {
	case 'A' : res = new Array7x7(charA); break;
	case 'B' : res = new Array7x7(charB); break;
	case 'C' : res = new Array7x7(charC); break;
	case 'D' : res = new Array7x7(charD); break;
	case 'E' : res = new Array7x7(charE); break;
	case 'F' : res = new Array7x7(charF); break;
	case 'G' : res = new Array7x7(charG); break;
	case 'H' : res = new Array7x7(charH); break;
	
	
	
	// övriga tecken, det blir en lång metod 
	
	
	
	
	default : res = new Array7x7();
	}
	return res; }
	
	
	public static void main(String[] args) {
		Chars rs = new Chars();
		ColorDisplay disp = new ColorDisplay(1, 1);
		
		int[][] choosenChar = charQ;
		
		int[][] arrrr = new int[7][7];
		
		for( int i = 0; i < 7; i++ ) {
			for( int j = 0; j < 7; j++ ) {
				if( choosenChar[i][j] == 1 ) {
					arrrr[i][j] = Color.BLACK;
				}
			}
		}
		
		disp.setDisplay(arrrr);
		disp.updateDisplay();
	
		JOptionPane.showMessageDialog(null, disp);
	}
}
