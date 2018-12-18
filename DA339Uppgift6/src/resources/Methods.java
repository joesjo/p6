package resources;

public class Methods {
	
	public static int[] integerArrays_COPY(int[] array) {
		int[] newArray = new int[array.length];
		for( int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}
		return newArray;
	}
	
	public static int integer2DArrays_ELEMENTS( int[][] array ) {
		if (array == null || array.length == 0)
			return 0;
		int elements = 0;
		for( int i = 0; i < array.length; i++ ) {
			for( int j = 0; j < array[i].length; j++ ) {
				elements++;
			}
		}
		return elements;
	}
}
