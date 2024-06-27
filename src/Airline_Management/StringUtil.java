package Airline_Management;

public class StringUtil {
public static  int
countOccurrences(String str,char ch)
{
	int count= 0;
	for(int i =0; i<str.length();i++) {
		if (str.charAt(i)==ch) {
			count++;
			
		}
	}
	
	return count;
	
}
public static String
reverseString(String str) {
	return new
			StringBuilder(str).reverse().toString();
	
}
public static boolean 
isPalindrome(String str) {
	String reversed= reverseString(str);
	return str.equals(reversed);
	
}
public static String
capitalizeWord(String str) {
	String[]words = str.split("\\s+");
	StringBuilder capitalized = new StringBuilder();
	 for (String word : words) {
		 capitalized.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase()).append(" ");
		 
}
	 return capitalized.toString().trim();
}
}
