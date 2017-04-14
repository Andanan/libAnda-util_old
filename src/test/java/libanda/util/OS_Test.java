package libanda.util;

import static org.junit.Assert.*;

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
 * @lastModified 2017-02-26
 * @version 1.0
 * @see libanda.util.OS
 */
public class OS_Test {
	private String osName;
	private Properties systemProperties;
	private List<String> systemPropertyKeys;
	private List<String> systemPropertyValues;
	
	@Before
	public void setupTest() {
		this.osName = System.getProperty("os.name");
		this.systemProperties = System.getProperties();
		String[] systemPropertyValues = this.systemProperties.values().toArray(new String[0]);
		this.systemPropertyValues = Arrays.asList(systemPropertyValues);
		List<Object> systemPropertyKeysObjects = Collections.list(this.systemProperties.keys());
		List<String> systemPropertyKeys = new ArrayList<>();
		systemPropertyKeysObjects.forEach(obj -> {
			systemPropertyKeys.add((String) obj);
		});
		this.systemPropertyKeys = systemPropertyKeys;
		System.out.println("\n\nAll Properties:");
		System.out.println(System.getProperties().toString().replace("\r", "\\r").replace("\n", "\\n").replace(",", "\n"));
		System.out.println();
	}
	
	@Test
	public void testStaticKeys(){
		assertEquals(System.getProperty("path.separator"), OS.PATH_SEPARATOR);
		assertEquals(System.getProperty("file.separator"), OS.FILE_SEPARATOR);
		assertEquals(System.getProperty("line.separator"), OS.LINE_SEPARATOR);
		assertEquals(System.getProperty("line.separator"), OS.LF);
		assertEquals(System.getProperty("java.io.tmpdir"), OS.TMP_DIR);
		assertEquals(System.getProperty("user.dir"), OS.WORKING_DIR);
		assertEquals(System.getProperty("user.home"), OS.USER_HOME);
		assertEquals(System.getProperty("java.home"), OS.JAVA_HOME);
		assertEquals(System.getProperty("java.library.path"), OS.LIBRARIES);
		assertEquals(System.getProperty("java.class.path"), OS.CLASSPATH);
		assertEquals(System.getProperty("user.name"), OS.USER_NAME);
		assertEquals(System.getProperty("user.country"), OS.COUNTRY);
		assertEquals(System.getProperty("user.language"), OS.LANGUAGE);
		assertEquals(System.getProperty("os.name"), OS.OS_NAME);
		assertEquals(System.getProperty("os.arch"), OS.OS_ARCH);
		assertEquals(System.getProperty("os.version"), OS.OS_VERSION);
		assertEquals(System.getProperty("java.specification.version"), OS.JAVA_VERSION);
		assertEquals(System.getProperty("sun.java.command"), OS.LAUNCH_COMMAND);
	}
	
	@Test
	public void testGetPropertyKeys() {
		List<String> propertyKeys = OS.getPropertyKeys();
		assertTrue(this.systemPropertyKeys.equals(propertyKeys));
	}
	
	@Test
	public void testGetPropertyValues() {
		List<String> propertyValues = OS.getProperties();
		assertTrue(this.systemPropertyValues.equals(propertyValues));
	}
	
	@Test
	public void testGetPropertyByIndex() {
		final int runs = 5;
		Random rnd = new Random();
		int propertyCount = this.systemPropertyValues.size();
		for (int i = 0; i < runs; i++) {
			int index = rnd.nextInt(propertyCount);
			String propertyValueResult = OS.getPropertyByIndex(index);
			String propertyValue = this.systemPropertyValues.get(index);
			assertEquals(propertyValue, propertyValueResult);
		}
	}
	
	@Test
	public void testGetPropertyKeyByIndex() {
		final int runs = 5;
		Random rnd = new Random();
		int propertyCount = this.systemPropertyValues.size();
		for (int i = 0; i < runs; i++) {
			int index = rnd.nextInt(propertyCount);
			String propertyKey = this.systemPropertyKeys.get(index);
			String propertyKeyResult = OS.getPropertyKeyByIndex(index);
			assertEquals(propertyKey, propertyKeyResult);
		}
	}
	
	@Test
	public void testIsWindows(){
		boolean isWindowsResult = OS.isWindows();
		boolean isWindows = osName.contains("win");
		assertEquals(isWindows, isWindowsResult);
	}
	
	@Test
	public void testIsMac(){
		boolean isMacResult = OS.isMac();
		boolean isMac = osName.contains("mac");
		assertEquals(isMac, isMacResult);
	}
	
	@Test
	public void testIsUnix(){
		boolean isUnixResult = OS.isUnix();
		boolean isUnix = osName.contains("nix") || osName.contains("nux") || osName.contains("aix");
		assertEquals(isUnix, isUnixResult);
	}
	
	@Test
	public void testIsSolaris(){
		boolean isUnixResult = OS.isUnix();
		boolean isUnix = osName.contains("sunos");
		assertEquals(isUnix, isUnixResult);
	}
	
	@Test
	public void testIsKnown(){
		boolean isKnownResult = OS.isUnix();
		boolean isKnown = osName.contains("win") || osName.contains("mac") || osName.contains("nix") || osName.contains("nux") || osName.contains("aix") || osName.contains("sunos");
		assertEquals(isKnown, isKnownResult);
	}
}
