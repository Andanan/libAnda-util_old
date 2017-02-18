package libanda.util;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class OS_Test extends TestCase {
	
	public OS_Test (String testName) {
		super(testName);
	}
	
	public static Test suite(){
		return new TestSuite(OS_Test.class);
	}
	
	public void testOS_Test() {
		System.out.println("Hello jUnit!");
		assertTrue(true);
	}
	
	public void someTest(){
		assertTrue(false);
	}
}
