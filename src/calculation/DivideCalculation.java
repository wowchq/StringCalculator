package calculation;

public class DivideCalculation extends Calculation {
    @Override
    public String calculate(String firstElement, String secondElement) {
        int divisor = Integer.parseInt(secondElement);
        if (divisor < 1 || divisor > 10) throw new IllegalArgumentException("Число должно быть в диапозоне от 1 до 10");
        return firstElement.substring(0, firstElement.length() / divisor);
    }
}
