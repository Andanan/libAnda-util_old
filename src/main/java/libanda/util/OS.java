package libanda.util;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/**
 * The OS class contains some static fields which are holding the value of the
 * similarly named system properties, along with some Methods for retrieving
 * system properties and checking which is the users OS.
 * 
 * @author Andanan
 * @lastModified 2017-03-01
 * @version 1.0.0
 */
@Deprecated // org.apache.commons.lang3.SystemUtils implements all of this :(
public abstract class OS {

	/**
	 * Character which is used to separate paths in path-lists, like for example
	 * in {@link #CLASSPATH JAVA_CLASSPATH}<br />
	 * (Retrieves value by calling:
	 * <b><code>System.getProperty("path.separator")</code></b> ) <br />
	 * <br />
	 * Default value: ":"
	 */
	public static final String PATH_SEPARATOR = System.getProperty("path.separator");
	/**
	 * Character which is used to separate files and directories in paths<br />
	 * (Retrieves value by calling:
	 * <b><code>System.getProperty("file.separator")</code></b> ) <br />
	 * <br />
	 * Default values: [Windows: "\"] [Linux/Unix: "/"]
	 */
	public static final String FILE_SEPARATOR = System.getProperty("file.separator");
	/**
	 * Character which is used to separate lines in for example files or in the
	 * terminal (<b>Line feed</b>)<br />
	 * (Retrieves value by calling:
	 * <b><code>System.getProperty("line.separator")</code></b> ) <br />
	 * <br />
	 * Default value: [Windows: "\r\n"] [Mac: "\r"] [Linux/Unix: "\n"]
	 */
	public static final String LINE_SEPARATOR = System.getProperty("line.separator");
	/**
	 * Character or character sequence which is used to separate lines in for
	 * example files or in the terminal (<b>Line feed</b>)<br />
	 * (Retrieves value by calling:
	 * <b><code>System.getProperty("line.separator")</code></b> ) <br />
	 * (Clone of {@link #LINE_SEPARATOR OS.LINE_SEPARATOR})<br />
	 * <br />
	 * Default value: [Windows: "\r\n"] [Mac: "\r"] [Linux/Unix: "\n"]
	 */
	public static final String LF = LINE_SEPARATOR;
	/**
	 * The system dependent line-feed/new-line char sequence for Windows<br />
	 * (A carriage return character followed by a new line character: "\r\n" )
	 */
	public static final String LF_WIN = "\r\n";
	/**
	 * The system dependent line-feed/new-line char for Mac<br />
	 * (A carriage return character: "\r" )
	 */
	public static final String LF_MAC = "\r";
	/**
	 * The system dependent line-feed/new-line char for Unix/Linux<br />
	 * (A new line character: "\n" )
	 */
	public static final String LF_UNIX = "\n";
	/**
	 * The system dependent path to the temporary directory<br />
	 * (Retrieves value by calling:
	 * <b><code>System.getProperty("java.io.tmpdir")</code></b> ) <br />
	 */
	public static final String TMP_DIR = System.getProperty("java.io.tmpdir");
	/**
	 * TODO: Add description for WORKING_DIR
	 */
	public static final String WORKING_DIR = System.getProperty("user.dir");
	/**
	 * Path to the user home directory as String.<br />
	 * (Retrieves value by calling:
	 * <b><code>System.getProperty("user.home")</code></b> )<br />
	 * <br />
	 * Default values: [Windows:
	 * "C:{@literal \}users\{@literal <}USERNAME{@literal >}"] [Linux:
	 * "/home/{@literal <}USERNAME{@literal >"]
	 */
	public static final String USER_HOME = System.getProperty("user.home");
	/**
	 * Path to the home directory of the currently active Java install.<br />
	 * (Retrieves value by calling:
	 * <b><code>System.getProperty("java.home")</code></b> )
	 */
	public static final String JAVA_HOME = System.getProperty("java.home");
	/**
	 * TODO: Add description for LIBRARIES
	 */
	public static final String LIBRARIES = System.getProperty("java.library.path");
	/**
	 * TODO: Add description for CLASSPATH
	 */
	public static final String CLASSPATH = System.getProperty("java.class.path");
	/**
	 * The name of the current user.<br />
	 * (Retrieves value by calling:
	 * <b><code>System.getProperty("user.name")</code></b> )
	 */
	public static final String USER_NAME = System.getProperty("user.name");
	/**
	 * The country code of the current locale.<br />
	 * (Retrieves value by calling:
	 * <b><code>System.getProperty("user.country")</code></b> )
	 */
	public static final String COUNTRY = System.getProperty("user.country");
	/**
	 * The language code of the current locale.<br />
	 * (Retrieves value by calling:
	 * <b><code>System.getProperty("user.language")</code></b> )
	 */
	public static final String LANGUAGE = System.getProperty("user.language");
	/**
	 * TODO: Add description for OS_NAME
	 */
	public static final String OS_NAME = System.getProperty("os.name");
	/**
	 * The architecture of the machine.<br />
	 * Normally either <code><b>amd64</b></code>, <code><b>x86</b></code>,
	 * <code><b>i386</b></code>, <code><b>sparc</b></code> or
	 * <code><b>ppc</b></code><br />
	 * (Retrieves value by calling:
	 * <b><code>System.getProperty("os.arch")</code></b> )
	 */
	public static final String OS_ARCH = System.getProperty("os.arch");
	/**
	 * TODO: Add description for OS_VERSION
	 */
	public static final String OS_VERSION = System.getProperty("os.version");
	/**
	 * TODO: Add description for JAVA_VERSION
	 */
	public static final String JAVA_VERSION = System.getProperty("java.specification.version");
	/**
	 * The command used to launch the program, jvm args as well as the
	 * <code><b>"java [...] (-jar)"</b></code> command are not included<br />
	 * For example: <code><b>SampleApp arg1 arg2</b></code><br />
	 * (Retrieves value by calling:
	 * <b><code>System.getProperty("sun.java.command")</code></b> )
	 */
	public static final String LAUNCH_COMMAND = System.getProperty("sun.java.command");

