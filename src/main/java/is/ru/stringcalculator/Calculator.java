package is.ru.stringcalculator;
import java.io.*;
public class Calculator {

	public static int add(String text){
		if(text.equals(""))
			return 0;
		if(text.contains(","))
			return plusMultiNumb(text);
		else
			return 1;
	}

	private static int toInt(String text) {
		return Integer.parseInt(text);
	}

	private static int plusMultiNumb(String text) {
		/*if(text.contains("\n")) {
			text = text.replace("\n",",");
		}

		String [] numbers = text.split(",");
		*/
		String [] numbers = splitNumbers(text);
		int sum = 0;

		for(int i = 0; i < numbers.length; i++) {
			sum += toInt(numbers[i]);
		}

		return sum;
	}
	private static String[] splitNumbers(String text) {
		if(text.contains("\n")) {
			text = text.replace("\n",",");
		}
		String [] numbers = text.split(",");
		return numbers;
	}
}