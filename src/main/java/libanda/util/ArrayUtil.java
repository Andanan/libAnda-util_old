package libanda.util;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

/* Methods:
 * 		insert(array, entry, index)
 * 		prepend(array, entry)
 */

/**
 * The ArrayUtil-class provides helpful methods, which are useful when working
 * with arrays.<br />
 * This class is meant to be an extension to
 * {@link org.apache.commons.lang3.ArrayUtils}
 * 
 * @author Andanan
 * @lastModified 2017-02-26
 * @version 1.1
 * @see org.apache.commons.lang3.ArrayUtils
 */
public class ArrayUtil {

	/*
	 * For: Object, boolean, char, String, byte, short, int, long, float and
	 * double insert "entry" in "array" on "indexPos"
	 * 
	 */

	/**
	 * Insert an entry to the given array at the given index. The type of the
	 * entry and array can be an arbitrary object type.<br />
	 * Copies the content of "inputArray" to a new array with a length of
	 * "inputArray.length+1" and inserts "entry" at index "indexPos". If the
	 * "inputArray" is null, null is returned. If the "inputArray" is specified
	 * but the "entry" is null, a clone of "inputArray" is returned.<br />
	 * If "indexPos" is < 0 or is >= "inputArray.length" the "indexPos" is set
	 * to either 0 or "inputArray.length"<br />
	 * 
	 * @param inputArray
	 *            The array which will be extended
	 * @param entry
	 *            The entry which will be added
	 * @param indexPos
	 *            The position at which the entry will be added
	 * @return A new array with the content of "inputArray" and "entry" inserted
	 *         to it at index "indexPos", null if "inputArray" was null or a
	 *         clone of "inputArray" if "entry" was null.
	 */
	public static <T> T[] insert(final T[] inputArray, final T entry, int indexPos) {
		List<T> list;
		T[] result;
		if (inputArray == null) {
			result = null;
		} else if (entry == null) {
			return inputArray.clone();
		} else {
			list = new LinkedList<>(Arrays.asList(inputArray));
			if (indexPos < 0) {
				indexPos = 0;
			} else if (indexPos >= inputArray.length) {
				indexPos = inputArray.length;
			}
			list.add(indexPos, entry);
			result = list.toArray(inputArray);
		}
		return result;
	}

	/**
	 * Insert a boolean entry to the given boolean array at the given
	 * index.<br />
	 * Copies the content of "inputArray" to a new array with a length of
	 * "inputArray.length+1" and inserts "entry" at index "indexPos". If the
	 * "inputArray" is null, null is returned. If the "inputArray" is specified
	 * but the "entry" is null, a clone of "inputArray" is returned.<br />
	 * If "indexPos" is < 0 or is >= "inputArray.length" the "indexPos" is set
	 * to either 0 or "inputArray.length"<br />
	 * 
	 * @param inputArray
	 *            The array which will be extended
	 * @param entry
	 *            The entry which will be added
	 * @param indexPos
	 *            The position at which the entry will be added
	 * @return A new array with the content of "inputArray" and "entry" inserted
	 *         to it at index "indexPos", null if "inputArray" was null or a
	 *         clone of "inputArray" if "entry" was null.
	 */
	public static boolean[] insert(boolean[] inputArray, boolean entry, int indexPos) {
		Boolean[] objArray = ArrayUtils.toObject(inputArray);
		Boolean[] newArray = insert(objArray, entry, indexPos);
		return ArrayUtils.toPrimitive(newArray);
	}

