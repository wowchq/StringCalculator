import utils.StringCalculatorUtils;

public class Main {
    public static void main(String[] args) {
        StringCalculatorUtils stringCalculatorUtils = new StringCalculatorUtils();
        StringCalculator stringCalculator = new StringCalculator(stringCalculatorUtils);
        stringCalculator.calculate();
    }
}
