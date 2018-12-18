package resources;
import exceptions.InvalidLengthException;
public class Array7x7 {

	/*
	 * amount of ELEMENTS in an Array7 array.
	 */
	private static final int array7Length = 7;
	
	/*
	 * amount of ELEMENTS in an Array7x7 array.
	 */
	private static final int array7x7Length =  array7Length * array7Length;
	
	private int[][] array7x7 = new int[array7Length][array7Length];
	private Array7 array7;

	public Array7x7() {
		this(new int[][]{
			{0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0}});
	}

	public Array7x7( int[][] array ) {
		if( Methods.integer2DArrays_ELEMENTS(array) == array7x7Length ) {
			this.array7x7 = array;
		}
		else {
			throw new InvalidLengthException( "Array must contain exactly seven (7) arrays with exactly seven (7) integers each: " );
		}
	}

	public Array7x7( Array7x7 array ) {
	
		if( Methods.integer2DArrays_ELEMENTS(array.toIntArray()) == array7x7Length ) {
			this.array7x7 = array.toIntArray();
		}
		else {
			throw new InvalidLengthException( "Array must contain exactly seven (7) arrays with exactly seven (7) integers each: " );
		}	
	}

	public void setElement( int row, int col, int value ) {
		array7x7[row][col] = value;
	}

	public int getElement( int row, int col ) {
		return array7x7[row][col];
	}

	public void setRow( int row, Array7 theRow ) {
		for( int i = 0; i < array7Length; i++ ) {
			array7x7[row][i] = theRow.getElement(i);
		}
	}

	public Array7 getRow( int row ) {
		Array7 arrayToReturn = new Array7();
		for( int i = 0; i < array7Length; i++ ) {
			arrayToReturn.setElement( i, array7x7[row][i] );
		}
		return arrayToReturn;	
	}

	public void setCol( int col, Array7 theCol ) {
		for( int i = 0; i < array7Length; i++ ) {
			array7x7[i][col] = theCol.getElement(i);
		}
	}

	public Array7 getCol( int col ) {
		Array7 arrayToReturn = new Array7();
		for( int i = 0; i < array7Length; i++ ) {
			arrayToReturn.setElement( i, array7x7[i][col] );
		}
		return arrayToReturn;	
	}

	public void setArray( Array7x7 array7x7 ) {
		for( int i = 0; i < 7; i++ ) {
			for( int j = 0; j < array7Length; j++ ) {
				this.array7x7[i][j] = array7x7.getElement( i, j );
			}
		}
	}

	public Array7x7 getArray() {

		Array7x7 arrayToReturn = new Array7x7(this.array7x7);
		return arrayToReturn;
	}

	public int[][] toIntArray() {

		int[][] arrayToReturn = new int[array7Length][array7Length];

		for( int i = 0; i < array7Length; i++ ) {
			for( int j = 0; j < array7Length; j++ ) {
				arrayToReturn[i][j] = this.array7x7[i][j];
			}
		}
		return arrayToReturn;
	}

	public void shiftLeft() {
		shiftLeft( new Array7() );
	}
	
	public void shiftLeft( Array7 array7 ) {
		array7 = new Array7( getCol(0) );
		
		for( int i = 0; i < array7Length - 1; i++ ) {
			setCol(i, getCol(i + 1));
		}
		setCol( array7Length - 1, array7 );
		
	}
	
	public void shiftRight( Array7 array7 ) {
		
		array7 = new Array7( getCol(array7Length-1) );
	
		for( int i = array7Length-1; i > 0; i-- ) {
			setCol( i, getCol( i - 1 ) );
		}
		setCol(0, array7);
	}
	
	public Array7 getTempArray() {
		return this.array7;
	}
}