	/**
	 * Insert a char entry to the given char array at the given index.<br />
	 * Copies the content of "inputArray" to a new array with a length of
	 * "inputArray.length+1" and inserts "entry" at index "indexPos". If the
	 * "inputArray" is null, null is returned. If the "inputArray" is specified
	 * but the "entry" is null, a clone of "inputArray" is returned.<br />
	 * If "indexPos" is < 0 or is >= "inputArray.length" the "indexPos" is set
	 * to either 0 or "inputArray.length"<br />
	 * 
	 * @param inputArray
	 *            The array which will be extended
	 * @param entry
	 *            The entry which will be added
	 * @param indexPos
	 *            The position at which the entry will be added
	 * @return A new array with the content of "inputArray" and "entry" inserted
	 *         to it at index "indexPos", null if "inputArray" was null or a
	 *         clone of "inputArray" if "entry" was null.
	 */
	public static char[] insert(char[] inputArray, char entry, int indexPos) {
		Character[] objArray = ArrayUtils.toObject(inputArray);
		Character[] newArray = insert(objArray, entry, indexPos);
		return ArrayUtils.toPrimitive(newArray);
	}

	/**
	 * Insert a byte entry to the given byte array at the given index.<br />
	 * Copies the content of "inputArray" to a new array with a length of
	 * "inputArray.length+1" and inserts "entry" at index "indexPos". If the
	 * "inputArray" is null, null is returned. If the "inputArray" is specified
	 * but the "entry" is null, a clone of "inputArray" is returned.<br />
	 * If "indexPos" is < 0 or is >= "inputArray.length" the "indexPos" is set
	 * to either 0 or "inputArray.length"<br />
	 * 
	 * @param inputArray
	 *            The array which will be extended
	 * @param entry
	 *            The entry which will be added
	 * @param indexPos
	 *            The position at which the entry will be added
	 * @return A new array with the content of "inputArray" and "entry" inserted
	 *         to it at index "indexPos", null if "inputArray" was null or a
	 *         clone of "inputArray" if "entry" was null.
	 */
	public static byte[] insert(byte[] inputArray, byte entry, int indexPos) {
		Byte[] objArray = ArrayUtils.toObject(inputArray);
		Byte[] newArray = insert(objArray, entry, indexPos);
		return ArrayUtils.toPrimitive(newArray);
	}

	/**
	 * Insert a short entry to the given short array at the given index.<br />
	 * Copies the content of "inputArray" to a new array with a length of
	 * "inputArray.length+1" and inserts "entry" at index "indexPos". If the
	 * "inputArray" is null, null is returned. If the "inputArray" is specified
	 * but the "entry" is null, a clone of "inputArray" is returned.<br />
	 * If "indexPos" is < 0 or is >= "inputArray.length" the "indexPos" is set
	 * to either 0 or "inputArray.length"<br />
	 * 
	 * @param inputArray
	 *            The array which will be extended
	 * @param entry
	 *            The entry which will be added
	 * @param indexPos
	 *            The position at which the entry will be added
	 * @return A new array with the content of "inputArray" and "entry" inserted
	 *         to it at index "indexPos", null if "inputArray" was null or a
	 *         clone of "inputArray" if "entry" was null.
	 */
	public static short[] insert(short[] inputArray, short entry, int indexPos) {
		Short[] objArray = ArrayUtils.toObject(inputArray);
		Short[] newArray = insert(objArray, entry, indexPos);
		return ArrayUtils.toPrimitive(newArray);
	}

	/**
	 * Insert a int entry to the given int array at the given index.<br />
	 * Copies the content of "inputArray" to a new array with a length of
	 * "inputArray.length+1" and inserts "entry" at index "indexPos". If the
	 * "inputArray" is null, null is returned. If the "inputArray" is specified
	 * but the "entry" is null, a clone of "inputArray" is returned.<br />
	 * If "indexPos" is < 0 or is >= "inputArray.length" the "indexPos" is set
	 * to either 0 or "inputArray.length"<br />
	 * 
	 * @param inputArray
	 *            The array which will be extended
	 * @param entry
	 *            The entry which will be added
	 * @param indexPos
	 *            The position at which the entry will be added
	 * @return A new array with the content of "inputArray" and "entry" inserted
	 *         to it at index "indexPos", null if "inputArray" was null or a
	 *         clone of "inputArray" if "entry" was null.
	 */
	public static int[] insert(int[] inputArray, int entry, int indexPos) {
		Integer[] objArray = ArrayUtils.toObject(inputArray);
		Integer[] newArray = insert(objArray, entry, indexPos);
		return ArrayUtils.toPrimitive(newArray);
	}

