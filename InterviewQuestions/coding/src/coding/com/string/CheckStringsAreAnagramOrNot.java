package coding.com.string;

import java.util.Arrays;

public class CheckStringsAreAnagramOrNot {

	public static void main(String[] args) {
		String str1 = "geeksforgeeks";
		String str2 = "forgeeksgeeks";
		System.out.println(checkAnagram(str1, str2));

	}

	private static boolean checkAnagram(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		char charStr1[] = convertStringToCharArray(str1);
		char charStr2[] = convertStringToCharArray(str2);
		Arrays.sort(charStr1);
		Arrays.sort(charStr2);
		if (Arrays.equals(charStr1, charStr2) == true) {
			return true;
		}
		return false;
	}

	private static char[] convertStringToCharArray(String stirng) {
		return stirng.toCharArray();
	}

}
