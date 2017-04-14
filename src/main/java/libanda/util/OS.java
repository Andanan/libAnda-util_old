package libanda.util;

import java.io.File;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/**
 * The OS class contains some static fields which are holding the value of the
 * similarly named system properties, along with some Methods for retrieving
 * system properties.
 * 
 * @author Andanan
 * @lastModified 2017-04-14
 * @version 2.0.0
 */
public abstract class OS {

	/**
	 * The system dependent line-feed/new-line char sequence for Windows<br />
	 * (A carriage return character followed by a new line character: "\r\n" )
	 */
	public static final String LF_WIN = "\r\n";
	/**
	 * The system dependent line-feed/new-line char for Mac (<=version 9)<br />
	 * For Mac OS X the newline character was changed to \n to satisfy the Unix
	 * standard<br />
	 * (A carriage return character: "\r" )
	 */
	public static final String LF_MAC = "\r";
	/**
	 * The system dependent line-feed/new-line char for Unix/Linux/Mac OS
	 * X<br />
	 * (A new line character: "\n" )
	 */
	public static final String LF_UNIX = "\n";
	/**
	 * The system-property-key of the path to the temporary directory<br />
	 */
	public static final String TMP_DIR_KEY = "java.io.tmpdir";
	/**
	 * The system-property-key of the current working directory<br />
	 */
	public static final String WORKING_DIR_KEY = "user.dir";
	/**
	 * The system-property-key of the launch command<br />
	 */
	public static final String LAUNCH_COMMAND_KEY = "sun.java.command";

	/**
	 * Retrieves a {@link java.util.List java.util.List&lt;String&gt;} of all
	 * system property keys.<br />
	 * For a list of the corresponding values call {@link #getProperties()}
	 * 
	 * @return A list of the keys of all system properties
	 * @see #getProperties()
	 */
	public static List<String> getSystemPropertyKeys() {
		List<String> properties = new ArrayList<>();
		Enumeration<Object> propertyKeys = System.getProperties().keys();
		while (propertyKeys.hasMoreElements()) {
			String propertyKey = (String) propertyKeys.nextElement();
			properties.add(propertyKey);
		}
		return properties;
	}

	/**
	 * Retrieves a {@link java.util.List java.util.List&lt;String&gt;} of all
	 * system properties.<br />
	 * For a list of the corresponding keys call {@link #getPropertyKeys()}
	 * 
	 * @return A list of the values of all system properties
	 * @see #getPropertyKeys()
	 */
	public static List<String> getSystemProperties() {
		List<String> properties = new ArrayList<>();
		Iterator<Object> propertyValueIterator = System.getProperties().values().iterator();
		while (propertyValueIterator.hasNext()) {
			String propertyKey = (String) propertyValueIterator.next();
			properties.add(propertyKey);
		}
		return properties;
	}

	/**
	 * Retrieves the system property at index <b>index</b> from the
	 * {@link java.util.List java.util.List&lt;String&gt;} which is returned by
	 * {@link #getProperties()}
	 * 
	 * @param index
	 *            - The index of the property
	 * @return The value of the Property as String or null if <b>index</b> is
	 *         out of bounds of the underlying property map.
	 * @see java.lang.System#getProperty(String)
	 * @see java.lang.System#getProperties()
	 */
	public static String getSystemPropertyByIndex(int index) {
		List<String> properties = getSystemProperties();
		if (index < 0 || index >= properties.size()) {
			return null;
		} else {
			return properties.get(index);
		}
	}

	/**
	 * Retrieves the system property key at index <b>index</b> from the
	 * {@link java.util.List java.util.List&lt;String&gt;} which is returned by
	 * {@link #getPropertyKeys()}
	 * 
	 * @param index
	 *            - The index of the property key
	 * @return The key of the Property as String or null if <b>index</b> is out
	 *         of bounds of the underlying property map.
	 */
	public static String getSystemPropertyKeyByIndex(int index) {
		List<String> propertyKeys = getSystemPropertyKeys();
		if (index < 0 || index >= propertyKeys.size()) {
			return null;
		} else {
			return propertyKeys.get(index);
		}
	}

	/**
	 * Returns the index of the first occurrence of the specified key in the
	 * list of system-property-keys, or -1 if the list does not contain the key.
	 * 
	 * @param propertyKey
	 *            - The key to search for
	 * @return The index of the first occurrence of the specified key in the
	 *         list of system-property-keys, or -1 if the list does not contain
	 *         the key.
	 */
	public static int indexOfSystemPropertyKey(String propertyKey) {
		return getSystemPropertyKeys().indexOf(propertyKey);
	}

	/**
	 * Returns the temporary directory as File object
	 * 
	 * @return The temporary directory as File object
	 */
	public static File getTempDir() {
		return new File(System.getProperty(OS.TMP_DIR_KEY));
	}

	/**
	 * Returns the current working directory as File object
	 * 
	 * @return The current working directory as File object
	 */
	public static File getWorkingDir() {
		return new File(System.getProperty(OS.WORKING_DIR_KEY));
	}

	/**
	 * The command used to launch the program, jvm args as well as the
	 * <code><b>"java [...] (-jar)"</b></code> command are not included<br />
	 * For example: <code><b>Foo arg1 arg2</b></code>
	 */
	public static String getLaunchCommand() {
		return System.getProperty(OS.LAUNCH_COMMAND_KEY);
	}

	/*
	 * INFO: identify OS via org.apache.commons.lang3.SystemUtils
	 */

}
