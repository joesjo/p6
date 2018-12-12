package p4_arrays;

import java.util.Arrays;

public class IntegerArrays {

	public static String toString(int[] array) {
		
		if (array == null || array.length == 0)
			return "";

		String toReturn = "{";

		for( int i = 0; i < array.length; i++) {

			toReturn += array[i];
			
			if( i != array.length - 1) {
				toReturn += ",";
			}
		}

		toReturn += "}";

		return toReturn;

	}

	public static int max(int[] array) {
		
		if (array == null || array.length == 0)
			return 0;

		int max = array[0];

		for( int i = 0; i < array.length; i++) {
			if( array[i] > max) {
				max = array[i];
			}
		}

		return max;

	}

	public static int min(int[] array) {
		
		if (array == null || array.length == 0)
			return 0;

		int min = array[0];

		for( int i = 0; i < array.length; i++) {
			if( array[i] < min) {
				min = array[i];
			}
		}

		return min;

	}

	public static int sum(int[] array) {
		
		if (array == null || array.length == 0)
			return 0;

		int sum = 0;

		for( int i = 0; i < array.length; i++) {

			sum += array[i];

		}

		return sum;

	}

	public static double average(int[] array) {
		
		if (array == null || array.length == 0)
			return 0;

		double average;
		double sum = 0;

		for( int i = 0; i < array.length; i++) {

			sum += array[i];

		}

		average = (sum/array.length);

		return average;

	}

	public static int range(int[] array) {
		
		if (array == null || array.length == 0)
			return 0;

		int range;
		int max = array[0];
		int min = max;

		for( int i = 0; i < array.length; i++) {

			if( array[i] > max) {
				max = array[i];
			}
			if( array[i] < min) {
				min = array[i];
			}
		}

		range = max-min;

		return range;
	}

	public static void sortAsc(int[] array) {

		Arrays.sort(array);

	}


	public static void sortDesc(int[] array) {

		int[] tempArr = copy(array);
		Arrays.sort(tempArr);

		int index = array.length-1;

		for( int i = 0; i < array.length; i++) {

			array[i] = tempArr[index];
			index --;

		}
	}

	public static int[] copy(int[] array) {

		int[] newArr = new int[array.length];

		for( int i = 0; i < array.length; i++) {

			newArr[i] = array[i];

		}

		return newArr;

	}

	public static double median(int[] array) {
		
		if (array == null || array.length == 0)
			return 0;

		double toReturn;

		int[] tempArr = copy(array);

		double l = tempArr.length/2;

		Arrays.sort( tempArr ) ;

		if( tempArr.length % 2 != 0) {

			toReturn = tempArr[( int )Math.ceil( l )];

			return toReturn;

		}

		else {

			double firstMeidan = tempArr[array.length / 2];
			double secondMedian = tempArr[(array.length / 2) - 1 ];

			toReturn = ( firstMeidan + secondMedian ) / 2;

			return toReturn;

		}
	}
}
