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

	private static int[][] charS = { 
			{0,0,1,1,1,0,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,0,0},
			{0,0,1,1,1,0,0},
			{0,0,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,0,1,1,1,0,0}};

	private static int[][] charT = { 
			{0,1,1,1,1,1,0},
			{0,0,0,1,0,0,0},
			{0,0,0,1,0,0,0},
			{0,0,0,1,0,0,0},
			{0,0,0,1,0,0,0},
			{0,0,0,1,0,0,0},
			{0,0,0,1,0,0,0}};

	private static int[][] charU = { 
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,0,1,1,1,0,0}};

	private static int[][] charV = { 
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,0,1,0,1,0,0},
			{0,0,1,0,1,0,0},
			{0,0,0,1,0,0,0}};

	private static int[][] charW = { 
			{1,0,0,0,0,0,1},
			{1,0,0,0,0,0,1},
			{1,0,0,0,0,0,1},
			{1,0,0,1,0,0,1},
			{1,0,1,0,1,0,1},
			{1,1,0,0,0,1,1},
			{1,0,0,0,0,0,1}};

	private static int[][] charX = { 
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,0,1,0,1,0,0},
			{0,0,0,1,0,0,0},
			{0,0,1,0,1,0,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0}};

	private static int[][] charY = { 
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,1,0,0,0,1,0},
			{0,0,1,1,1,0,0},
			{0,0,0,1,0,0,0},
			{0,0,0,1,0,0,0},
			{0,0,0,1,0,0,0}};

	private static int[][] charZ = { 
			{0,1,1,1,1,1,0},
			{0,0,0,0,0,1,0},
			{0,0,0,0,1,0,0},
			{0,0,0,1,0,0,0},
			{0,0,1,0,0,0,0},
			{0,1,0,0,0,0,0},
			{0,1,1,1,1,1,0}};

	private static int[][] SPACE = { 
			{0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0}};
	
	private static int[][] UNKNOWN = { 
			{1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1},	
			{1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1}};

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
	case 'I' : res = new Array7x7(charI); break;
	case 'J' : res = new Array7x7(charJ); break;
	case 'K' : res = new Array7x7(charK); break;
	case 'L' : res = new Array7x7(charL); break;
	case 'M' : res = new Array7x7(charM); break;
	case 'N' : res = new Array7x7(charN); break;
	case 'O' : res = new Array7x7(charO); break;
	case 'P' : res = new Array7x7(charP); break;
	case 'Q' : res = new Array7x7(charQ); break;
	case 'R' : res = new Array7x7(charR); break;
	case 'S' : res = new Array7x7(charS); break;
	case 'T' : res = new Array7x7(charT); break;
	case 'U' : res = new Array7x7(charU); break;
	case 'V' : res = new Array7x7(charV); break;
	case 'W' : res = new Array7x7(charW); break;
	case 'X' : res = new Array7x7(charX); break;
	case 'Y' : res = new Array7x7(charY); break;
	case 'Z' : res = new Array7x7(charZ); break;

	default : res = new Array7x7();
	}
	return res; }


	public static void main(String[] args) {
		Chars rs = new Chars();
		ColorDisplay disp = new ColorDisplay(1, 1);

		int[][] choosenChar = charW;

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