	/**
	 * Insert a long entry to the given long array at the given index.<br />
	 * Copies the content of "inputArray" to a new array with a length of
	 * "inputArray.length+1" and inserts "entry" at index "indexPos". If the
	 * "inputArray" is null, null is returned. If the "inputArray" is specified
	 * but the "entry" is null, a clone of "inputArray" is returned.<br />
	 * If "indexPos" is < 0 or is >= "inputArray.length" the "indexPos" is set
	 * to either 0 or "inputArray.length"<br />
	 * 
	 * @param inputArray
	 *            The array which will be extended
	 * @param entry
	 *            The entry which will be added
	 * @param indexPos
	 *            The position at which the entry will be added
	 * @return A new array with the content of "inputArray" and "entry" inserted
	 *         to it at index "indexPos", null if "inputArray" was null or a
	 *         clone of "inputArray" if "entry" was null.
	 */
	public static long[] insert(long[] inputArray, long entry, int indexPos) {
		Long[] objArray = ArrayUtils.toObject(inputArray);
		Long[] newArray = insert(objArray, entry, indexPos);
		return ArrayUtils.toPrimitive(newArray);
	}

	/**
	 * Insert a float entry to the given float array at the given index.<br />
	 * Copies the content of "inputArray" to a new array with a length of
	 * "inputArray.length+1" and inserts "entry" at index "indexPos". If the
	 * "inputArray" is null, null is returned. If the "inputArray" is specified
	 * but the "entry" is null, a clone of "inputArray" is returned.<br />
	 * If "indexPos" is < 0 or is >= "inputArray.length" the "indexPos" is set
	 * to either 0 or "inputArray.length"<br />
	 * 
	 * @param inputArray
	 *            The array which will be extended
	 * @param entry
	 *            The entry which will be added
	 * @param indexPos
	 *            The position at which the entry will be added
	 * @return A new array with the content of "inputArray" and "entry" inserted
	 *         to it at index "indexPos", null if "inputArray" was null or a
	 *         clone of "inputArray" if "entry" was null.
	 */
	public static float[] insert(float[] inputArray, float entry, int indexPos) {
		Float[] objArray = ArrayUtils.toObject(inputArray);
		Float[] newArray = insert(objArray, entry, indexPos);
		return ArrayUtils.toPrimitive(newArray);
	}