	/**
	 * Retrieves a {@link java.util.List java.util.List&lt;String&gt;} of all
	 * system property keys.<br />
	 * For a list of the corresponding values call {@link #getProperties()}
	 * 
	 * @return A list of the keys of all system properties
	 * @see #getProperties()
	 */
	public static List<String> getPropertyKeys() {
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
	public static List<String> getProperties() {
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
	public static String getPropertyByIndex(int index) {
		List<String> properties = getProperties();
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
	public static String getPropertyKeyByIndex(int index) {
		List<String> propertyKeys = getPropertyKeys();
		if (index < 0 || index >= propertyKeys.size()) {
			return null;
		} else {
			return propertyKeys.get(index);
		}
	}

	/**
	 * @return True if and only if OS is Windows, else returns false
	 */
	@Deprecated // org.apache.commons.lang.SystemUtils contains this already
	public static boolean isWindows() {
		return (OS_NAME.contains("win"));
	}

	/**
	 * @return True if and only if OS is MacOS, else returns false
	 */
	@Deprecated // org.apache.commons.lang.SystemUtils contains this already
	public static boolean isMac() {
		return (OS_NAME.contains("mac"));
	}

	/**
	 * @return True if and only if OS is Unix or Linux, else returns false
	 */
	@Deprecated // org.apache.commons.lang.SystemUtils contains this already
	public static boolean isUnix() {
		return (OS_NAME.contains("nix") || OS_NAME.contains("nux") || OS_NAME.contains("aix"));
	}

	/**
	 * @return True if and only if OS is Solaris, else returns false
	 */
	@Deprecated // org.apache.commons.lang.SystemUtils contains this already
	public static boolean isSolaris() {
		return (OS_NAME.contains("sunos"));
	}

	/**
	 * @return True if and only if OS is either Windows, MacOS, Unix, Linux or
	 *         Solaris, else returns false
	 * @see #isWindows()
	 * @see #isMac()
	 * @see #isUnix()
	 * @see #isSolaris()
	 */
	@Deprecated // org.apache.commons.lang.SystemUtils contains this already
	public static boolean isKnown() {
		return isWindows() || isMac() || isUnix() || isSolaris();
	}
}
