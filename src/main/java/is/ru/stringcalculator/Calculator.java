package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
		if(text.equals(""))
			return 0;
		if(text > 1) {
			if(text.contains(",")) {
				String [] numb = text.split(",");
				int sum = IntStream.of(num).sum();
				return sum;
			}
		}

		else if(text.contains(",")){
			String [] numbers = text.split(",");
			return toInt(numbers[0]) + toInt(numbers[1]);
		}
		else
			return 1;
	}

	private static int toInt(String text) {
		return Integer.parseInt(text);
	}
}