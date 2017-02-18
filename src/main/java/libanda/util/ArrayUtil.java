package libanda.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

/*	
 * 
 * Methods:
 * 		equals(arrayA, arrayB)
 * 		delete(array, index)
 * 		addEntry(array, entry, index)
 * 		addEntry(array, entry) (write to end of array)
 * 		move(array, indexFrom, indexTo)
 * 		toString(array)
 * 	
 * 		To Add:
 * 	
 * */
/**
 * The SAM-Class (Support-Array-Methods-Class) provides helpful methods, which
 * are useful when you are working with arrays.
 * 
 * @author Florian Stricker
 * @version 1.0.2015.10.10
 */
public class ArrayUtil {

	/*
	 * For: Object, boolean, char, String, byte, short, int, long, float, double
	 * Comparison of Array-Contents
	 * 
	 */

	/**
	 * Checks if two complex arrays have the same content.
	 * 
	 * @param arrayA
	 *            The first array
	 * @param arrayB
	 *            The second array
	 * @return true if the two arrays have the same length and their content is
	 *         equal
	 */
	public static <T, C extends T> boolean equals(T[] arrayA, C[] arrayB) {
		boolean areEqual;
		if (arrayA == arrayB) {
			areEqual = true;
		} else if (arrayA == null || arrayB == null || arrayA.length != arrayB.length) {
			areEqual = false;
		} else {
			areEqual = true;
			for (int i = 0; i < arrayA.length; i++) {
				if (!arrayA[i].equals(arrayB[i])){
					areEqual = false;
					break;
				}
			}
		}
		return areEqual;
	}

	/**
	 * Checks if two boolean-arrays have the same content.
	 * 
	 * @param arrayA
	 *            The first array
	 * @param arrayB
	 *            The second array
	 * @return true if the two arrays have the same length and their content is
	 *         equal
	 */
	public static boolean equals(boolean[] arrayA, boolean[] arrayB) {
		/*
		 * if (arrayA == arrayB) { return true; } else if (arrayA == null ||
		 * arrayB == null || arrayA.length != arrayB.length) { return false; }
		 * else { for (int i = 0; i < arrayA.length; i++) { if (!(arrayA[i] ==
		 * arrayB[i])) return false; } return true; }
		 */
		return equals(ArrayUtils.toObject(arrayA), ArrayUtils.toObject(arrayB));
	}

	/**
	 * Checks if two char-arrays have the same content.
	 * 
	 * @param arrayA
	 *            The first array
	 * @param arrayB
	 *            The second array
	 * @return true if the two arrays have the same length and their content is
	 *         equal
	 */
	public static boolean equals(char[] arrayA, char[] arrayB) {
		/*
		 * if (arrayA == arrayB) { return true; } else if (arrayA == null ||
		 * arrayB == null || arrayA.length != arrayB.length) { return false; }
		 * else { for (int i = 0; i < arrayA.length; i++) { if (!(arrayA[i] ==
		 * arrayB[i])) return false; } return true; }
		 */
		return equals(ArrayUtils.toObject(arrayA), ArrayUtils.toObject(arrayB));
	}

	/**
	 * Checks if two byte-arrays have the same content.
	 * 
	 * @param arrayA
	 *            The first array
	 * @param arrayB
	 *            The second array
	 * @return true if the two arrays have the same length and their content is
	 *         equal
	 */
	public static boolean equals(byte[] arrayA, byte[] arrayB) {
		/*
		 * if (arrayA == arrayB) { return true; } else if (arrayA == null ||
		 * arrayB == null || arrayA.length != arrayB.length) { return false; }
		 * else { for (int i = 0; i < arrayA.length; i++) { if (!(arrayA[i] ==
		 * arrayB[i])) return false; } return true; }
		 */
		return equals(ArrayUtils.toObject(arrayA), ArrayUtils.toObject(arrayB));
	}

	/**
	 * Checks if two short-arrays have the same content.
	 * 
	 * @param arrayA
	 *            The first array
	 * @param arrayB
	 *            The second array
	 * @return true if the two arrays have the same length and their content is
	 *         equal
	 */
	public static boolean equals(short[] arrayA, short[] arrayB) {
		/*
		 * if (arrayA == arrayB) { return true; } else if (arrayA == null ||
		 * arrayB == null || arrayA.length != arrayB.length) { return false; }
		 * else { for (int i = 0; i < arrayA.length; i++) { if (!(arrayA[i] ==
		 * arrayB[i])) return false; } return true; }
		 */
		return equals(ArrayUtils.toObject(arrayA), ArrayUtils.toObject(arrayB));
	}

