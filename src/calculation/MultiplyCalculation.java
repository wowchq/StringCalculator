package calculation;

public class MultiplyCalculation extends Calculation {
    @Override
    public String calculate(String firstElement, String secondElement) {
        int multiplier = Integer.parseInt(secondElement);
        if (multiplier < 1 || multiplier > 10) throw new IllegalArgumentException("Число должно быть в диапозоне от 1 до 10");
        return firstElement.repeat(multiplier);
    }
}