	/**
	 * Insert a double entry to the given double array at the given index.<br />
	 * Copies the content of "inputArray" to a new array with a length of
	 * "inputArray.length+1" and inserts "entry" at index "indexPos". If the
	 * "inputArray" is null, null is returned. If the "inputArray" is specified
	 * but the "entry" is null, a clone of "inputArray" is returned.<br />
	 * If "indexPos" is < 0 or is >= "inputArray.length" the "indexPos" is set
	 * to either 0 or "inputArray.length"<br />
	 * 
	 * @param inputArray
	 *            The array which will be extended
	 * @param entry
	 *            The entry which will be added
	 * @param indexPos
	 *            The position at which the entry will be added
	 * @return A new array with the content of "inputArray" and "entry" inserted
	 *         to it at index "indexPos", null if "inputArray" was null or a
	 *         clone of "inputArray" if "entry" was null.
	 */
	public static double[] insert(double[] inputArray, double entry, int indexPos) {
		Double[] objArray = ArrayUtils.toObject(inputArray);
		Double[] newArray = insert(objArray, entry, indexPos);
		return ArrayUtils.toPrimitive(newArray);
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	/*
	 * For: Object, boolean, char, String, byte, short, int, long, float and
	 * double prepend "entry" to "array"
	 * 
	 */

	/**
	 * Prepends an entry to the given array. The type of the entry and array can
	 * be an arbitrary object type.<br />
	 * Copies the content of "inputArray" to a new array with a length of
	 * "inputArray.length+1" but prepends the entry "entry". If the "inputArray"
	 * is null, null is returned. If the "inputArray" is specified but "entry"
	 * is null, a clone of "inputArray" is returned.<br />
	 * <br />
	 * This internally calls ArrayUtil.insert(inputArray, entry, 0);
	 * 
	 * @param inputArray
	 *            The array which will be extended
	 * @param entry
	 *            The entry which will be prepended
	 * @return A new array with the content of "inputArray" and "entry"
	 *         prepended to it, null if "inputArray" was null or a clone of
	 *         "inputArray" if "entry" was null.
	 * @see ArrayUtil#insert(T[], T, int)
	 */
	public static <T> T[] prepend(T[] inputArray, T entry) {
		return insert(inputArray, entry, 0);
	}

	/**
	 * Prepends a boolean entry to the given boolean array.<br />
	 * Copies the content of "inputArray" to a new array with a length of
	 * "inputArray.length+1" but prepends the entry "entry". If the "inputArray"
	 * is null, null is returned. If the "inputArray" is specified but "entry"
	 * is null, a clone of "inputArray" is returned.<br />
	 * <br />
	 * This internally calls ArrayUtil.insert(inputArray, entry, 0);
	 * 
	 * @param inputArray
	 *            The array which will be extended
	 * @param entry
	 *            The entry which will be prepended
	 * @return A new array with the content of "inputArray" and "entry"
	 *         prepended to it, null if "inputArray" was null or a clone of
	 *         "inputArray" if "entry" was null.
	 * @see ArrayUtil#insert(boolean[], boolean, int)
	 */
	public static boolean[] prepend(boolean[] inputArray, boolean entry) {
		return insert(inputArray, entry, 0);
	}

	/**
	 * Prepends a char entry to the given char array.<br />
	 * Copies the content of "inputArray" to a new array with a length of
	 * "inputArray.length+1" but prepends the entry "entry". If the "inputArray"
	 * is null, null is returned. If the "inputArray" is specified but "entry"
	 * is null, a clone of "inputArray" is returned.<br />
	 * <br />
	 * This internally calls ArrayUtil.insert(inputArray, entry, 0);
	 * 
	 * @param inputArray
	 *            The array which will be extended
	 * @param entry
	 *            The entry which will be prepended
	 * @return A new array with the content of "inputArray" and "entry"
	 *         prepended to it, null if "inputArray" was null or a clone of
	 *         "inputArray" if "entry" was null.
	 * @see ArrayUtil#insert(char[], char, int)
	 */
	public static char[] prepend(char[] inputArray, char entry) {
		return insert(inputArray, entry, 0);
	}

	/**
	 * Prepends a byte entry to the given byte array.<br />
	 * Copies the content of "inputArray" to a new array with a length of
	 * "inputArray.length+1" but prepends the entry "entry". If the "inputArray"
	 * is null, null is returned. If the "inputArray" is specified but "entry"
	 * is null, a clone of "inputArray" is returned.<br />
	 * <br />
	 * This internally calls ArrayUtil.insert(inputArray, entry, 0);
	 * 
	 * @param inputArray
	 *            The array which will be extended
	 * @param entry
	 *            The entry which will be prepended
	 * @return A new array with the content of "inputArray" and "entry"
	 *         prepended to it, null if "inputArray" was null or a clone of
	 *         "inputArray" if "entry" was null.
	 * @see ArrayUtil#insert(byte[], byte, int)
	 */
	public static byte[] prepend(byte[] inputArray, byte entry) {
		return insert(inputArray, entry, 0);
	}

	/**
	 * Prepends a short entry to the given short array.<br />
	 * Copies the content of "inputArray" to a new array with a length of
	 * "inputArray.length+1" but prepends the entry "entry". If the "inputArray"
	 * is null, null is returned. If the "inputArray" is specified but "entry"
	 * is null, a clone of "inputArray" is returned.<br />
	 * <br />
	 * This internally calls ArrayUtil.insert(inputArray, entry, 0);
	 * 
	 * @param inputArray
	 *            The array which will be extended
	 * @param entry
	 *            The entry which will be prepended
	 * @return A new array with the content of "inputArray" and "entry"
	 *         prepended to it, null if "inputArray" was null or a clone of
	 *         "inputArray" if "entry" was null.
	 * @see ArrayUtil#insert(short[], short, int)
	 */
	public static short[] prepend(short[] inputArray, short entry) {
		return insert(inputArray, entry, 0);
	}

	/**
	 * Prepends an int entry to the given int array.<br />
	 * Copies the content of "inputArray" to a new array with a length of
	 * "inputArray.length+1" but prepends the entry "entry". If the "inputArray"
	 * is null, null is returned. If the "inputArray" is specified but "entry"
	 * is null, a clone of "inputArray" is returned.<br />
	 * <br />
	 * This internally calls ArrayUtil.insert(inputArray, entry, 0);
	 * 
	 * @param inputArray
	 *            The array which will be extended
	 * @param entry
	 *            The entry which will be prepended
	 * @return A new array with the content of "inputArray" and "entry"
	 *         prepended to it, null if "inputArray" was null or a clone of
	 *         "inputArray" if "entry" was null.
	 * @see ArrayUtil#insert(int[], int, int)
	 */
	public static int[] prepend(int[] inputArray, int entry) {
		return insert(inputArray, entry, 0);
	}

	/**
	 * Prepends a long entry to the given long array.<br />
	 * Copies the content of "inputArray" to a new array with a length of
	 * "inputArray.length+1" but prepends the entry "entry". If the "inputArray"
	 * is null, null is returned. If the "inputArray" is specified but "entry"
	 * is null, a clone of "inputArray" is returned.<br />
	 * <br />
	 * This internally calls ArrayUtil.insert(inputArray, entry, 0);
	 * 
	 * @param inputArray
	 *            The array which will be extended
	 * @param entry
	 *            The entry which will be prepended
	 * @return A new array with the content of "inputArray" and "entry"
	 *         prepended to it, null if "inputArray" was null or a clone of
	 *         "inputArray" if "entry" was null.
	 * @see ArrayUtil#insert(long[], long, int)
	 */
	public static long[] prepend(long[] inputArray, long entry) {
		return insert(inputArray, entry, 0);
	}

	/**
	 * Prepends a float entry to the given float array.<br />
	 * Copies the content of "inputArray" to a new array with a length of
	 * "inputArray.length+1" but prepends the entry "entry". If the "inputArray"
	 * is null, null is returned. If the "inputArray" is specified but "entry"
	 * is null, a clone of "inputArray" is returned.<br />
	 * <br />
	 * This internally calls ArrayUtil.insert(inputArray, entry, 0);
	 * 
	 * @param inputArray
	 *            The array which will be extended
	 * @param entry
	 *            The entry which will be prepended
	 * @return A new array with the content of "inputArray" and "entry"
	 *         prepended to it, null if "inputArray" was null or a clone of
	 *         "inputArray" if "entry" was null.
	 * @see ArrayUtil#insert(float[], float, int)
	 */
	public static float[] prepend(float[] inputArray, float entry) {
		return insert(inputArray, entry, 0);
	}

	/**
	 * Prepends a double entry to the given double array.<br />
	 * Copies the content of "inputArray" to a new array with a length of
	 * "inputArray.length+1" but prepends the entry "entry". If the "inputArray"
	 * is null, null is returned. If the "inputArray" is specified but "entry"
	 * is null, a clone of "inputArray" is returned.<br />
	 * <br />
	 * This internally calls ArrayUtil.insert(inputArray, entry, 0);
	 * 
	 * @param inputArray
	 *            The array which will be extended
	 * @param entry
	 *            The entry which will be prepended
	 * @return A new array with the content of "inputArray" and "entry"
	 *         prepended to it, null if "inputArray" was null or a clone of
	 *         "inputArray" if "entry" was null.
	 * @see ArrayUtil#insert(double[], double, int)
	 */
	public static double[] prepend(double[] inputArray, double entry) {
		return insert(inputArray, entry, 0);
	}

}