	/**
	 * Checks if two int-arrays have the same content.
	 * 
	 * @param arrayA
	 *            The first array
	 * @param arrayB
	 *            The second array
	 * @return true if the two arrays have the same length and their content is
	 *         equal
	 */
	public static boolean equals(int[] arrayA, int[] arrayB) {
		/*
		 * if (arrayA == arrayB) { return true; } else if (arrayA == null ||
		 * arrayB == null || arrayA.length != arrayB.length) { return false; }
		 * else { for (int i = 0; i < arrayA.length; i++) { if (!(arrayA[i] ==
		 * arrayB[i])) return false; } return true; }
		 */
		return equals(ArrayUtils.toObject(arrayA), ArrayUtils.toObject(arrayB));
	}

	/**
	 * Checks if two long-arrays have the same content.
	 * 
	 * @param arrayA
	 *            The first array
	 * @param arrayB
	 *            The second array
	 * @return true if the two arrays have the same length and their content is
	 *         equal
	 */
	public static boolean equals(long[] arrayA, long[] arrayB) {
		/*
		 * if (arrayA == arrayB) { return true; } else if (arrayA == null ||
		 * arrayB == null || arrayA.length != arrayB.length) { return false; }
		 * else { for (int i = 0; i < arrayA.length; i++) { if (!(arrayA[i] ==
		 * arrayB[i])) return false; } return true; }
		 */
		return equals(ArrayUtils.toObject(arrayA), ArrayUtils.toObject(arrayB));
	}

	/**
	 * Checks if two float-arrays have the same content.
	 * 
	 * @param arrayA
	 *            The first array
	 * @param arrayB
	 *            The second array
	 * @return true if the two arrays have the same length and their content is
	 *         equal
	 */
	public static boolean equals(float[] arrayA, float[] arrayB) {
		/*
		 * if (arrayA == arrayB) { return true; } else if (arrayA == null ||
		 * arrayB == null || arrayA.length != arrayB.length) { return false; }
		 * else { for (int i = 0; i < arrayA.length; i++) { if (!(arrayA[i] ==
		 * arrayB[i])) return false; } return true; }
		 */
		return equals(ArrayUtils.toObject(arrayA), ArrayUtils.toObject(arrayB));
	}

