package libanda.util;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

/**
 * This class contains all JUnit-4.x test cases for {@link libanda.util.ArrayUtil}
 * 
 * @author Andanan
 * @lastModified 2017-02-26
 * @version 1.1
 * @see libanda.util.ArrayUtil
 */
public class ArrayUtilTest {

	@Test
	public void testInsert() {
		final Integer[] finBefore = { 3, 14 };
		Integer[] before = finBefore.clone();

		Integer[] expectedInsertFirst = { 42, 3, 14 };
		Integer[] insertFirst = ArrayUtil.insert(before, 42, 0);
		assertTrue(Arrays.equals(expectedInsertFirst, insertFirst));

		// test if original array remains unchanged
		assertTrue(Arrays.equals(before, finBefore));

		Integer[] expectedInsertCenter = { 3, 42, 14 };
		Integer[] insertedCenter = ArrayUtil.insert(before, 42, 1);
		assertTrue(Arrays.equals(expectedInsertCenter, insertedCenter));

		Integer[] expectedInsertLast = { 3, 14, 42 };
		Integer[] insertedLast = ArrayUtil.insert(before, 42, before.length);
		assertTrue(Arrays.equals(expectedInsertLast, insertedLast));

		// if tried to insert null, receive CLONE of original array
		Integer[] insertedNull = ArrayUtil.insert(before, null, before.length);
		assertTrue(Arrays.equals(before, insertedNull));
		assertTrue(before != insertedNull);

		// if tried to insert into null array, receive null
		Integer[] nullArray = null;
		Integer[] expectedNullInsert = null;
		Integer[] nullInsert = ArrayUtil.insert(nullArray, 42, 0);
		assertTrue(Arrays.equals(expectedNullInsert, nullInsert));

		// if tried to insert null into null array, receive null
		Integer[] nullArray2 = null;
		Integer[] expectedNullInsert2 = null;
		Integer[] nullInsert2 = ArrayUtil.insert(nullArray2, null, 0);
		assertTrue(Arrays.equals(expectedNullInsert2, nullInsert2));

		// if insert into empty array
		Integer[] emptyArray = {};
		Integer[] expectedEmptyInsert = {42};
		Integer[] emptyInsert = ArrayUtil.insert(emptyArray, 42, 0);
		assertTrue(Arrays.equals(expectedEmptyInsert, emptyInsert));
	}

	@Test
	public void testPrepend() {
		final Integer[] finOriginal = { 3, 14 };
		Integer[] original = finOriginal.clone();
		Integer[] nullArray = null;
		Integer[] emptyArray = {};
		
		Integer[] expectedPrepend = { 42, 3, 14 };
		Integer[] prepended = ArrayUtil.prepend(original, 42);
		assertTrue(Arrays.equals(expectedPrepend, prepended));

		// test if original array remains unchanged
		assertTrue(Arrays.equals(original, finOriginal));
		
		// if tried to prepend null, receive CLONE of original array
		Integer[] expectedNullEntryPrepend = null;
		Integer[] nullEntryPrepend = ArrayUtil.prepend(nullArray, null);
		assertTrue(Arrays.equals(expectedNullEntryPrepend, nullEntryPrepend));
		assertTrue(nullEntryPrepend != finOriginal);

		// if tried to prepend to null array, receive null
		Integer[] expectedNullPrepend = null;
		Integer[] nullPrepend = ArrayUtil.prepend(nullArray, 42);
		assertTrue(Arrays.equals(expectedNullPrepend, nullPrepend));

		// if tried to prepend null to null array, receive null
		Integer[] expectedNullPrepend2 = null;
		Integer[] nullPrepend2 = ArrayUtil.prepend(nullArray, null);
		assertTrue(Arrays.equals(expectedNullPrepend2, nullPrepend2));

		// if tried to prepend to empty array, add first entry
		Integer[] expectedEmptyPrepend = { 42 };
		Integer[] emptyPrepend = ArrayUtil.prepend(emptyArray, 42);
		assertTrue(Arrays.equals(expectedEmptyPrepend, emptyPrepend));
	}
}
