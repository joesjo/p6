package resources;
import exceptions.InvalidLengthException;
import p4_arrays.*;

public class Array7 {
	
	private static final int array7Length = 7;
	private int[] array7 = new int[array7Length];

	public Array7() {
		this(new int[] {0,0,0,0,0,0,0});
	}
	
	public Array7( int[] array ){	
		if ( array.length == array7Length ) {
			this.array7 = array;
		}
		else {
			throw new InvalidLengthException("Array must contain exactly seven (7) integers: " + array.length );
		}
	}
	
	public Array7( Array7 array7 ) {
		this(array7.toIntArray());	
	}

	public void setElement( int pos, int value ) {
		array7[pos] = value;
	}
	
	public int getElement(int pos) {
		return array7[pos];
	}
	
	public void setArray(Array7 array7) {
		if ( array7.toIntArray().length == array7Length ) {
			this.array7 = array7.toIntArray();
		}
		else {
			throw new InvalidLengthException("Array must contain exactly seven (7) integers: " + array7.toIntArray().length );
		}
		this.array7 = array7.toIntArray();
	}
	
	public void setArray(int[] array){
		if ( array.length == array7Length ) {
			this.array7 = array;
		}
		else {
			throw new InvalidLengthException("Array must contain exactly seven (7) integers: " + array.length );
		}
	}
	
	public Array7 getArray() {
		Array7 array7toReturn = new Array7(IntegerArrays.copy(this.array7));
		return array7toReturn;
	}
	
	public int[] toIntArray() {
		int[] arrayToRetrun = IntegerArrays.copy(this.array7);
		return arrayToRetrun;
	}
}
