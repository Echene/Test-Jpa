/**
 * 
 */
package banque.utils;

import java.security.SecureRandom;
import java.util.Random;

/**
 * @author Emmanuel
 *
 */
public class RandomGenerator {

	private static final String c1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String c2 = "abcdefghijklmnopqrstuvwxyz";

	public static String generateRandomU(int length) {
		Random random = new SecureRandom();
		if (length <= 0) {
			throw new IllegalArgumentException("String length must be a positive integer");
		}

		StringBuilder sb = new StringBuilder(length);
		for (int i = 0; i < length; i++) {
			sb.append(c1.charAt(random.nextInt(c1.length())));
		}

		return sb.toString();
	}
	
	public static String generateRandomL(int length) {
		Random random = new SecureRandom();
		if (length <= 0) {
			throw new IllegalArgumentException("String length must be a positive integer");
		}

		StringBuilder sb = new StringBuilder(length);
		for (int i = 0; i < length; i++) {
			sb.append(c2.charAt(random.nextInt(c2.length())));
		}

		return sb.toString();
	}
}
