package libanda.util;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayUtilTest {
	
	@Test
	public void testGenericEquals() {
		String[] original =  {"Lorem","ipsum","dolor"};
		String[] clone =     {"Lorem","ipsum","dolor"};
		String[] different = {"Lorem", "ipsum","different"};
		String[] _short =    {"Lorem", "ipsum"};
		String[] _null = null;
		String[] _nullValue = {null};

		boolean sameEquals = ArrayUtil.equals(original, original);
		boolean cloneEquals = ArrayUtil.equals(original, clone);
		boolean differentEquals = ArrayUtil.equals(original, different);
		boolean shortEquals = ArrayUtil.equals(original, _short);
		boolean nullEquals = ArrayUtil.equals(original, _null);
		boolean nullValueEquals = ArrayUtil.equals(original, _nullValue);
		
		assertTrue(sameEquals);
		assertTrue(cloneEquals);
		
		assertFalse(differentEquals);
		assertFalse(shortEquals);
		assertFalse(nullEquals);
		assertFalse(nullValueEquals);
		
	}
	
	@Test
	public void testIntEquals() {
		int[] original =  {3,14,15};
		int[] clone =     {3,14,15};
		int[] different = {3,42,55};
		int[] _short =    {3,14};
		int[] _null = null;

		boolean sameEquals = ArrayUtil.equals(original, original);
		boolean cloneEquals = ArrayUtil.equals(original, clone);
		boolean differentEquals = ArrayUtil.equals(original, different);
		boolean shortEquals = ArrayUtil.equals(original, _short);
		boolean nullEquals = ArrayUtil.equals(original, _null);
		
		assertTrue(sameEquals);
		assertTrue(cloneEquals);
		
		assertFalse(differentEquals);
		assertFalse(shortEquals);
		assertFalse(nullEquals);
		
	}
	
	@Test
	public void testIntDelete() {
		int[] original =  {3,14,15};
		int[] _short =    {14,15};
		
		assertArrayEquals(_short, ArrayUtil.delete(original, 0));
		
	}
}
