package Airline_Management;

public class WrapperUtiltyClass {
public static Integer
findMax(Integer[]numbers) {
	Integer max = numbers[0];
	for(Integer num : numbers) {
	if(num > max) {
		max = num;
		
	}
}

	return max;

} 
public static Double
  calculateAverage (Double[]numbers) {
	Double sum = 0.0;
	for (Double num : numbers) {
		sum+= num;
		
	}
	return sum / numbers.length;
}
	
	public static Boolean[]	convertToBooleanArray(String binaryString) {
		Boolean[]boolArray = new Boolean[binaryString.length()];
		for(int i =0; i< binaryString.length(); i++) {
			boolArray[i]=binaryString.charAt(i)=='1';
			
		}
		return boolArray;
	}
	public static String 
	convertToBinaryString(Boolean[]booleanArray) {
		StringBuilder binaryString =new StringBuilder();
		
		for (Boolean bool: booleanArray) {
			binaryString.append(bool ? "1":"0");
			
		}
		return
				binaryString.toString();
	}
}
