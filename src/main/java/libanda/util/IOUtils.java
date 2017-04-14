package libanda.util;

import org.apache.commons.lang3.SystemUtils;

public class IOUtils {
	
	/**
	 * Clear the console on windows and Unix(-like) operating systems.<br />
	 * Found on <a href="http://stackoverflow.com/questions/10241217/how-to-clear-console-in-java">stackoverflow.com</a>
	 * @exception UnsupportedOperationException If the console can not be cleared
	 */
	public static void cls() throws UnsupportedOperationException {
		if (SystemUtils.IS_OS_WINDOWS) {
			try {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} catch (Exception e) {
				// do nothing -> throw UnsupportedOpEx later on
			}
		} else if(SystemUtils.IS_OS_UNIX) {
			System.out.print("\033[H\033[2J");
			System.out.flush();
		}
		
		// not possible to clear screen: throw exception
		throw new UnsupportedOperationException("Clearing console not supported. ");
		
	}
	
}
