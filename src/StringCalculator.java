import calculation.*;
import utils.StringCalculatorUtils;

import java.util.Scanner;

public class StringCalculator {

    private StringCalculatorUtils stringCalculatorUtils;

    public StringCalculator(StringCalculatorUtils stringCalculatorUtils) {
        this.stringCalculatorUtils = stringCalculatorUtils;
    }

    public void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение");
        String userString = scanner.nextLine();
        stringCalculatorUtils.isValidArgument(userString);
        String[] elements = stringCalculatorUtils.prepareString(userString);
        String firstElement = elements[0];
        String operation = elements[1];
        String secondElement = elements[2];
        String result;
        Calculation calculation;
        switch (operation) {
            case "+":
                calculation = new SumCalculation();
                result = calculation.calculate(firstElement, secondElement);
                break;
            case "-":
                calculation = new MinusCalculation();
                result = calculation.calculate(firstElement, secondElement);
                break;
            case "*":
                calculation = new MultiplyCalculation();
                result = calculation.calculate(firstElement, secondElement);
                break;
            case "/":
                calculation = new DivideCalculation();
                result = calculation.calculate(firstElement, secondElement);
                break;
            default:
                throw new IllegalArgumentException("Некорректный оператор");
        }
        if (result.length() > 40) {
            result = result.substring(0,40) + "...";
        }
        System.out.println("\"" + result + "\"");
    }
}
