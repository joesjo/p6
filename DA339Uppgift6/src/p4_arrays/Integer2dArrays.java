package p4_arrays;

public class Integer2dArrays {

	public static String toString( int[][] array ) {
		
		if (array == null || array.length == 0)
			return "";

		String toReturn = "{";

		for( int i = 0; i < array.length; i++ ) {
			toReturn += "{";

			for( int j = 0; j < array[i].length; j++ ) {
				toReturn += array[i][j];

				if( j != array[i].length-1 ) {
					toReturn += ",";
				}
			}
			if( i != array.length-1 ) {
				toReturn += "},";
			}
			else {
				toReturn += "}";
			}
		}

		toReturn += "}";

		return toReturn;
	}

	public static int elements( int[][] array ) {
		
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

	public static int max( int[][] array ) {
		
		if (array == null || array.length == 0)
			return 0;

		int max = array[0][0];

		for( int i = 0; i < array.length; i++ ) {
			for( int j = 0; j < array[i].length; j++ ) {
				if( array[i][j] > max ) {
					max = array[i][j];
				}
			}
		}

		return max;

	}

	public static int min( int[][] array ) {
		
		if (array == null || array.length == 0)
			return 0;

		int min = array[0][0];

		for( int i = 0; i < array.length; i++ ) {
			for( int j = 0; j < array[i].length; j++ ) {
				if( array[i][j] < min ) {
					min = array[i][j];
				}
			}
		}

		return min;
	}

	public static int sum(int[][] array) {
		
		if (array == null || array.length == 0)
			return 0;

		int sum = 0;

		for( int i = 0; i < array.length; i++ ) {
			for( int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
		}

		return sum;

	}

	public static double average(int[][] array) {
		
		if (array == null || array.length == 0)
			return 0;

		int sum = 0;
		double average;
		int elem = 0;

		for( int i = 0; i < array.length; i++ ) {
			for( int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				elem++;
			}
		}

		double doubleSum = sum;
		double doubleElem = elem;

		average = doubleSum/doubleElem;

		return average;

	}

}
