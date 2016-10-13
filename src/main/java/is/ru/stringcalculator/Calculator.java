package is.ru.stringcalculator;

import java.io.*;
import java.util.*;

public class Calculator {

	public static int add(String text) {
		if (text.contains("//")) {
			text = differentDeli(text);
		}

		if (text.equals("")) {
			return 0;
		}

		if (text.contains(",")) {
			return plusMultiNumb(text);
		}

		else {
			return 1;
		}
	}

	private static int toInt(String text) {
		return Integer.parseInt(text);
	}

	private static int plusMultiNumb(String text) {
		String [] numbers = splitNumbers(text);
		int sum = 0;
		List negaNumb = new ArrayList();

		for (int i = 0; i < numbers.length; i++) {
			int numbInt = toInt(numbers[i]);
			
			if (numbInt < 0) {
				negaNumb.add(numbInt);
			}
			
			if (numbInt <= 1000) {
				sum += numbInt;
			}
		}
		
		if (negaNumb.size() > 0) {
			throwingException(negaNumb);
		}

		return sum;
	}

	private static String[] splitNumbers(String text) {
		if (text.contains("\n")) {
			text = text.replace("\n",",");
		}
		
		String [] numbers = text.split(",");
		
		return numbers;
	}

	private static void throwingException(List negaNumb) {
		throw new RuntimeException("Negatives not allowed: " + negaNumb.toString());
	}

	private static String differentDeli(String text) {
		String delichar = ",";
		
		delichar = text.substring(2,3);
		text = text.replaceAll(delichar,",");
		text = text.substring(4,text.length());
		
		return text;
	}

}