	/**
	 * Checks if two double-arrays have the same content.
	 * 
	 * @param arrayA
	 *            The first array
	 * @param arrayB
	 *            The second array
	 * @return true if the two arrays have the same length and their content is
	 *         equal
	 */
	public static boolean equals(double[] arrayA, double[] arrayB) {
		/*
		 * if (arrayA == arrayB) { return true; } else if (arrayA == null ||
		 * arrayB == null || arrayA.length != arrayB.length) { return false; }
		 * else { for (int i = 0; i < arrayA.length; i++) { if (!(arrayA[i] ==
		 * arrayB[i])) return false; } return true; }
		 */
		return equals(ArrayUtils.toObject(arrayA), ArrayUtils.toObject(arrayB));
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	/*
	 * For: Object, boolean, char, String, byte, short, int, long, float, double
	 * Delete entry from Array
	 * 
	 */

	/**
	 * Deletes an entry from the given array using its index.
	 * 
	 * @param array
	 *            The original array
	 * @param index
	 *            The index of the entry which will then be deleted
	 * @return the new array without the specified entry or the original array
	 *         if the passed index was invalid.
	 */
	public static <T> T[] delete(T[] array, int index) {
		if (index < 0 || index >= array.length) {
			return array;
		}
		@SuppressWarnings("unchecked")
		T[] newArray = (T[]) Array.newInstance(array.getClass(), array.length - 1);
		List<T> list = new ArrayList<>(Arrays.asList(array));
		list.remove(index);
		return list.toArray(newArray);
	}

	/**
	 * Deletes an entry from the given array using its index.
	 * 
	 * @param array
	 *            The original array
	 * @param index
	 *            The index of the entry which will then be deleted
	 * @return the new array without the specified entry or the original array
	 *         if the passed index was invalid.
	 */
	public static boolean[] delete(boolean[] array, int index) {
		/*
		 * if (index < 0 || index >= array.length) { return array; } boolean[]
		 * newArray = new boolean[array.length - 1]; for (int i = 0; i < index;
		 * i++) newArray[i] = array[i]; for (int i = index; i < newArray.length;
		 * i++) newArray[i] = array[i + 1]; return newArray;
		 */
		Boolean[] result = delete(ArrayUtils.toObject(array), index);
		return ArrayUtils.toPrimitive(result);
	}

	/**
	 * Deletes an entry from the given array using its index.
	 * 
	 * @param array
	 *            The original array
	 * @param index
	 *            The index of the entry which will then be deleted
	 * @return the new array without the specified entry or the original array
	 *         if the passed index was invalid.
	 */
	public static char[] delete(char[] array, int index) {
		/*
		 * if (index < 0 || index >= array.length) { return array; } char[]
		 * newArray = new char[array.length - 1]; for (int i = 0; i < index;
		 * i++) newArray[i] = array[i]; for (int i = index; i < newArray.length;
		 * i++) newArray[i] = array[i + 1]; return newArray;
		 */
		Character[] result = delete(ArrayUtils.toObject(array), index);
		return ArrayUtils.toPrimitive(result);
	}

	/**
	 * Deletes an entry from the given array using its index.
	 * 
	 * @param array
	 *            The original array
	 * @param index
	 *            The index of the entry which will then be deleted
	 * @return the new array without the specified entry or the original array
	 *         if the passed index was invalid.
	 */
	public static byte[] delete(byte[] array, int index) {
		/*
		 * if (index < 0 || index >= array.length) { return array; } byte[]
		 * newArray = new byte[array.length - 1]; for (int i = 0; i < index;
		 * i++) newArray[i] = array[i]; for (int i = index; i < newArray.length;
		 * i++) newArray[i] = array[i + 1]; return newArray;
		 */
		Byte[] result = delete(ArrayUtils.toObject(array), index);
		return ArrayUtils.toPrimitive(result);
	}

	/**
	 * Deletes an entry from the given array using its index.
	 * 
	 * @param array
	 *            The original array
	 * @param index
	 *            The index of the entry which will then be deleted
	 * @return the new array without the specified entry or the original array
	 *         if the passed index was invalid.
	 */
	public static short[] delete(short[] array, int index) {
		/*
		 * if (index < 0 || index >= array.length) { return array; } short[]
		 * newArray = new short[array.length - 1]; for (int i = 0; i < index;
		 * i++) newArray[i] = array[i]; for (int i = index; i < newArray.length;
		 * i++) newArray[i] = array[i + 1]; return newArray;
		 */
		Short[] result = delete(ArrayUtils.toObject(array), index);
		return ArrayUtils.toPrimitive(result);
	}

	/**
	 * Deletes an entry from the given array using its index.
	 * 
	 * @param array
	 *            The original array
	 * @param index
	 *            The index of the entry which will then be deleted
	 * @return the new array without the specified entry or the original array
	 *         if the passed index was invalid.
	 */
	public static int[] delete(int[] array, int index) {
		/*
		 * if (index < 0 || index >= array.length) { return array; } int[]
		 * newArray = new int[array.length - 1]; for (int i = 0; i < index; i++)
		 * newArray[i] = array[i]; for (int i = index; i < newArray.length; i++)
		 * newArray[i] = array[i + 1]; return newArray;
		 */
		Integer[] result = delete(ArrayUtils.toObject(array), index);
		return ArrayUtils.toPrimitive(result);
	}

	/**
	 * Deletes an entry from the given array using its index.
	 * 
	 * @param array
	 *            The original array
	 * @param index
	 *            The index of the entry which will then be deleted
	 * @return the new array without the specified entry or the original array
	 *         if the passed index was invalid.
	 */
	public static long[] delete(long[] array, int index) {
		/*
		 * if (index < 0 || index >= array.length) { return array; } long[]
		 * newArray = new long[array.length - 1]; for (int i = 0; i < index;
		 * i++) newArray[i] = array[i]; for (int i = index; i < newArray.length;
		 * i++) newArray[i] = array[i + 1]; return newArray;
		 */
		Long[] result = delete(ArrayUtils.toObject(array), index);
		return ArrayUtils.toPrimitive(result);
	}

	/**
	 * Deletes an entry from the given array using its index.
	 * 
	 * @param array
	 *            The original array
	 * @param index
	 *            The index of the entry which will then be deleted
	 * @return the new array without the specified entry or the original array
	 *         if the passed index was invalid.
	 */
	public static float[] delete(float[] array, int index) {
		/*
		 * if (index < 0 || index >= array.length) { return array; } float[]
		 * newArray = new float[array.length - 1]; for (int i = 0; i < index;
		 * i++) newArray[i] = array[i]; for (int i = index; i < newArray.length;
		 * i++) newArray[i] = array[i + 1]; return newArray;
		 */
		Float[] result = delete(ArrayUtils.toObject(array), index);
		return ArrayUtils.toPrimitive(result);
	}

	/**
	 * Deletes an entry from the given array using its index.
	 * 
	 * @param array
	 *            The original array
	 * @param index
	 *            The index of the entry which will then be deleted
	 * @return the new array without the specified entry or the original array
	 *         if the passed index was invalid.
	 */
	public static double[] delete(double[] array, int index) {
		/*
		 * if (index < 0 || index >= array.length) { return array; } double[]
		 * newArray = new double[array.length - 1]; for (int i = 0; i < index;
		 * i++) newArray[i] = array[i]; for (int i = index; i < newArray.length;
		 * i++) newArray[i] = array[i + 1]; return newArray;
		 */
		Double[] result = delete(ArrayUtils.toObject(array), index);
		return ArrayUtils.toPrimitive(result);
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	/*
	 * For: Object, boolean, char, String, byte, short, int, long, float, double
	 * add "entry" in "array" on "indexPos"
	 * 
	 */

	/**
	 * Adds an entry at a specified index to a given array.
	 * 
	 * @param array
	 *            The array which will be extended
	 * @param entry
	 *            The entry which will be added
	 * @param indexPos
	 *            The position at which the entry will be added
	 * @return the extended array, or the original array in case the indexPos
	 *         was negative.
	 */
	public static <T> T[] add(T[] array, T entry, int indexPos) {
		if (indexPos < 0) {
			return array;
		}
		if (indexPos > array.length){
			indexPos = array.length;
		}
		List<T> list = new ArrayList<>(Arrays.asList(array));
		list.add(indexPos, entry);
		return list.toArray(array);
	}

	/**
	 * Appends an entry to the given array
	 * 
	 * @param array
	 *            The array which will be extended
	 * @param entry
	 *            The entry which will be appended
	 * @return the extended array.
	 */
	public static <T> T[] append(T[] array, T entry) {
		return add(array, entry, array.length);
	}

	/**
	 * Prepends an entry to the given array
	 * 
	 * @param array
	 *            The array which will be extended
	 * @param entry
	 *            The entry which will be prepended
	 * @return
	 */
	public static <T> T[] prepend(T[] array, T entry) {
		return add(array, entry, 0);
	}

	/**
	 * Adds an entry at a specified index to a given array.
	 * 
	 * @param array
	 *            The array which will be extended
	 * @param entry
	 *            The entry which will be added
	 * @param indexPos
	 *            The position at which the entry will be added
	 * @return the extended array, or the original array in case the indexPos
	 *         was negative.
	 */
	public static boolean[] add(boolean[] array, boolean entry, int indexPos) {
		/*if (indexPos < 0) {
			return array;
		}
		boolean[] newArray = new boolean[array.length + 1];
		if (indexPos >= array.length) {
			for (int i = 0; i < array.length; i++)
				newArray[i] = array[i];
			newArray[newArray.length - 1] = entry;
		} else {
			for (int i = 0; i < indexPos; i++)
				newArray[i] = array[i];
			newArray[indexPos] = entry;
			for (int i = indexPos + 1; i < newArray.length; i++)
				newArray[i] = array[i - 1];
		}
		return newArray;*/
		Boolean[] objArray = ArrayUtils.toObject(array);
		Boolean[] newArray = add(objArray, entry, indexPos);
		return ArrayUtils.toPrimitive(newArray);
	} 

	/**
	 * Adds an entry to end of the given array.
	 * 
	 * @param array
	 *            The array which will be extended
	 * @param entry
	 *            The entry which will be added
	 * @return the extended array.
	 */
	public static boolean[] append(boolean[] array, boolean entry) {
		return add(array, entry, array.length);
	}
	
	public static boolean[] prepend(boolean[] array, boolean entry){
		return add(array, entry, 0);
	}

	/**
	 * Adds an entry at a specified index to a given array.
	 * 
	 * @param array
	 *            The array which will be extended
	 * @param entry
	 *            The entry which will be added
	 * @param indexPos
	 *            The position at which the entry will be added
	 * @return the extended array, or the original array in case the indexPos
	 *         was negative.
	 */
	public static char[] add(char[] array, char entry, int indexPos) {
		/*if (indexPos < 0) {
			return array;
		}
		char[] newArray = new char[array.length + 1];
		if (indexPos >= array.length) {
			for (int i = 0; i < array.length; i++)
				newArray[i] = array[i];
			newArray[newArray.length - 1] = entry;
		} else {
			for (int i = 0; i < indexPos; i++)
				newArray[i] = array[i];
			newArray[indexPos] = entry;
			for (int i = indexPos + 1; i < newArray.length; i++)
				newArray[i] = array[i - 1];
		}
		return newArray;*/
		Character[] objArray = ArrayUtils.toObject(array);
		Character[] newArray = add(objArray, entry, indexPos);
		return ArrayUtils.toPrimitive(newArray);
	}

	/**
	 * Adds an entry to end of the given array.
	 * 
	 * @param array
	 *            The array which will be extended
	 * @param entry
	 *            The entry which will be added
	 * @return the extended array.
	 */
	public static char[] append(char[] array, char entry) {
		return add(array, entry, array.length);
	}
	
	public static char[] prepend(char[] array, char entry) {
		return add(array, entry, 0);
	}

	/**
	 * Adds an entry at a specified index to a given array.
	 * 
	 * @param array
	 *            The array which will be extended
	 * @param entry
	 *            The entry which will be added
	 * @param indexPos
	 *            The position at which the entry will be added
	 * @return the extended array, or the original array in case the indexPos
	 *         was negative.
	 */
	public static byte[] add(byte[] array, byte entry, int indexPos) {
		/*if (indexPos < 0) {
			return array;
		}
		byte[] newArray = new byte[array.length + 1];
		if (indexPos >= array.length) {
			for (int i = 0; i < array.length; i++)
				newArray[i] = array[i];
			newArray[newArray.length - 1] = entry;
		} else {
			for (int i = 0; i < indexPos; i++)
				newArray[i] = array[i];
			newArray[indexPos] = entry;
			for (int i = indexPos + 1; i < newArray.length; i++)
				newArray[i] = array[i - 1];
		}
		return newArray;*/
		Byte[] objArray = ArrayUtils.toObject(array);
		Byte[] newArray = add(objArray, entry, indexPos);
		return ArrayUtils.toPrimitive(newArray);
	}

	/**
	 * Adds an entry to end of the given array.
	 * 
	 * @param array
	 *            The array which will be extended
	 * @param entry
	 *            The entry which will be added
	 * @return the extended array.
	 */
	public static byte[] append(byte[] array, byte entry) {
		return add(array, entry, array.length);
	}
	
	public static byte[] prepend(byte[] array, byte entry) {
		return add(array, entry, 0);
	}

	/**
	 * Adds an entry at a specified index to a given array.
	 * 
	 * @param array
	 *            The array which will be extended
	 * @param entry
	 *            The entry which will be added
	 * @param indexPos
	 *            The position at which the entry will be added
	 * @return the extended array, or the original array in case the indexPos
	 *         was negative.
	 */
	public static short[] add(short[] array, short entry, int indexPos) {
		/*if (indexPos < 0) {
			return array;
		}
		short[] newArray = new short[array.length + 1];
		if (indexPos >= array.length) {
			for (int i = 0; i < array.length; i++)
				newArray[i] = array[i];
			newArray[newArray.length - 1] = entry;
		} else {
			for (int i = 0; i < indexPos; i++)
				newArray[i] = array[i];
			newArray[indexPos] = entry;
			for (int i = indexPos + 1; i < newArray.length; i++)
				newArray[i] = array[i - 1];
		}
		return newArray;*/
		Short[] objArray = ArrayUtils.toObject(array);
		Short[] newArray = add(objArray, entry, indexPos);
		return ArrayUtils.toPrimitive(newArray);
	}

	/**
	 * Adds an entry to end of the given array.
	 * 
	 * @param array
	 *            The array which will be extended
	 * @param entry
	 *            The entry which will be added
	 * @return the extended array.
	 */
	public static short[] append(short[] array, short entry) {
		return add(array, entry, array.length);
	}
	
	public static short[] prepend(short[] array, short entry) {
		return add(array, entry, 0);
	}

	/**
	 * Adds an entry at a specified index to a given array.
	 * 
	 * @param array
	 *            The array which will be extended
	 * @param entry
	 *            The entry which will be added
	 * @param indexPos
	 *            The position at which the entry will be added
	 * @return the extended array, or the original array in case the indexPos
	 *         was negative.
	 */
	public static int[] add(int[] array, int entry, int indexPos) {
		/*if (indexPos < 0) {
			return array;
		}
		int[] newArray = new int[array.length + 1];
		if (indexPos >= array.length) {
			for (int i = 0; i < array.length; i++)
				newArray[i] = array[i];
			newArray[newArray.length - 1] = entry;
		} else {
			for (int i = 0; i < indexPos; i++)
				newArray[i] = array[i];
			newArray[indexPos] = entry;
			for (int i = indexPos + 1; i < newArray.length; i++)
				newArray[i] = array[i - 1];
		}
		return newArray;*/
		Integer[] objArray = ArrayUtils.toObject(array);
		Integer[] newArray = add(objArray, entry, indexPos);
		return ArrayUtils.toPrimitive(newArray);
	}

	/**
	 * Adds an entry to end of the given array.
	 * 
	 * @param array
	 *            The array which will be extended
	 * @param entry
	 *            The entry which will be added
	 * @return the extended array.
	 */
	public static int[] append(int[] array, int entry) {
		return add(array, entry, array.length);
	}
	
	public static int[] prepend(int[] array, int entry) {
		return add(array, entry, 0);
	}

	/**
	 * Adds an entry at a specified index to a given array.
	 * 
	 * @param array
	 *            The array which will be extended
	 * @param entry
	 *            The entry which will be added
	 * @param indexPos
	 *            The position at which the entry will be added
	 * @return the extended array, or the original array in case the indexPos
	 *         was negative.
	 */
	public static long[] add(long[] array, long entry, int indexPos) {
		/*if (indexPos < 0) {
			return array;
		}
		long[] newArray = new long[array.length + 1];
		if (indexPos >= array.length) {
			for (int i = 0; i < array.length; i++)
				newArray[i] = array[i];
			newArray[newArray.length - 1] = entry;
		} else {
			for (int i = 0; i < indexPos; i++)
				newArray[i] = array[i];
			newArray[indexPos] = entry;
			for (int i = indexPos + 1; i < newArray.length; i++)
				newArray[i] = array[i - 1];
		}
		return newArray;*/
		Long[] objArray = ArrayUtils.toObject(array);
		Long[] newArray = add(objArray, entry, indexPos);
		return ArrayUtils.toPrimitive(newArray);
	}

	/**
	 * Adds an entry to end of the given array.
	 * 
	 * @param array
	 *            The array which will be extended
	 * @param entry
	 *            The entry which will be added
	 * @return the extended array.
	 */
	public static long[] append(long[] array, long entry) {
		return add(array, entry, array.length);
	}
	
	public static long[] prepend(long[] array, long entry) {
		return add(array, entry, 0);
	}

	/**
	 * Adds an entry at a specified index to a given array.
	 * 
	 * @param array
	 *            The array which will be extended
	 * @param entry
	 *            The entry which will be added
	 * @param indexPos
	 *            The position at which the entry will be added
	 * @return the extended array, or the original array in case the indexPos
	 *         was negative.
	 */
	public static float[] add(float[] array, float entry, int indexPos) {
		/*if (indexPos < 0) {
			return array;
		}
		float[] newArray = new float[array.length + 1];
		if (indexPos >= array.length) {
			for (int i = 0; i < array.length; i++)
				newArray[i] = array[i];
			newArray[newArray.length - 1] = entry;
		} else {
			for (int i = 0; i < indexPos; i++)
				newArray[i] = array[i];
			newArray[indexPos] = entry;
			for (int i = indexPos + 1; i < newArray.length; i++)
				newArray[i] = array[i - 1];
		}
		return newArray;*/
		Float[] objArray = ArrayUtils.toObject(array);
		Float[] newArray = add(objArray, entry, indexPos);
		return ArrayUtils.toPrimitive(newArray);
	}

	/**
	 * Adds an entry to end of the given array.
	 * 
	 * @param array
	 *            The array which will be extended
	 * @param entry
	 *            The entry which will be added
	 * @return the extended array.
	 */
	public static float[] append(float[] array, float entry) {
		return add(array, entry, array.length);
	}
	
	public static float[] prepend(float[] array, float entry) {
		return add(array, entry, 0);
	}

	/**
	 * Adds an entry at a specified index to a given array.
	 * 
	 * @param array
	 *            The array which will be extended
	 * @param entry
	 *            The entry which will be added
	 * @param indexPos
	 *            The position at which the entry will be added
	 * @return the extended array, or the original array in case the indexPos
	 *         was negative.
	 */
	public static double[] add(double[] array, double entry, int indexPos) {
		/*if (indexPos < 0) {
			return array;
		}
		double[] newArray = new double[array.length + 1];
		if (indexPos >= array.length) {
			for (int i = 0; i < array.length; i++)
				newArray[i] = array[i];
			newArray[newArray.length - 1] = entry;
		} else {
			for (int i = 0; i < indexPos; i++)
				newArray[i] = array[i];
			newArray[indexPos] = entry;
			for (int i = indexPos + 1; i < newArray.length; i++)
				newArray[i] = array[i - 1];
		}
		return newArray;*/
		Double[] objArray = ArrayUtils.toObject(array);
		Double[] newArray = add(objArray, entry, indexPos);
		return ArrayUtils.toPrimitive(newArray);
	}

	/**
	 * Adds an entry to end of the given array.
	 * 
	 * @param array
	 *            The array which will be extended
	 * @param entry
	 *            The entry which will be added
	 * @return the extended array.
	 */
	public static double[] append(double[] array, double entry) {
		return add(array, entry, array.length);
	}
	
	public static double[] prepend(double[] array, double entry) {
		return add(array, entry, 0);
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	/*
	 * For: Object, boolean, char, String, byte, short, int, long, float, double
	 * move Entry in "array" from "indexFrom" to "indexTo"
	 * 
	 */

	/**
	 * Moves a array-entry from a specified index to an other.
	 * 
	 * @param array
	 *            The array which holds the entry
	 * @param indexFrom
	 *            The index of the entry which will be moved
	 * @param indexTo
	 *            The index which the entry will be moved to
	 * @return The array with the moved entry, or the original array if
	 *         indexFrom was not an valid index or indexTo was below 0.
	 */
	public static <T> T[] move(T[] array, int indexFrom, int indexTo) {
		if (indexFrom < 0 || indexFrom >= array.length || indexTo < 0) {
			return array;
		}
		List<T> list = new ArrayList<>(Arrays.asList(array));
		T entry = list.get(indexFrom);
		list.remove(indexFrom);
		list.add(indexTo, entry);
		return list.toArray(array);
	}

	/**
	 * Moves a array-entry from a specified index to an other.
	 * 
	 * @param array
	 *            The array which holds the entry
	 * @param indexFrom
	 *            The index of the entry which will be moved
	 * @param indexTo
	 *            The index which the entry will be moved to
	 * @return The array with the moved entry, or the original array if
	 *         indexFrom was not an valid index or indexTo was below 0.
	 */
	public static boolean[] move(boolean[] array, int indexFrom, int indexTo) {
		/*if (indexFrom < 0 || indexFrom >= array.length || indexTo < 0) {
			return array;
		}
		boolean entry = array[indexFrom];
		array = delete(array, indexFrom);
		array = add(array, entry, indexTo);
		return array;*/
		Boolean[] objArray = ArrayUtils.toObject(array);
		Boolean[] newArray = move(objArray, indexFrom, indexTo);
		return ArrayUtils.toPrimitive(newArray);
	}

	/**
	 * Moves a array-entry from a specified index to an other.
	 * 
	 * @param array
	 *            The array which holds the entry
	 * @param indexFrom
	 *            The index of the entry which will be moved
	 * @param indexTo
	 *            The index which the entry will be moved to
	 * @return The array with the moved entry, or the original array if
	 *         indexFrom was not an valid index or indexTo was below 0.
	 */
	public static char[] move(char[] array, int indexFrom, int indexTo) {
		/*if (indexFrom < 0 || indexFrom >= array.length || indexTo < 0) {
			return array;
		}
		char entry = array[indexFrom];
		array = delete(array, indexFrom);
		array = add(array, entry, indexTo);
		return array;*/
		Character[] objArray = ArrayUtils.toObject(array);
		Character[] newArray = move(objArray, indexFrom, indexTo);
		return ArrayUtils.toPrimitive(newArray);
		
	}

	/**
	 * Moves a array-entry from a specified index to an other.
	 * 
	 * @param array
	 *            The array which holds the entry
	 * @param indexFrom
	 *            The index of the entry which will be moved
	 * @param indexTo
	 *            The index which the entry will be moved to
	 * @return The array with the moved entry, or the original array if
	 *         indexFrom was not an valid index or indexTo was below 0.
	 */
	public static byte[] move(byte[] array, int indexFrom, int indexTo) {
		/*if (indexFrom < 0 || indexFrom >= array.length || indexTo < 0) {
			return array;
		}
		byte entry = array[indexFrom];
		array = delete(array, indexFrom);
		array = add(array, entry, indexTo);
		return array;*/
		Byte[] objArray = ArrayUtils.toObject(array);
		Byte[] newArray = move(objArray, indexFrom, indexTo);
		return ArrayUtils.toPrimitive(newArray);
	}

	/**
	 * Moves a array-entry from a specified index to an other.
	 * 
	 * @param array
	 *            The array which holds the entry
	 * @param indexFrom
	 *            The index of the entry which will be moved
	 * @param indexTo
	 *            The index which the entry will be moved to
	 * @return The array with the moved entry, or the original array if
	 *         indexFrom was not an valid index or indexTo was below 0.
	 */
	public static short[] move(short[] array, int indexFrom, int indexTo) {
		/*if (indexFrom < 0 || indexFrom >= array.length || indexTo < 0) {
			return array;
		}
		short entry = array[indexFrom];
		array = delete(array, indexFrom);
		array = add(array, entry, indexTo);
		return array;*/
		Short[] objArray = ArrayUtils.toObject(array);
		Short[] newArray = move(objArray, indexFrom, indexTo);
		return ArrayUtils.toPrimitive(newArray);
	}

	/**
	 * Moves a array-entry from a specified index to an other.
	 * 
	 * @param array
	 *            The array which holds the entry
	 * @param indexFrom
	 *            The index of the entry which will be moved
	 * @param indexTo
	 *            The index which the entry will be moved to
	 * @return The array with the moved entry, or the original array if
	 *         indexFrom was not an valid index or indexTo was below 0.
	 */
	public static int[] move(int[] array, int indexFrom, int indexTo) {
		/*if (indexFrom < 0 || indexFrom >= array.length || indexTo < 0) {
			return array;
		}
		int entry = array[indexFrom];
		array = delete(array, indexFrom);
		array = addEntry(array, entry, indexTo);
		return array;*/
		Integer[] objArray = ArrayUtils.toObject(array);
		Integer[] newArray = move(objArray, indexFrom, indexTo);
		return ArrayUtils.toPrimitive(newArray);
	}

	/**
	 * Moves a array-entry from a specified index to an other.
	 * 
	 * @param array
	 *            The array which holds the entry
	 * @param indexFrom
	 *            The index of the entry which will be moved
	 * @param indexTo
	 *            The index which the entry will be moved to
	 * @return The array with the moved entry, or the original array if
	 *         indexFrom was not an valid index or indexTo was below 0.
	 */
	public static long[] move(long[] array, int indexFrom, int indexTo) {
		/*if (indexFrom < 0 || indexFrom >= array.length || indexTo < 0) {
			return array;
		}
		long entry = array[indexFrom];
		array = delete(array, indexFrom);
		array = addEntry(array, entry, indexTo);
		return array;*/
		Long[] objArray = ArrayUtils.toObject(array);
		Long[] newArray = move(objArray, indexFrom, indexTo);
		return ArrayUtils.toPrimitive(newArray);
	}

	/**
	 * Moves a array-entry from a specified index to an other.
	 * 
	 * @param array
	 *            The array which holds the entry
	 * @param indexFrom
	 *            The index of the entry which will be moved
	 * @param indexTo
	 *            The index which the entry will be moved to
	 * @return The array with the moved entry, or the original array if
	 *         indexFrom was not an valid index or indexTo was below 0.
	 */
	public static float[] move(float[] array, int indexFrom, int indexTo) {
		/*if (indexFrom < 0 || indexFrom >= array.length || indexTo < 0) {
			return array;
		}
		float entry = array[indexFrom];
		array = delete(array, indexFrom);
		array = addEntry(array, entry, indexTo);
		return array;*/
		Float[] objArray = ArrayUtils.toObject(array);
		Float[] newArray = move(objArray, indexFrom, indexTo);
		return ArrayUtils.toPrimitive(newArray);
	}

	/**
	 * Moves a array-entry from a specified index to an other.
	 * 
	 * @param array
	 *            The array which holds the entry
	 * @param indexFrom
	 *            The index of the entry which will be moved
	 * @param indexTo
	 *            The index which the entry will be moved to
	 * @return The array with the moved entry, or the original array if
	 *         indexFrom was not an valid index or indexTo was below 0.
	 */
	public static double[] move(double[] array, int indexFrom, int indexTo) {
		/*if (indexFrom < 0 || indexFrom >= array.length || indexTo < 0) {
			return array;
		}
		double entry = array[indexFrom];
		array = delete(array, indexFrom);
		array = addEntry(array, entry, indexTo);
		return array;*/
		Double[] objArray = ArrayUtils.toObject(array);
		Double[] newArray = move(objArray, indexFrom, indexTo);
		return ArrayUtils.toPrimitive(newArray);
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static <T> String toString(T[] array) {
		return new ArrayList<>(Arrays.asList(array)).toString();
	}

	public static String toString(boolean[] array) {
		return toString(ArrayUtils.toObject(array));
	}

	public static String toString(char[] array) {
		return toString(ArrayUtils.toObject(array));
	}

	public static String toString(byte[] array) {
		return toString(ArrayUtils.toObject(array));
	}

	public static String toString(short[] array) {
		return toString(ArrayUtils.toObject(array));
	}

	public static String toString(int[] array) {
		return toString(ArrayUtils.toObject(array));
	}

	public static String toString(long[] array) {
		return toString(ArrayUtils.toObject(array));
	}

	public static String toString(float[] array) {
		return toString(ArrayUtils.toObject(array));
	}

	public static String toString(double[] array) {
		return toString(ArrayUtils.toObject(array));
	}

}
