package calculation;

public class SumCalculation extends Calculation {
    @Override
    public String calculate(String firstElement, String secondElement) {
        if (secondElement.startsWith("\"")) {
            return firstElement + secondElement.replace("\"", "");
        }
        throw new IllegalArgumentException("Второй операнд должен быть строкой");
    }
}
