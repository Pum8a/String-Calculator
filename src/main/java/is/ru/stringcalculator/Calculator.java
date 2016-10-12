package is.ru.stringcalculator;
import java.io.*;
public class Calculator {

	public static int add(String text){
		if(text.equals(""))
			return 0;
		/*else if(text.contains(",")){
			String [] numbers = text.split(",");
			return toInt(numbers[0]) + toInt(numbers[1]);
		}*/
		else if(text.contains(",")) {
			String [] numbers = text.split(",");
			int sum = 0;
			for(int i = 0; i < numbers.length;i++) {
				sum += toInt(numbers[i]);
			}
			return sum;
		}

		else
			return 1;
	}

	private static int toInt(String text) {
		return Integer.parseInt(text);
	}
}