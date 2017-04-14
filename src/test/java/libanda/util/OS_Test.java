package libanda.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

/**
 * This class contains all JUnit-4.x test cases for {@link libanda.util.OS}
 * 
 * @author Andanan
 * @lastModified 2017-04-14
 * @version 1.0
 * @see libanda.util.OS
 */
public class OS_Test {
	private Properties systemProperties;
	private List<String> systemPropertyKeys;
	private List<String> systemPropertyValues;
	private static final int TEST_RUN_QUANTITY = 5;

	@Before
	public void setupTest() {
		this.systemProperties = System.getProperties();
		String[] systemPropertyValues = this.systemProperties.values().toArray(new String[0]);
		this.systemPropertyValues = Arrays.asList(systemPropertyValues);
		List<String> systemPropertyKeys = new ArrayList<>();
		Collections.list(this.systemProperties.keys()).forEach(obj -> {
			systemPropertyKeys.add(obj.toString());
		});
		this.systemPropertyKeys = systemPropertyKeys;
	}

	@Test
	public void LFTest() {
		assertEquals("\r", OS.LF_MAC);
		assertEquals("\n", OS.LF_UNIX);
		assertEquals("\r\n", OS.LF_WIN);
	}

	@Test
	public void StaticKeysTest() {
		assertEquals("java.io.tmpdir", OS.TMP_DIR_KEY);
		assertEquals("user.dir", OS.WORKING_DIR_KEY);
		assertEquals("sun.java.command", OS.LAUNCH_COMMAND_KEY);
	}

	@Test
	public void GetSystemPropertyKeysTest() {
		List<String> propertyKeys = OS.getSystemPropertyKeys();
		assertTrue(this.systemPropertyKeys.equals(propertyKeys));
	}

	@Test
	public void GetSystemPropertiesTest() {
		List<String> propertyValues = OS.getSystemProperties();
		assertTrue(this.systemPropertyValues.equals(propertyValues));
	}

	@Test
	public void GetSystemPropertyByIndexTest() {
		Random rnd = new Random();
		int propertyCount = this.systemPropertyValues.size();
		for (int i = 0; i < OS_Test.TEST_RUN_QUANTITY; i++) {
			int index = rnd.nextInt(propertyCount);
			String propertyValueResult = OS.getSystemPropertyByIndex(index);
			String propertyValue = this.systemPropertyValues.get(index);
			assertEquals(propertyValue, propertyValueResult);
		}
	}

	@Test
	public void GetSystemPropertyKeyByIndexTest() {
		Random rnd = new Random();
		int propertyCount = this.systemPropertyValues.size();
		for (int i = 0; i < OS_Test.TEST_RUN_QUANTITY; i++) {
			int index = rnd.nextInt(propertyCount);
			String propertyKey = this.systemPropertyKeys.get(index);
			String propertyKeyResult = OS.getSystemPropertyKeyByIndex(index);
			assertEquals(propertyKey, propertyKeyResult);
		}
	}

	@Test
	public void IndexOfSystemPropertyKeyTest() {
		Random rnd = new Random();
		int propertyCount = this.systemPropertyValues.size();
		for (int i = 0; i < OS_Test.TEST_RUN_QUANTITY; i++) {
			int index = rnd.nextInt(propertyCount);
			String propertyKey = this.systemPropertyKeys.get(index);
			assertEquals(index, OS.indexOfSystemPropertyKey(propertyKey));
		}
	}

	@Test
	public void GetTempDirTest() {
		File tmpDir = new File(System.getProperty("java.io.tmpdir"));
		File osTmpDir = OS.getTempDir();
		assertEquals(tmpDir, osTmpDir);
		assertNotEquals(new File(""), osTmpDir);
	}

	@Test
	public void GetWorkingDirTest() {
		File workingDir = new File(System.getProperty("user.dir"));
		File osWorkingDir = OS.getWorkingDir();
		assertEquals(workingDir, osWorkingDir);
		assertNotEquals(new File(""), osWorkingDir);
	}

	@Test
	public void GetLaunchCommandTest() {
		String launchCommand = System.getProperty("sun.java.command");
		assertEquals(launchCommand, OS.getLaunchCommand());
	}

}
