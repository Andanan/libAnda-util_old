package libanda.util;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class OS {
	
	/**
	 * <p>
	 * Character which is used to separate paths in path-lists, 
	 * like for example in "OS.JAVA_CLASSPATH"<br />
	 * (Retrieves value with: <code>System.getProperty("path.separator")</code> )
	 * </p>
	 * Default value: ":"
	 */
	public static final String PATH_SEPARATOR = System.getProperty("path.separator");
	/**
	 * 
	 */
	public static final String FILE_SEPARATOR = System.getProperty("file.separator");
	public static final String LINE_SEPARATOR = System.getProperty("line.separator");
	public static final String LF = LINE_SEPARATOR;
	
	public static final String TMP_DIR = System.getProperty("java.io.tmpdir");
	public static final String WORKING_DIR = System.getProperty("user.dir");
	public static final String USER_HOME = System.getProperty("user.home");
	public static final String JAVA_HOME = System.getProperty("java.home");
	public static final String LIBRARIES = System.getProperty("java.library.path");
	public static final String CLASSPATH = System.getProperty("java.class.path");
	
	public static final String USER_NAME = System.getProperty("user.name");
	public static final String COUNTRY = System.getProperty("user.country");
	public static final String LANGUAGE = System.getProperty("user.language");
	
	public static final String OS_NAME = System.getProperty("os.name");
	public static final String OS_ARCH = System.getProperty("os.arch");
	public static final String OS_VERSION = System.getProperty("os.version");
	public static final String JAVA_VERSION = System.getProperty("java.specification.version");
	
	public static final String LAUNCH_COMMAND = System.getProperty("sun.java.command");
	
	/**
	 * @return The names of all system properties as <code>java.util.List&lt;String&gt;</code>
	 */
	public static List<String> getPropertyNames() {
		List<String> properties = new ArrayList<>();
		Enumeration<Object> propertyKeys = System.getProperties().keys();
		while (propertyKeys.hasMoreElements()) {
			Object object = (Object) propertyKeys.nextElement();
			properties.add(object.toString());
		}
		return properties;
	}
	
	/**
	 * @return True if and only if  OS is Windows
	 */
	public static boolean isWindows() {
		return (OS_NAME.contains("win"));
	}

	/**
	 * @return True if and only if  OS is MacOS
	 */
	public static boolean isMac() {
		return (OS_NAME.contains("mac"));
	}

	/**
	 * @return True if and only if  OS is Unix or Linux
	 */
	public static boolean isUnix() {
		return (OS_NAME.contains("nix") || OS_NAME.contains("nux") || OS_NAME.contains("aix") );
	}

	/**
	 * @return True if and only if  OS is Solaris
	 */
	public static boolean isSolaris() {
		return (OS_NAME.contains("sunos"));
	}
	
	/**
	 * @return True if and only if OS is either Windows, MacOS, Unix, Linux or Solaris
	 */
	public static boolean isKnown() {
		return isWindows() || isMac() || isUnix() || isSolaris();
	}
	
	public static void main(String[] args) {
		// TODO TMP
		List<String> properties = getPropertyNames();
		for(String property : properties){
			String value = System.getProperty(property);
			System.out.println(property + ":\n  " + value);
		}
	}
}
