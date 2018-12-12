package p4_arrays;

public class CountryArrays {

	public static String toString(Country[] array) {
		String ret = "{";
		
		for( int i = 0; i < array.length; i++ ) {
			ret += "[" + array[i].getName() + "," + array[i].getPopulation() + "]";

			if( i != array.length - 1) {
				ret += ", ";
			}
		}

		ret += "}";
		return ret;
	}

	public static int indexOf(Country[] array, Country country) {

		for( int i = 0; i < array.length; i++ ) {
			if( country.equals( array[i] ) ) {
				return i;

			}
		}
		return -1;
	}

	public static boolean member(Country[] array, Country country) {

		for( int i = 0; i < array.length; i++ ) {
			if( country.equals(array[i] )){
				return true;
			}
		}

		return false;
	}

	public static Country min(Country[] array) {

		Country min = array[0]; 
		for( int i = 1; i < array.length; i++ ) {
			if(min.compareTo( array[i] ) > 0 ) {
				min = array[i];
			}
		}
		return min;

	}

	public static Country max(Country[] array) {
		Country max = array[0]; 
		for( int i = 1; i < array.length; i++ ) {
			if(max.compareTo( array[i] ) < 0 ) {
				max = array[i];
			}
		}
		return max;

	}
}
