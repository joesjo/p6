package moment6;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.SwingUtilities;

import resources.Array7x7;
import resources.Chars;

public class Controller {

	private UserInterface ui;
	private Array7x7[][] array7x7;
	private Array7x7[][] tempArray7x7;
	private Timer timer;
	private int index;
	private int columns;
	private int rows;
	private static int color;

	public void setUI( UserInterface ui, int cols, int rows, int color ) {
		this.ui = ui;
		this.columns = cols;
		this.rows = rows;
		this.array7x7 = new Array7x7[rows][cols];
		this.tempArray7x7 = new Array7x7[rows][cols];
		this.color = color;
	}
	
	public class ToDo extends TimerTask { 
		public void run( ) {
			SwingUtilities.invokeLater( new Runnable() { 
				public void run() {
					if( index < 30000) {
						
						// tror den bara uppdaterar arrayn på den aktuella raden
						// man skulle kunna ha lite tempInts som håller koll på mellan vilka kolumner? 
						// för att minska antalet array7x7 som måste uppdateras
						
						// gäller även i [ ui.update7x7(array7x7); ]
						for( int i = (rows/2); i < (rows/2)+1; i++ ) {
							for( int j = 0; j < array7x7[i].length; j++ ) {
								if( j == 0) {
									array7x7[i][j].shiftRight(tempArray7x7[i][tempArray7x7[i].length-1].getCol(6));
								}		
								else {
									array7x7[i][j].shiftRight(tempArray7x7[i][j-1].getCol(6));
								}
							}
						}
						index++;
					}
					else {
						timer.cancel();
					}
					ui.update7x7(array7x7);
					updateTempArray7x7();
				}
			});
		}
	}

	public void showText() {
		for(int i = 0; i < array7x7.length; i++) {
			for( int j = 0; j < array7x7[i].length ; j++ ) {
				ui.setCharAtPos(array7x7[i][j].toIntArray(), i, j);
			}
		}
	}

	public void setTempArray7x7() {
		for( int i = 0; i < array7x7.length; i++ ) {
			for( int j = 0; j < array7x7[i].length; j++ ) {
				tempArray7x7[i][j] = new Array7x7( array7x7[i][j].getArray());

			}
		}	
	}
	
	public void updateTempArray7x7() {
		for( int i = 0; i < array7x7.length; i++ ) {
			for( int j = 0; j < array7x7[i].length; j++ ) {
				tempArray7x7[i][j].setArray(array7x7[i][j].getArray());

			}
		}	
	}
	
	public void setText(String text, int color) {
		int charIndex = 0;
		for(int i = 0; i < array7x7.length; i++) {
			for( int j = 0; j < array7x7[i].length ; j++ ) {

				if(i == (rows/2) && j >= ((columns/2) - (text.length()/2)) && charIndex < text.length()) {
					char c = text.charAt(charIndex);
					Array7x7 temp = new Array7x7(toColorText( Chars.getChar(c)));
					array7x7[ i][j] = temp;
					charIndex++;
				}
				else {
					array7x7[i][j] = new Array7x7();
				}
			}
		}
		setTempArray7x7();
	}

	public void flowRight() {
		this.timer = new Timer();
		this.index = 0;
		this.timer.schedule( new ToDo(), 300, 100);
	}

	public static int[][] toColorText( Array7x7 arrayIn ) {
		int[][] toReturn = new int[7][7];

		for(int i = 0; i < 7; i++) {
			for( int j = 0; j < 7; j++ ) {
				if(arrayIn.getElement(i, j) == 1) {
					toReturn[i][j] = color;
				}
			}
		}
		return toReturn;
	}
}
